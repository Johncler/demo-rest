package bo.edu.ucb.ingsoft.demorest.bi;

import bo.edu.ucb.ingsoft.demorest.dao.RegistrarVeterinarioDao;
import bo.edu.ucb.ingsoft.demorest.dto.VeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GestionarVeterinario {
    @Autowired
    RegistrarVeterinarioDao veterinarioDao;

    public VeterinarioDto finVeterinarioDtoById(VeterinarioDto veterinarioId){
        return veterinarioDao.registrarV(veterinarioId);
    }


}
