package bo.edu.ucb.ingsoft.demorest.dto;

import bo.edu.ucb.ingsoft.demorest.dao.UsuarioDao;

public class MascotaDto {
    private Integer mascoId;
    private Integer espmId;
    private Integer razamId;
    private Integer imgmId;
    private Integer duemId;
    private String  nommas;
    private String  tamas;
    private String  colmas;
    private String  sexmas;
    private String  frmas;
    public MascotaDto(){

    }

    public Integer getMascoId() {
        return mascoId;
    }

    public void setMascoId(Integer mascoId) {
        this.mascoId = mascoId;
    }

    public Integer getEspmId() {
        return espmId;
    }

    public void setEspmId(Integer espmId) {
        this.espmId = espmId;
    }

    public Integer getRazamId() {
        return razamId;
    }

    public void setRazamId(Integer razamId) {
        this.razamId = razamId;
    }

    public Integer getImgmId() {
        return imgmId;
    }

    public void setImgmId(Integer imgmId) {
        this.imgmId = imgmId;
    }

    public Integer getDuemId() {
        return duemId;
    }

    public void setDuemId(Integer duemId) {
        this.duemId = duemId;
    }

    public String getNommas() {
        return nommas;
    }

    public void setNommas(String nommas) {
        this.nommas = nommas;
    }

    public String getTamas() {
        return tamas;
    }

    public void setTamas(String tamas) {
        this.tamas = tamas;
    }

    public String getColmas() {
        return colmas;
    }

    public void setColmas(String colmas) {
        this.colmas = colmas;
    }

    public String getSexmas() {
        return sexmas;
    }

    public void setSexmas(String sexmas) {
        this.sexmas = sexmas;
    }

    public String getFrmas() {
        return frmas;
    }

    public void setFrmas(String frmas) {
        this.frmas = frmas;
    }
}
