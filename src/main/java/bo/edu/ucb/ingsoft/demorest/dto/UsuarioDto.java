package bo.edu.ucb.ingsoft.demorest.dto;

public class UsuarioDto {
    private Integer usuarioId;
    private String  nomuser;
    private String  password;
    public UsuarioDto(){

    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
