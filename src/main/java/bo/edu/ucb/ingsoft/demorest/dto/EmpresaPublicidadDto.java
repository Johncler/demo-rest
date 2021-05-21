package bo.edu.ucb.ingsoft.demorest.dto;

public class EmpresaPublicidadDto {
    private Integer emppId;
    private Integer empcId;
    private Integer tartId;
    private String  noma;
    private String marp;
    private String fecin;
    private String fecf;
    public EmpresaPublicidadDto(){

    }

    public Integer getEmppId() {
        return emppId;
    }

    public void setEmppId(Integer emppId) {
        this.emppId = emppId;
    }

    public Integer getEmpcId() {
        return empcId;
    }

    public void setEmpcId(Integer empcId) {
        this.empcId = empcId;
    }

    public Integer getTartId() {
        return tartId;
    }

    public void setTartId(Integer tartId) {
        this.tartId = tartId;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public String getMarp() {
        return marp;
    }

    public void setMarp(String marp) {
        this.marp = marp;
    }

    public String getFecin() {
        return fecin;
    }

    public void setFecin(String fecin) {
        this.fecin = fecin;
    }

    public String getFecf() {
        return fecf;
    }

    public void setFecf(String fecf) {
        this.fecf = fecf;
    }
}
