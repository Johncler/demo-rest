package bo.edu.ucb.ingsoft.demorest.dto;

public class VeterinarioDto {
    private Integer veterId;
    private Integer uservetoId;
    private Integer vetavoId;
    private Integer imgvetiId;
    private String  nomveto;
    private String  appveto;
    private String  emailveto;
    private String  depaveto;
    private String  lugarfveto;
    public VeterinarioDto(){

    }

    public Integer getVeterId() {
        return veterId;
    }

    public void setVeterId(Integer veterId) {
        this.veterId = veterId;
    }

    public Integer getUservetoId() {
        return uservetoId;
    }

    public void setUservetoId(Integer uservetoId) {
        this.uservetoId = uservetoId;
    }

    public Integer getVetavoId() {
        return vetavoId;
    }

    public void setVetavoId(Integer vetavoId) {
        this.vetavoId = vetavoId;
    }

    public Integer getImgvetiId() {
        return imgvetiId;
    }

    public void setImgvetiId(Integer imgvetiId) {
        this.imgvetiId = imgvetiId;
    }

    public String getNomveto() {
        return nomveto;
    }

    public void setNomveto(String nomveto) {
        this.nomveto = nomveto;
    }

    public String getAppveto() {
        return appveto;
    }

    public void setAppveto(String appveto) {
        this.appveto = appveto;
    }

    public String getEmailveto() {
        return emailveto;
    }

    public void setEmailveto(String emailveto) {
        this.emailveto = emailveto;
    }

    public String getDepaveto() {
        return depaveto;
    }

    public void setDepaveto(String depaveto) {
        this.depaveto = depaveto;
    }

    public String getLugarfveto() {
        return lugarfveto;
    }

    public void setLugarfveto(String lugarfveto) {
        this.lugarfveto = lugarfveto;
    }
}
