package bo.edu.ucb.ingsoft.demorest.dto;

public class LikesDto {
    private Integer likId;
    private Integer conslId;
    private Integer userlId;
    private String  fecl;
    private LikesDto() {

    }

    public Integer getLikId() {
        return likId;
    }

    public void setLikId(Integer likId) {
        this.likId = likId;
    }

    public Integer getConslId() {
        return conslId;
    }

    public void setConslId(Integer conslId) {
        this.conslId = conslId;
    }

    public Integer getUserlId() {
        return userlId;
    }

    public void setUserlId(Integer userlId) {
        this.userlId = userlId;
    }

    public String getFecl() {
        return fecl;
    }

    public void setFecl(String fecl) {
        this.fecl = fecl;
    }
}
