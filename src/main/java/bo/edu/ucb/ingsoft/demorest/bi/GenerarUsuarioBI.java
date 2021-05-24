package bo.edu.ucb.ingsoft.demorest.bi;

import bo.edu.ucb.ingsoft.demorest.dao.UsuarioDao;
import bo.edu.ucb.ingsoft.demorest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class GenerarUsuarioBI {

    @Autowired
    UsuarioDao usuarioDao;

    public UsuarioDto usuarioDto(UsuarioDto usuarioDto) {
        return usuarioDao.crearUsuario(usuarioDto);
    }

    public UsuarioDto findUsuarioDtoById(Integer usuarioId){
        return usuarioDao.usuarioDtoById(usuarioId);
    }
    public List<UsuarioDto> findAllUsuarioDtos(){
        return usuarioDao.finAllUsuarioDtos();
    }

}
