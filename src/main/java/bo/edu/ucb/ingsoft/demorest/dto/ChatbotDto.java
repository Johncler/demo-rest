package bo.edu.ucb.ingsoft.demorest.dto;

public class ChatbotDto {
    private Integer chatbotiId;
    private Integer user1Id;
    private Integer smsbotId;
    private String  usersms;
    private String fecha;
    public ChatbotDto(){

    }

    public Integer getChatbotiId() {
        return chatbotiId;
    }

    public void setChatbotiId(Integer chatbotiId) {
        this.chatbotiId = chatbotiId;
    }

    public Integer getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(Integer user1Id) {
        this.user1Id = user1Id;
    }

    public Integer getSmsbotId() {
        return smsbotId;
    }

    public void setSmsbotId(Integer smsbotId) {
        this.smsbotId = smsbotId;
    }

    public String getUsersms() {
        return usersms;
    }

    public void setUsersms(String usersms) {
        this.usersms = usersms;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
