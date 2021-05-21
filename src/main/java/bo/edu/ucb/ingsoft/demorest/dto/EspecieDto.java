package bo.edu.ucb.ingsoft.demorest.dto;

public class EspecieDto {
    private Integer especiId;
    private String  nomesp;
    public  EspecieDto(){

    }

    public Integer getEspeciId() {
        return especiId;
    }

    public void setEspeciId(Integer especiId) {
        this.especiId = especiId;
    }

    public String getNomesp() {
        return nomesp;
    }

    public void setNomesp(String nomesp) {
        this.nomesp = nomesp;
    }
}
