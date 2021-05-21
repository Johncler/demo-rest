package bo.edu.ucb.ingsoft.demorest.dto;

public class AdministradorDto {
    private Integer admiId;
    private Integer userId;
    private String nom;
    private String ap;
    private String fono;
    private String email;
    public AdministradorDto(){
    }

    public Integer getAdmiId() {
        return admiId;
    }

    public void setAdmiId(Integer admiId) {
        this.admiId = admiId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
