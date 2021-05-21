package bo.edu.ucb.ingsoft.demorest.dto;

public class UsuarioRolDto {
    private Integer userrolId;
    private Integer roluserId;
    private Integer usuariourolId;
    public UsuarioRolDto(){

    }

    public Integer getUserrolId() {
        return userrolId;
    }

    public void setUserrolId(Integer userrolId) {
        this.userrolId = userrolId;
    }

    public Integer getRoluserId() {
        return roluserId;
    }

    public void setRoluserId(Integer roluserId) {
        this.roluserId = roluserId;
    }

    public Integer getUsuariourolId() {
        return usuariourolId;
    }

    public void setUsuariourolId(Integer usuariourolId) {
        this.usuariourolId = usuariourolId;
    }
}
