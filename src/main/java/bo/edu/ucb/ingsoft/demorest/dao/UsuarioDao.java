package bo.edu.ucb.ingsoft.demorest.dao;

import bo.edu.ucb.ingsoft.demorest.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioDao {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public UsuarioDto crearUsuario (UsuarioDto us){
        us.setUsuarioId(sequenceDao.getPrimaryKeyForTable("usuario"));
        try (Connection con = dataSource.getConnection();
             PreparedStatement pst = con.prepareStatement("INSERT INTO usuario VALUES (?,?,?)");){
            pst.setInt(1,us.getUsuarioId());
            pst.setString(2, us.getNomuser());
            pst.setString(3, us.getPassword());
            pst.executeUpdate();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return us;
    }

    public UsuarioDto usuarioDtoById(Integer usuarioId){
        UsuarioDto result = new UsuarioDto();
        try {
            Connection cn = dataSource.getConnection();
            PreparedStatement pst = cn.prepareStatement("SELECT usuarioId,nomuser,password FROM usuario WHERE usuarioId =? ");
            pst.setInt(1,usuarioId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                result.setUsuarioId(rs.getInt("id_usuario"));
                result.setNomuser(rs.getString("nombre_usuario"));
                result.setPassword(rs.getString("contraseña"));
            } else { // si no hay valores de BBDD
                result = null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    public List<UsuarioDto> finAllUsuarioDtos(){
        List<UsuarioDto> result = new ArrayList<>();

        try ( Connection cn = dataSource.getConnection();
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery( "SELECT id_usuario,nombre_usuario,contraseña FROM usuario");){

            while (rs.next()){
                UsuarioDto userr = new UsuarioDto();
                userr.setUsuarioId(rs.getInt("id_usuario"));
                userr.setNomuser(rs.getString("nombre_usuario"));
                userr.setPassword(rs.getString("contraseña"));
                result.add(userr);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
       return result;
    }
}
