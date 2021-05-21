package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@Service
public class RegistrarVeterinarioDao {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public RegistrarVeterinarioDto registrarV (RegistrarVeterinarioDto regisDto) {
        regisDto.setVeterId(sequenceDao.getPrimaryKeyForTable("veterinario"));
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO veterinario VALUE ?,?,?,?,?,?,?,?,?");
            pst.setInt(1,regisDto.getVeterId());
            //pst.setInt(2,regisDto.getUservetoId());
            //pst.setInt(3,regisDto.getVetavoId());
            pst.setInt(4, regisDto.getImgvetiId());
            pst.setString(5,regisDto.getNomveto());
            pst.setString(6,regisDto.getAppveto());
            pst.setString(7,regisDto.getEmailveto());
            pst.setString(8,regisDto.getDepaveto());
            pst.setString(9,regisDto.getLugarfveto());
            pst.executeUpdate();
            pst.close();

            /*pst = con.prepareStatement("INSERT INTO veterinaria VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setInt(1,veterinariaDto.getVeterinariaId());
            pst.setString(2,veterinariaDto.getCiudvete());
            pst.setString(3,veterinariaDto.getDirvete());
            pst.setString(4,veterinariaDto.getFonovete());
            pst.executeUpdate();
            pst.close();*/

        }catch (Exception e){
            e.printStackTrace();
        }
        return regisDto;
    }
    public VeterinarioDto findVeterinarioDtoById(Integer veterinarioId){
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

}

