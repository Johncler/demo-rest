package bo.edu.ucb.ingsoft.demorest.dto;

public class VeterinariaDto {
    private Integer veterinariaId;
    private Integer tipoveteId;
    private String  nomvete;
    private String  veteciud;
    private String  dirvete;
    private String  fonovete;
    private String  veteemail;
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

    public String getVeteciud() {
        return veteciud;
    }

    public void setVeteciud(String veteciud) {
        this.veteciud = veteciud;
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

    public String getVeteemail() {
        return veteemail;
    }

    public void setVeteemail(String veteemail) {
        this.veteemail = veteemail;
    }

    public String getHdavete() {
        return hdavete;
    }

    public void setHdavete(String hdavete) {
        this.hdavete = hdavete;
    }
}
