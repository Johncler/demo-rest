package bo.edu.ucb.ingsoft.demorest.dto;

public class HorarioDto {
    private Integer horarioId;
    private Integer vetehId;
    private String  d;
    private String  dhrs;
    private String  hhrs;
    public HorarioDto(){

    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public Integer getVetehId() {
        return vetehId;
    }

    public void setVetehId(Integer vetehId) {
        this.vetehId = vetehId;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDhrs() {
        return dhrs;
    }

    public void setDhrs(String dhrs) {
        this.dhrs = dhrs;
    }

    public String getHhrs() {
        return hhrs;
    }

    public void setHhrs(String hhrs) {
        this.hhrs = hhrs;
    }
}
