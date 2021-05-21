package bo.edu.ucb.ingsoft.demorest.dto;

public class TipoVeterinarioDto {
    private Integer tipoId;
    private String  tipot;
    public TipoVeterinarioDto() {

    }

    public Integer getTipoId() {
        return tipoId;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public String getTipot() {
        return tipot;
    }

    public void setTipot(String tipot) {
        this.tipot = tipot;
    }
}
