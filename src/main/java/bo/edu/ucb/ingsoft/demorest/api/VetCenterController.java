package bo.edu.ucb.ingsoft.demorest.api;

import bo.edu.ucb.ingsoft.demorest.bi.GestionarVetCenter;
import bo.edu.ucb.ingsoft.demorest.dto.*;
import bo.edu.ucb.ingsoft.demorest.dto.VeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
public class VetCenterController {
    @Autowired
    public DataSource dataSource;

    @Autowired
    private GestionarVetCenter gestionarVetCenter;

    /*@GetMapping(path = "/veterinario/{veterinarioId}")
    public ResponseDto finVeterinarioDtoById(@PathVariable Integer veterinarioId) {
        VeterinarioDto veterinarioDto = gestionarVetCenter.finVeterinarioDtoById(veterinarioId);
        if (veterinarioDto != null){
            return new ResponseDto(true,veterinarioDto,null);
        }else {
            return new ResponseDto(false,null,"No existe el veterinario con codigo:");
        }
    }*/
    @PostMapping(path = "/VeterinariB")
    public ResponseDto finAllVeterinarioDtos(@RequestBody BusquedaVeeterinario buscar) {

        return new ResponseDto(true, gestionarVetCenter.finAllBVettCenterFreeDtos(buscar), null);


    }

}
