package bo.edu.ucb.ingsoft.demorest.bi;

import bo.edu.ucb.ingsoft.demorest.dao.RegistrarVeterinarioDao;
import bo.edu.ucb.ingsoft.demorest.dao.VettCenterFreeDao;
import bo.edu.ucb.ingsoft.demorest.dto.BVettCenterFreeDto;
import bo.edu.ucb.ingsoft.demorest.dto.BusquedaVeeterinario;
import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import bo.edu.ucb.ingsoft.demorest.dto.VeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionarVetCenter {
    @Autowired
    public VettCenterFreeDao vettCenterFreeDao;


    /*public VeterinarioDto finVeterinarioDtoById(Integer veterinarioId){
        return vettCenterFreeDao.findVeterinarioDtoById(veterinarioId);
    }*/
    public List<BVettCenterFreeDto> finAllBVettCenterFreeDtos(BusquedaVeeterinario mostrar){
        return vettCenterFreeDao.finAllVeterinarioDtos(mostrar);
    }
}
