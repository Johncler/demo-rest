package bo.edu.ucb.ingsoft.demorest.bi;

import bo.edu.ucb.ingsoft.demorest.dao.RegistroMascotaDao;
import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GestionarMascotaBI {
    @Autowired
    RegistroMascotaDao registroMascotaDao;

    public MascotaDto crearMascota(MascotaDto mascotaDto) {

        return registroMascotaDao.crearMascota(mascotaDto);
    }

    public MascotaDto findMascotaDtoById(Integer mascoId) {

        return registroMascotaDao.findMascotaDtoById(mascoId);
    }
    public List<MascotaDto> findAllMascotaDtos(){

        return registroMascotaDao.finAllMascotaDtos();
    }
}