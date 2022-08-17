public class Cajas {
    private double ingreso1;
    private double ingreso2;
    private double ingreso3;
    private int cantPersonas;

    public Cajas(){
        this.cantPersonas=0;
        this.ingreso1=0.00;
        this.ingreso2=0.00;
        this.ingreso3=0.00;
    }
    public Cajas(double ingreso1, double ingreso2, double ingreso3, int cantPersonas){
        this.cantPersonas=cantPersonas;
        this.ingreso1=ingreso1;
        this.ingreso2=ingreso2;
        this.ingreso3=ingreso3;
    }

    public double getIngreso1() {
        return ingreso1;
    }

    public void setIngreso1(double ingreso1) {
        this.ingreso1 = ingreso1;
    }

    public double getIngreso2() {
        return ingreso2;
    }

    public void setIngreso2(double ingreso2) {
        this.ingreso2 = ingreso2;
    }

    public double getIngreso3() {
        return ingreso3;
    }

    public void setIngreso3(double ingreso3) {
        this.ingreso3 = ingreso3;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
}
