package bo.edu.ucb.ingsoft.demorest.dto;

public class ImagenDto {
    private Integer imgId;
    private String  nomimg;
    private String  addimg;
    public ImagenDto(){

    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getNomimg() {
        return nomimg;
    }

    public void setNomimg(String nomimg) {
        this.nomimg = nomimg;
    }

    public String getAddimg() {
        return addimg;
    }

    public void setAddimg(String addimg) {
        this.addimg = addimg;
    }
}
