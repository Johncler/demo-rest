package bo.edu.ucb.ingsoft.demorest.dto;

public class TipsDto {
    private Integer tipsId;
    private Integer imgtipsId;
    private Integer vetertipsId;
    private String  titulotips;
    private String  descptips;
    public TipsDto() {

    }

    public Integer getTipsId() {
        return tipsId;
    }

    public void setTipsId(Integer tipsId) {
        this.tipsId = tipsId;
    }

    public Integer getImgtipsId() {
        return imgtipsId;
    }

    public void setImgtipsId(Integer imgtipsId) {
        this.imgtipsId = imgtipsId;
    }

    public Integer getVetertipsId() {
        return vetertipsId;
    }

    public void setVetertipsId(Integer vetertipsId) {
        this.vetertipsId = vetertipsId;
    }

    public String getTitulotips() {
        return titulotips;
    }

    public void setTitulotips(String titulotips) {
        this.titulotips = titulotips;
    }

    public String getDescptips() {
        return descptips;
    }

    public void setDescptips(String descptips) {
        this.descptips = descptips;
    }
}
