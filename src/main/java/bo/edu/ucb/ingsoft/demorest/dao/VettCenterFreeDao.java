package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.BVettCenterFreeDto;
import bo.edu.ucb.ingsoft.demorest.dto.BusquedaVeeterinario;
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
    public DataSource dataSource;//Llamada al datas source

    @Autowired
    public SequenceDao sequenceDao;

    /*public VeterinarioDto crearVeterinario (VeterinarioDto veterinarioDto){
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
    }*/

    /*public BVettCenterFreeDto findVeterinarioDtoById(BusquedaVeeterinario idsearch){
        BVettCenterFreeDto result = new BVettCenterFreeDto();
        try (Connection cn = dataSource.getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT ca.calificacion,ve.nombre,es.especialidad,ve.departamento FROM calificacion ca JOIN usuario uss ON ca.id_usuario = uss.id_usuario JOIN veterinario ve ON uss.id_usuario = ve.id_usuario JOIN veterinario_especialidad vdd ON ve.id_veterinario = vdd.id_veterinario JOIN especialidad es ON vdd.id_especialidad = es.id_especialidad WHERE ve.nombre LIKE ? OR ve.departamento LIKE ?");){
            pst.setString(1,"%"+idsearch.getNombre() +"%");
            pst.setString(2,"%"+idsearch.getDeparatamento() +"%");
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
    }*/
    //funncion de busqueda de registros de nombre y por departamento
    public List<BVettCenterFreeDto> finAllVeterinarioDtos(BusquedaVeeterinario idsearch){
        List<BVettCenterFreeDto> result = new ArrayList<>();//Array donde se almacenara todos los registros

        try (Connection cn = dataSource.getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT ca.calificacion,ve.nombre,es.especialidad,ve.departamento FROM calificacion ca JOIN usuario uss ON ca.id_usuario = uss.id_usuario JOIN veterinario ve ON uss.id_usuario = ve.id_usuario JOIN veterinario_especialidad vdd ON ve.id_veterinario = vdd.id_veterinario JOIN especialidad es ON vdd.id_especialidad = es.id_especialidad WHERE ve.nombre LIKE ? OR ve.departamento LIKE ?");){
            pst.setString(1,"%"+idsearch.getNombre() +"%");
            pst.setString(2,"%"+idsearch.getDeparatamento() +"%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                BVettCenterFreeDto vet = new BVettCenterFreeDto();
                vet.setCal(rs.getDouble("calificacion"));
                vet.setNom(rs.getString("nombre"));
                vet.setEspeci(rs.getString("especialidad"));
                vet.setDepart(rs.getString("departamento"));
                result.add(vet);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
