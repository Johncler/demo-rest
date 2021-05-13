package bo.edu.ucb.ingsoft.demorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    @GetMapping(path = "/hola")
    public  String helloWorld() {
        return "Hola Mundo";
    }
}

