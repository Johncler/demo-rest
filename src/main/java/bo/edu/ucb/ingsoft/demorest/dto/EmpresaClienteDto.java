package bo.edu.ucb.ingsoft.demorest.dto;

public class EmpresaClienteDto {
    private Integer ecId;
    private Integer userecId;
    private String np;
    private String nt;
    private String direc;
    private String descpep;
    public EmpresaClienteDto(){

    }

    public Integer getEcId() {
        return ecId;
    }

    public void setEcId(Integer ecId) {
        this.ecId = ecId;
    }

    public Integer getUserecId() {
        return userecId;
    }

    public void setUserecId(Integer userecId) {
        this.userecId = userecId;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getDescpep() {
        return descpep;
    }

    public void setDescpep(String descpep) {
        this.descpep = descpep;
    }
}
