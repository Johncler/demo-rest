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

    @GetMapping(path = "/veterinario/{veterinarioId}")
    public ResponseDto finVeterinarioDtoById(@PathVariable Integer veterinarioId) {
        VeterinarioDto veterinarioDto = gestionarVetCenter.finVeterinarioDtoById(veterinarioId);
        if (veterinarioDto != null){
            return new ResponseDto(true,veterinarioDto,null);
        }else {
            return new ResponseDto(false,null,"No existe el veterinario con codigo:");
        }
    }
    @GetMapping(path = "/veterinario")
    public ResponseDto finAllVeterinarioDtos(){

        return new ResponseDto(true,gestionarVetCenter.finAllVeterinarioDtos(),null);

    }
    @PostMapping(path = "/VetCenter")
    public ResponseDto crearVeterinario(@RequestBody VeterinarioDto veterinarioDto){
        if (veterinarioDto.getNomveto() == null || veterinarioDto.getNomveto().trim().equals("")){
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
            return new ResponseDto(false,null,"El nombre del veterinario debe ser obligatorio");
        }
        if (veterinarioDto.getAppveto() == null || veterinarioDto.getAppveto().trim().equals("")){
            return new ResponseDto(false,null,"El color debe ser obligatorio");
        }
        return new ResponseDto(true,gestionarVetCenter.crearVeterinarioDto(veterinarioDto),"Veterinario Encontrado");
    }

}
