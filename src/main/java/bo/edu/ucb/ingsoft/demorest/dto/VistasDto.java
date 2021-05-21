package bo.edu.ucb.ingsoft.demorest.dto;

public class VistasDto {
    private Integer vistaId;
    private Integer consulvId;
    private Integer uservId;
    private String fechv;
    public VistasDto(){

    }

    public Integer getVistaId() {
        return vistaId;
    }

    public void setVistaId(Integer vistaId) {
        this.vistaId = vistaId;
    }

    public Integer getConsulvId() {
        return consulvId;
    }

    public void setConsulvId(Integer consulvId) {
        this.consulvId = consulvId;
    }

    public Integer getUservId() {
        return uservId;
    }

    public void setUservId(Integer uservId) {
        this.uservId = uservId;
    }

    public String getFechv() {
        return fechv;
    }

    public void setFechv(String fechv) {
        this.fechv = fechv;
    }
}
