package bo.edu.ucb.ingsoft.demorest.dto;

public class RegistrarVeterinarioDto {
    private Integer veterId;
    private Integer imgvetiId;
    private String  nomveto;
    private String  appveto;
    private String  emailveto;
    private String  depaveto;
    private String  lugarfveto;


    private String  especialidad;

    private Integer usuarioId;
    private String  nomuser;
    private String  password;

    private Integer veterinariaId;
    private Integer tipoveteId;
    private String  dirvete;
    private String  nomvete;
    private String  fonovete;
    private String  hdavete;

    public RegistrarVeterinarioDto() {

    }

    public Integer getTipoveteId() {
        return tipoveteId;
    }

    public void setTipoveteId(Integer tipoveteId) {
        this.tipoveteId = tipoveteId;
    }

    public String getDirvete() {
        return dirvete;
    }

    public void setDirvete(String dirvete) {
        this.dirvete = dirvete;
    }

    public Integer getVeterId() {
        return veterId;
    }

    public void setVeterId(Integer veterId) {
        this.veterId = veterId;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVeterinariaId() {
        return veterinariaId;
    }

    public void setVeterinariaId(Integer veterinariaId) {
        this.veterinariaId = veterinariaId;
    }

    public String getNomvete() {
        return nomvete;
    }

    public void setNomvete(String nomvete) {
        this.nomvete = nomvete;
    }

    public String getFonovete() {
        return fonovete;
    }

    public void setFonovete(String fonovete) {
        this.fonovete = fonovete;
    }

    public String getHdavete() {
        return hdavete;
    }

    public void setHdavete(String hdavete) {
        this.hdavete = hdavete;
    }
}
