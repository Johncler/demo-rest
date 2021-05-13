package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegistroMascotaDao {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public MascotaDto crearMascota (MascotaDto mascotaDto){
        mascotaDto.mascoId = sequenceDao.getPrimaryKeyForTable("mascotaDto");
        try {
            Connection con = dataSource.getConnection();
            Statement st = con.createStatement();
            st.execute( "INSERT INTO mascota VALUES ("
                    + mascotaDto.mascoId +" , '"
                    + mascotaDto.espmId +"', '"
                    + mascotaDto.razamId +"', '"
                    + mascotaDto.imgmId +"','"
                    + mascotaDto.duemId +"','"
                    + mascotaDto.nommas +"','"
                    + mascotaDto.tamas +"','"
                    + mascotaDto.colmas +"','"
                    + mascotaDto.sexmas +"','"
                    + mascotaDto.frmas +"' ) ");
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
                        result.mascoId = rs.getInt("id_mascota");
                        result.espmId = rs.getInt("id_especie");
                        result.razamId = rs.getInt("id_raza");
                        result.imgmId = rs.getInt("id_imagen");
                        result.duemId = rs.getInt("id_dueño");
                        result.nommas = rs.getString("nombre_mascota");
                        result.tamas = rs.getString("tamaño");
                        result.colmas = rs.getString("color");
                        result.sexmas = rs.getString("sexo");
                        result.frmas = rs.getString("fecha_registro");
                    }else {
                            result = null;
                    }
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
                mascot.mascoId = rs.getInt("id_mascota");
                mascot.espmId = rs.getInt("id_especie");
                mascot.razamId = rs.getInt("id_raza");
                mascot.imgmId = rs.getInt("id_imagen");
                mascot.duemId = rs.getInt("id_dueño");
                mascot.nommas = rs.getString("nombre_mascota");
                mascot.tamas = rs.getString("tamaño");
                mascot.colmas = rs.getString("color");
                mascot.sexmas = rs.getString("sexo");
                mascot.frmas = rs.getString("fecha_registro");
                result.add(mascot);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
