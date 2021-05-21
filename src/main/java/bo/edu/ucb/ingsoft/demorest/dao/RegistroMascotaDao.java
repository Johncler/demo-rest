package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RegistroMascotaDao {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public MascotaDto crearMascota (MascotaDto mascotaDto){
        mascotaDto.setMascoId(sequenceDao.getPrimaryKeyForTable("mascota"));
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO mascota VALUE ?,?,?,?,?,?,?,?,?,?");
            pst.setInt(1, mascotaDto.getMascoId());
            pst.setInt(2,mascotaDto.getEspmId());
            pst.setInt(3,mascotaDto.getRazamId());
            pst.setInt(4,mascotaDto.getImgmId());
            pst.setInt(5,mascotaDto.getDuemId());
            pst.setString(6,mascotaDto.getNommas());
            pst.setString(7,mascotaDto.getTamas());
            pst.setString(8,mascotaDto.getColmas());
            pst.setString(9,mascotaDto.getSexmas());
            pst.setString(10,mascotaDto.getFrmas());
            pst.executeUpdate();
            con.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return mascotaDto;
    }
    public MascotaDto findMascotaDtoById(Integer mascoId){
        MascotaDto result = new MascotaDto();
        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT id_mascota,id_especie,id_raza," +
                    "id_imagen,id_dueño,nombre_mascota,tamaño,color,sexo,fecha_registro FROM mascota" +
                        " WHERE id_mascota = " + mascoId);
                    if (rs.next()){
                        result.setMascoId(rs.getInt("id_mascota"));
                        result.setEspmId(rs.getInt("id_especie")) ;
                        result.setRazamId(rs.getInt("id_raza"));
                        result.setImgmId(rs.getInt("id_imagen"));
                        result.setDuemId(rs.getInt("id_dueño"));
                        result.setNommas(rs.getString("nombre_mascota"));
                        result.setTamas(rs.getString("tamaño"));
                        result.setColmas(rs.getString("color"));
                        result.setSexmas(rs.getString("sexo"));
                        result.setFrmas(rs.getString("fecha_registro"));

                    }else {
                            result = null;
                    }
                    cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    public List<MascotaDto> finAllMascotaDtos(){
        List<MascotaDto> result = new ArrayList<>();

        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT id_mascota,id_especie,id_raza," +
                    "id_imagen,id_dueño,nombre_mascota,tamaño,color,sexo,fecha_registro FROM mascota");
            while (rs.next()){
                MascotaDto mascot = new MascotaDto();
                mascot.setMascoId(rs.getInt("id_mascota"));
                mascot.setEspmId(rs.getInt("id_especie"));
                mascot.setRazamId(rs.getInt("id_raza"));
                mascot.setImgmId(rs.getInt("id_imagen"));
                mascot.setDuemId(rs.getInt("id_dueño"));
                mascot.setNommas(rs.getString("nombre_mascota"));
                mascot.setTamas(rs.getString("tamaño"));
                mascot.setColmas(rs.getString("color"));
                mascot.setSexmas(rs.getString("sexo"));
                mascot.setFrmas(rs.getString("fecha_registro"));
                result.add(mascot);
            }
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
