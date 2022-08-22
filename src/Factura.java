public class Factura {
    private String fecha;
    private String hora;
    private String nombreClienteF;
    private double monto;

    public Factura(){
        this.fecha="";
        this.hora="";
        this.nombreClienteF="";
        this.monto = 0.00;
    }
    public Factura(String nombreClienteF,String fecha, String hora, double monto){
        this.nombreClienteF=nombreClienteF;
        this.monto=monto;
        this.fecha=fecha;
        this.hora=hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombreClienteF() {
        return nombreClienteF;
    }

    public void setNombreClienteF(String nombreClienteF) {
        this.nombreClienteF = nombreClienteF;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
