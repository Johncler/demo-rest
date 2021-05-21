package bo.edu.ucb.ingsoft.demorest.dto;

public class PagoDto {
    private Integer pagoId;
    private Integer imgpgId;
    private Integer emppgId;
    private String  fecpgñ;
    private String  montpg;
    private String  descpg;
    public PagoDto() {

    }

    public Integer getPagoId() {
        return pagoId;
    }

    public void setPagoId(Integer pagoId) {
        this.pagoId = pagoId;
    }

    public Integer getImgpgId() {
        return imgpgId;
    }

    public void setImgpgId(Integer imgpgId) {
        this.imgpgId = imgpgId;
    }

    public Integer getEmppgId() {
        return emppgId;
    }

    public void setEmppgId(Integer emppgId) {
        this.emppgId = emppgId;
    }

    public String getFecpgñ() {
        return fecpgñ;
    }

    public void setFecpgñ(String fecpgñ) {
        this.fecpgñ = fecpgñ;
    }

    public String getMontpg() {
        return montpg;
    }

    public void setMontpg(String montpg) {
        this.montpg = montpg;
    }

    public String getDescpg() {
        return descpg;
    }

    public void setDescpg(String descpg) {
        this.descpg = descpg;
    }
}
