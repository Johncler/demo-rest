package bo.edu.ucb.ingsoft.demorest.api;

import bo.edu.ucb.ingsoft.demorest.bi.GestionarVeterinario;
import bo.edu.ucb.ingsoft.demorest.dto.ResponseDto;
import bo.edu.ucb.ingsoft.demorest.dto.VeterinarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VeterinarioController {

    @Autowired
    private GestionarVeterinario gestionarVeterinario;

    @PostMapping(path = "/veterinario")
    public ResponseDto registrarV(@RequestBody VeterinarioDto veterinarioDto){
        if (veterinarioDto.getNomveto() == null || veterinarioDto.getNomveto().trim().equals("")){
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
            return new ResponseDto(false,null,"El nombre del veterinario debe ser obligatorio");
        }
        if (veterinarioDto.getEmailveto() == null || veterinarioDto.getEmailveto().trim().equals("")){
            return new ResponseDto(false,null,"El correo debe ser obligatorio");
        }
        return new ResponseDto(true,gestionarVeterinario.finVeterinarioDtoById(veterinarioDto),"Succes");
    }
}
