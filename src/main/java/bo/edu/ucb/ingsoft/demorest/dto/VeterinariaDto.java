package bo.edu.ucb.ingsoft.demorest.dto;

public class VeterinariaDto {
    private Integer veterinariaId;
    private Integer tipoveteId;
    private String  nomvete;
    private String  ciudvete;
    private String  dirvete;
    private String  fonovete;
    private String  emailvete;
    private String  hdavete;
    private VeterinariaDto() {

    }

    public Integer getVeterinariaId() {
        return veterinariaId;
    }

    public void setVeterinariaId(Integer veterinariaId) {
        this.veterinariaId = veterinariaId;
    }

    public Integer getTipoveteId() {
        return tipoveteId;
    }

    public void setTipoveteId(Integer tipoveteId) {
        this.tipoveteId = tipoveteId;
    }

    public String getNomvete() {
        return nomvete;
    }

    public void setNomvete(String nomvete) {
        this.nomvete = nomvete;
    }

    public String getCiudvete() {
        return ciudvete;
    }

    public void setCiudvete(String ciudvete) {
        this.ciudvete = ciudvete;
    }

    public String getDirvete() {
        return dirvete;
    }

    public void setDirvete(String dirvete) {
        this.dirvete = dirvete;
    }

    public String getFonovete() {
        return fonovete;
    }

    public void setFonovete(String fonovete) {
        this.fonovete = fonovete;
    }

    public String getEmailvete() {
        return emailvete;
    }

    public void setEmailvete(String emailvete) {
        this.emailvete = emailvete;
    }

    public String getHdavete() {
        return hdavete;
    }

    public void setHdavete(String hdavete) {
        this.hdavete = hdavete;
    }
}
