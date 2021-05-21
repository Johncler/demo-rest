package bo.edu.ucb.ingsoft.demorest.dao;


import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import bo.edu.ucb.ingsoft.demorest.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioDao {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private SequenceDao sequenceDao;

    public UsuarioDto crearUsuario (UsuarioDto us){
        us.setUsuarioId(sequenceDao.getPrimaryKeyForTable("us"));
        try {
            Connection con = dataSource.getConnection();
            Statement st = con.createStatement();
            st.execute( "INSERT INTO usuario VALUES ("
                    + us.getUsuarioId() +" , '"
                    + us.getNomuser() +"', '"
                    + us.getPassword() +"') ");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return us;
    }

    public UsuarioDto usuarioDtoById(Integer usuarioId){
        UsuarioDto result = new UsuarioDto();
        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT usuarioId,nomuser,password FROM usuario" +
                    "WHERE usuarioId = "+ usuarioId);
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
        return null;
    }
    public UsuarioDto findMascotaDtoById(Integer usuarioId){
        UsuarioDto result = new UsuarioDto();
        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT id_usuario,nombreusuario,contraseña," +
                    " FROM usuario" +
                    " WHERE id_usuario = " + usuarioId);
            if (rs.next()){
                result.setUsuarioId(rs.getInt("id_usuario"));
                result.setNomuser(rs.getString("nombre_usuario"));
                result.setPassword(rs.getString("contraseña"));
            }else {
                result = null;
            }
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    public List<UsuarioDao> finAllUsuarioDaos(){
        List<UsuarioDao> result = new ArrayList<>();

        try {
            Connection cn = dataSource.getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT id_usuario,nombre_usuario,contraseña" +
                    " FROM usuario");
            while (rs.next()){
                UsuarioDto userr = new UsuarioDto();
                userr.setUsuarioId(rs.getInt("id_mascota"));
                userr.setNomuser(rs.getString("id_especie"));
                userr.setPassword(rs.getString("id_raza"));
                result = null;
            }
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
