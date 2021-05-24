package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.*;
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
public class RegistrarVeterinarioDao {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public RegistrarVeterinarioDto registrarV (RegistrarVeterinarioDto regisDto) {
        regisDto.setVeterId(sequenceDao.getPrimaryKeyForTable("veterinario"));
        regisDto.setVeterinariaId(sequenceDao.getPrimaryKeyForTable("veterinaria"));
        regisDto.setUsuarioId(sequenceDao.getPrimaryKeyForTable("usuario"));
        //regisDto.setEspeId(sequenceDao.getPrimaryKeyForTable("especialidad"));
        try (Connection con = dataSource.getConnection();
             PreparedStatement pst1 = con.prepareStatement("INSERT INTO usuario VALUES (?,?,?)");){

            pst1.setInt(1,regisDto.getUsuarioId());
            pst1.setString(2,regisDto.getNomuser());
            pst1.setString(3,regisDto.getPassword());
            pst1.executeUpdate();

            PreparedStatement pst2 = con.prepareStatement("INSERT INTO veterinaria(id_veterinaria,id_tipo,nombre,direccion,ciudad,telefono,email,horario_atencion) VALUES (?,?,?,?,?,?,?,?)");
            pst2.setInt(1,regisDto.getVeterinariaId());
            pst2.setInt(2,regisDto.getTipoveteId());
            pst2.setString(3,regisDto.getNomvete());
            pst2.setString(4,regisDto.getDirvete());
            pst2.setString(5,regisDto.getDepaveto());
            pst2.setString(6,regisDto.getFonovete());
            pst2.setString(7,regisDto.getEmailveto());
            pst2.setString(8,regisDto.getHdavete());
            pst2.executeUpdate();
            pst2.close();

            PreparedStatement pst = con.prepareStatement("INSERT INTO veterinario VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setInt(1,regisDto.getVeterId());
            pst.setInt(2, regisDto.getUsuarioId());
            pst.setInt(3, regisDto.getVeterinariaId());
            pst.setInt(4, regisDto.getImgvetiId());
            pst.setString(5,regisDto.getNomveto());
            pst.setString(6,regisDto.getAppveto());
            pst.setString(7,regisDto.getEmailveto());
            pst.setString(8,regisDto.getDepaveto());
            pst.setString(9,regisDto.getLugarfveto());
            pst.executeUpdate();
            pst.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return regisDto;
    }
    public RegistrarVeterinarioDto findVeterinarioDtoById(Integer veterinarioId){
        VeterinarioDto resul = new VeterinarioDto();
        try (
                Connection con = dataSource.getConnection();
                PreparedStatement pst = con.prepareStatement("SELECT veterinario(?,?,?,?,?,?,?,?,?)")){
            pst.setInt(1,resul.getVeterId());
            pst.setInt(2,resul.getUservetoId());
            pst.setInt(3,resul.getVetavoId());
            pst.setInt(4,resul.getImgvetiId());
            pst.setString(5,resul.getNomveto());
            pst.setString(6,resul.getAppveto());
            pst.setString(7,resul.getEmailveto());
            pst.setString(8,resul.getDepaveto());
            pst.setString(9,resul.getLugarfveto());
            ResultSet rs = pst.executeQuery();
            if (rs.next()){

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public List<RegistrarVeterinarioDto> finAllRegistrarVeterinarioDaos(){
        List<RegistrarVeterinarioDto> result = new ArrayList<>();

        try (Connection cn = dataSource.getConnection();
             PreparedStatement pst = cn.prepareStatement("SELECT vo.id_veterinario, vo.id_imagen, vo.nombre, vo.apellido,vo.email, vo.departamento, vo.lugar_formacion, va.id_veterinaria," +
                     "va.ciudad, va.direccion, va.telefono,va.horario_atencion, u.id_usuario,u.nombre_usuario,u.contraseña" +
                     "FROM veterinario vo" +
                     "JOIN veterinaria va ON vo.id_veterinaria = va.id_veterinaria" +
                     "JOIN usuario u ON vo.id_usuario = u.id_usuario");){

            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                RegistrarVeterinarioDto registrar = new RegistrarVeterinarioDto();
                registrar.setVeterId(rs.getInt("id_veterinario"));
                registrar.setNomuser(rs.getString("nombre_usuario"));
                registrar.setPassword(rs.getString("contraseña"));
                registrar.setNomvete(rs.getString("nombre"));
                registrar.setDepaveto(rs.getString("ciudad"));
                registrar.setDirvete(rs.getString("direccion"));
                registrar.setFonovete(rs.getString("telefono"));
                registrar.setNomvete(rs.getString("nombre"));
                registrar.setAppveto(rs.getString("apellido"));
                registrar.setEmailveto(rs.getString("email"));
                registrar.setEmailveto(rs.getString("departamento"));
                registrar.setLugarfveto(rs.getString("lugar_formacion"));
                result.add(registrar);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}

