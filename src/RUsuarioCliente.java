public class RUsuarioCliente {

    private String nombreUC;
    private String apellidos;
    private String nickname;
    private String tipo;
    private String contraseña;
    private String estado;

    public RUsuarioCliente(){
        this.nombreUC="";
        this.apellidos="";
        this.nickname="";
        this.tipo="";
        this.contraseña="";
        this.estado="";
    }
    public RUsuarioCliente(String nombreUC, String apellidos, String nickname, String tipo, String contraseña, String estado){
        this.nombreUC=nombreUC;
        this.apellidos=apellidos;
        this.nickname=nickname;
        this.tipo=tipo;
        this.contraseña=contraseña;
        this.estado=estado;
    }

    public String getNombreUC() {
        return nombreUC;
    }

    public void setNombreUC(String nombreUC) {
        this.nombreUC = nombreUC;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
