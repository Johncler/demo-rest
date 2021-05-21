package bo.edu.ucb.ingsoft.demorest.dto;

public class MensajeBotDto {
    public Integer smsbiId;
    public String  smsrb;
    public MensajeBotDto(){

    }

    public Integer getSmsbiId() {
        return smsbiId;
    }

    public void setSmsbiId(Integer smsbiId) {
        this.smsbiId = smsbiId;
    }

    public String getSmsrb() {
        return smsrb;
    }

    public void setSmsrb(String smsrb) {
        this.smsrb = smsrb;
    }
}
