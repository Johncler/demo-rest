package bo.edu.ucb.ingsoft.demorest.dto;

public class RolDto {
    private Integer rolId;
    private String  nomrol;
    public RolDto(){

    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getNomrol() {
        return nomrol;
    }

    public void setNomrol(String nomrol) {
        this.nomrol = nomrol;
    }
}
