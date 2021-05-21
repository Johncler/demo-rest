package bo.edu.ucb.ingsoft.demorest.api;
import bo.edu.ucb.ingsoft.demorest.bi.GestionarMascotaBI;
import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import bo.edu.ucb.ingsoft.demorest.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.sql.DataSource;

@RestController
public class MascotaController {
    @Autowired
    public DataSource dataSource;

    @Autowired
    private GestionarMascotaBI gestionarMascotaBI;

    @GetMapping(path = "/mascota/{mascoId}")
    public ResponseDto findMascotaDtoById(@PathVariable Integer mascoId) {
        MascotaDto mascotaDto = gestionarMascotaBI.findMascotaDtoById(mascoId);
        if (mascotaDto != null){
            return new ResponseDto(true,mascotaDto,null);
        }else {
            return new ResponseDto(false,null,"No existe la mascota con codigo:");
        }
    }
    @GetMapping(path = "/mascota")
    public ResponseDto finAllMascotaDtos(){

        return new ResponseDto(true,gestionarMascotaBI.findAllMascotaDtos(),null);
    }
    @PostMapping(path = "/mascota")
    public ResponseDto creaMascota(@RequestBody MascotaDto mascotaDto){
        if (mascotaDto.getNommas() == null || mascotaDto.getNommas().trim().equals("")){
            //throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
            return new ResponseDto(false,null,"El nombre de la mascota debe ser obligatorio");
        }
        if (mascotaDto.getColmas() == null || mascotaDto.getColmas().trim().equals("")){
            return new ResponseDto(false,null,"El color debe ser obligatorio");
        }
        return new ResponseDto(true,gestionarMascotaBI.crearMascota(mascotaDto),null);
    }
}
