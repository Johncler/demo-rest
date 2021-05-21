package bo.edu.ucb.ingsoft.demorest.dto;

public class DueñoDto {
    private Integer dueId;
    private Integer userdId;
    private String nomd;
    private String apd;
    private String fonod;
    private String emaild;
    private String depad;
    public DueñoDto(){

    }

    public Integer getDueId() {
        return dueId;
    }

    public void setDueId(Integer dueId) {
        this.dueId = dueId;
    }

    public Integer getUserdId() {
        return userdId;
    }

    public void setUserdId(Integer userdId) {
        this.userdId = userdId;
    }

    public String getNomd() {
        return nomd;
    }

    public void setNomd(String nomd) {
        this.nomd = nomd;
    }

    public String getApd() {
        return apd;
    }

    public void setApd(String apd) {
        this.apd = apd;
    }

    public String getFonod() {
        return fonod;
    }

    public void setFonod(String fonod) {
        this.fonod = fonod;
    }

    public String getEmaild() {
        return emaild;
    }

    public void setEmaild(String emaild) {
        this.emaild = emaild;
    }

    public String getDepad() {
        return depad;
    }

    public void setDepad(String depad) {
        this.depad = depad;
    }
}
