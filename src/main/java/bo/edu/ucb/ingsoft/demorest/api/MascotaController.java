package bo.edu.ucb.ingsoft.demorest.api;

import bo.edu.ucb.ingsoft.demorest.bi.GestionarMascotaBI;
import bo.edu.ucb.ingsoft.demorest.dto.MascotaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.PushBuilder;
import javax.sql.DataSource;
import java.util.List;
@RestController
public class MascotaController {
    @Autowired
    public DataSource dataSource;

    @Autowired
    private GestionarMascotaBI gestionarMascotaBI;

    @GetMapping(path = "/mascota/{mascoId}")
    public MascotaDto findMascotaDtoById(@PathVariable Integer mascoId) {
        MascotaDto mascotaDto = gestionarMascotaBI.findMascotaDtoById(mascoId);
        if (mascotaDto != null){
            return gestionarMascotaBI.findMascotaDtoById(mascoId);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No existe la mascota con codigo:" + mascoId );
        }
    }
    @GetMapping(path = "/mascota")
    public List<MascotaDto> finAllMascotaDtos(){

        return gestionarMascotaBI.findAllMascotaDtos();
    }
    @PostMapping(path = "/mascota")
    public MascotaDto creaMascota(@RequestBody MascotaDto mascotaDto){
        if (mascotaDto.nommas == null || mascotaDto.colmas.equals("")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre de la mascota debe ser obligatorio" );
        }
        return gestionarMascotaBI.crearMascota(mascotaDto);
    }
}
