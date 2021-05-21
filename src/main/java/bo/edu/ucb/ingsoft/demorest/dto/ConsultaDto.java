package bo.edu.ucb.ingsoft.demorest.dto;

public class ConsultaDto {
    private Integer consuliId;
    private Integer mascId;
    private Integer veteId;
    private String temcons;
    private String desc;
    private String dep;
    private String fech;
    private String hr;
    public ConsultaDto(){

    }

    public Integer getConsuliId() {
        return consuliId;
    }

    public void setConsuliId(Integer consuliId) {
        this.consuliId = consuliId;
    }

    public Integer getMascId() {
        return mascId;
    }

    public void setMascId(Integer mascId) {
        this.mascId = mascId;
    }

    public Integer getVeteId() {
        return veteId;
    }

    public void setVeteId(Integer veteId) {
        this.veteId = veteId;
    }

    public String getTemcons() {
        return temcons;
    }

    public void setTemcons(String temcons) {
        this.temcons = temcons;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }
}
