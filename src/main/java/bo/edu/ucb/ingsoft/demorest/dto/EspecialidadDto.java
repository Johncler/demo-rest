package bo.edu.ucb.ingsoft.demorest.dto;

public class EspecialidadDto {
    private Integer espeId;
    private String  especialidad;
    public EspecialidadDto(){

    }

    public Integer getEspeId() {
        return espeId;
    }

    public void setEspeId(Integer espeId) {
        this.espeId = espeId;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

