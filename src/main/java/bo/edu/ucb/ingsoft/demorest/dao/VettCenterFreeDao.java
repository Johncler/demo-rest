package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.VeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class VettCenterFreeDao {
    @Autowired
    public DataSource dataSource;

    @Autowired
    public SequenceDao sequenceDao;

    public VeterinarioDto crearVeterinario (VeterinarioDto veterinarioDto){
        veterinarioDto.setVeterId(sequenceDao.getPrimaryKeyForTable("veterinario"));
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO veterinario VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, veterinarioDto.getVeterId());
            pst.setInt(2, veterinarioDto.getUservetoId());
            pst.setInt(3, veterinarioDto.getVetavoId());
            pst.setInt(4,veterinarioDto.getImgvetiId());
            pst.setString(5,veterinarioDto.getNomveto());
            pst.setString(6,veterinarioDto.getAppveto());
            pst.setString(7,veterinarioDto.getEmailveto());
            pst.setString(8,veterinarioDto.getDepaveto());
            pst.setString(9,veterinarioDto.getLugarfveto());
            pst.executeUpdate();
            pst.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return veterinarioDto;
    }

    public VeterinarioDto findVeterinarioDtoById(Integer veteid){
        VeterinarioDto result = new VeterinarioDto();
        try (Connection cn = dataSource.getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT id_veterinario,id_usuario,id_veterinaria,id_imagen,nombre," +
                     "apellido,email,departamento,lugar_formacion FROM veterinario WHERE veterinario_id ="+ veteid);){
            pst.setInt(1,veteid);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                result.setVeterId(rs.getInt("id_veterinario"));
                result.setUservetoId(rs.getInt("id_usuario"));
                result.setVetavoId(rs.getInt("id_veterinaria"));
                result.setImgvetiId(rs.getInt("id_imagen"));
                result.setNomveto(rs.getString("nombre"));
                result.setAppveto(rs.getString("apellido"));
                result.setEmailveto(rs.getString("email"));
                result.setDepaveto(rs.getString("departamento"));
                result.setLugarfveto(rs.getString("lugar_formacion"));
            }
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public List<VeterinarioDto> finAllVeterinarioDtos(){
        List<VeterinarioDto> result = new ArrayList<>();

        try (Connection cn = dataSource.getConnection();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT id_veterinario,id_usuario,id_veterinaria,id_imagen,nombre,apellido,email," +
                     "departamento,lugar_formacion FROM veterinario");){// WHERE veterinario_id = ?");){

            while (rs.next()){
                VeterinarioDto vet = new VeterinarioDto();
                vet.setVeterId(rs.getInt("id_veterinario"));
                vet.setUservetoId(rs.getInt("id_usuario"));
                vet.setVetavoId(rs.getInt("id_veterinaria"));
                vet.setImgvetiId(rs.getInt("id_imagen"));
                vet.setNomveto(rs.getString("nombre"));
                vet.setNomveto(rs.getString("apellido"));
                vet.setNomveto(rs.getString("email"));
                vet.setNomveto(rs.getString("departamento"));
                vet.setNomveto(rs.getString("lugar_formacion"));
                result.add(vet);
            }
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
