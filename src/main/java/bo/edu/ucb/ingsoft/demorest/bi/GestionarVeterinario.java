package bo.edu.ucb.ingsoft.demorest.bi;

import bo.edu.ucb.ingsoft.demorest.dao.RegistrarVeterinarioDao;
import bo.edu.ucb.ingsoft.demorest.dto.RegistrarVeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GestionarVeterinario {
    @Autowired
    RegistrarVeterinarioDao registrarVeterinarioDao;

    public RegistrarVeterinarioDto finVeterinarioDtoById(RegistrarVeterinarioDto registrarVeterinarioDto){
        return registrarVeterinarioDao.registrarV(registrarVeterinarioDto);
    }


}
