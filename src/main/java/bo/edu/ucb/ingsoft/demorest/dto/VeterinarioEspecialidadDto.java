package bo.edu.ucb.ingsoft.demorest.dto;

public class VeterinarioEspecialidadDto {
    private Integer veterinarioespecialId;
    private Integer vetoId;
    private Integer especialidadvetoId;
    public VeterinarioEspecialidadDto() {

    }

    public Integer getVeterinarioespecialId() {
        return veterinarioespecialId;
    }

    public void setVeterinarioespecialId(Integer veterinarioespecialId) {
        this.veterinarioespecialId = veterinarioespecialId;
    }

    public Integer getVetoId() {
        return vetoId;
    }

    public void setVetoId(Integer vetoId) {
        this.vetoId = vetoId;
    }

    public Integer getEspecialidadvetoId() {
        return especialidadvetoId;
    }

    public void setEspecialidadvetoId(Integer especialidadvetoId) {
        this.especialidadvetoId = especialidadvetoId;
    }
}
