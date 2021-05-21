package bo.edu.ucb.ingsoft.demorest.dto;

public class CalificacionDto {
    private Integer caliId;
    private Integer ususrioId;
    private Integer consulId;
    private String date;
    private Double calificacion;
    public CalificacionDto(){

    }

    public Integer getCaliId() {
        return caliId;
    }

    public void setCaliId(Integer caliId) {
        this.caliId = caliId;
    }

    public Integer getUsusrioId() {
        return ususrioId;
    }

    public void setUsusrioId(Integer ususrioId) {
        this.ususrioId = ususrioId;
    }

    public Integer getConsulId() {
        return consulId;
    }

    public void setConsulId(Integer consulId) {
        this.consulId = consulId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
