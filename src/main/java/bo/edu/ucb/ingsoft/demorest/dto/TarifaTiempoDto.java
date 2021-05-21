package bo.edu.ucb.ingsoft.demorest.dto;

public class TarifaTiempoDto {
    private Integer tartId;
    private Integer cantmest;
    private Double preciot;
    public TarifaTiempoDto(){

    }

    public Integer getTartId() {
        return tartId;
    }

    public void setTartId(Integer tartId) {
        this.tartId = tartId;
    }

    public Integer getCantmest() {
        return cantmest;
    }

    public void setCantmest(Integer cantmest) {
        this.cantmest = cantmest;
    }

    public Double getPreciot() {
        return preciot;
    }

    public void setPreciot(Double preciot) {
        this.preciot = preciot;
    }
}
