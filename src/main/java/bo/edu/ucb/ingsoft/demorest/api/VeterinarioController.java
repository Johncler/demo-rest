package bo.edu.ucb.ingsoft.demorest.api;

import bo.edu.ucb.ingsoft.demorest.bi.GestionarVeterinario;
import bo.edu.ucb.ingsoft.demorest.dto.RegistrarVeterinarioDto;
import bo.edu.ucb.ingsoft.demorest.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VeterinarioController {

    @Autowired
    private GestionarVeterinario gestionarVeterinario;

    @PostMapping(path = "/veterinario")
    public ResponseDto registrarV(@RequestBody RegistrarVeterinarioDto registrarVeterinarioDto){
        if (registrarVeterinarioDto.getNomuser() == null || registrarVeterinarioDto.getNomuser().trim().equals("")){
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
            return new ResponseDto(false,null,"El nombre del veterinario debe ser obligatorio");
        }
        if (registrarVeterinarioDto.getPassword() == null || registrarVeterinarioDto.getPassword().trim().equals("")){
            return new ResponseDto(false,null,"El password debe ser obligatorio");
        }
        if (registrarVeterinarioDto.getAppveto() == null || registrarVeterinarioDto.getAppveto().trim().equals("")){
            return new ResponseDto(false,null,"El apellido es obligatorio");
        }
        if (registrarVeterinarioDto.getDepaveto() == null || registrarVeterinarioDto.getDepaveto().trim().equals("")){
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
            return new ResponseDto(false,null,"El nombre del departamento debe ser obligatorio");
        }
        if (registrarVeterinarioDto.getDirvete() == null || registrarVeterinarioDto.getDirvete().trim().equals("")){
            return new ResponseDto(false,null,"La direccion debe ser obligatorio");
        }
        if (registrarVeterinarioDto.getFonovete() == null || registrarVeterinarioDto.getFonovete().trim().equals("")){
            return new ResponseDto(false,null,"El numero del telefono debe ser Obligatorio");
        }

        return new ResponseDto(true,gestionarVeterinario.finVeterinarioDtoById(registrarVeterinarioDto),"Succes");

    }
}
