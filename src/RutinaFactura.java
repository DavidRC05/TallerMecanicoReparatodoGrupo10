import javax.swing.*;

public class RutinaFactura {

    final private Factura arregloFactura[] = new Factura[3];

    public void emitirFactura() {
        JOptionPane.showMessageDialog(null, "LLENADO DE FACTURA");
        int x;
        for (x = 0; x < arregloFactura.length; x++) {
            Factura f = new Factura();
            f.setNombreClienteF(JOptionPane.showInputDialog(null, "Digite el nombre del cliente  #" + (x + 1) + ": "));
            f.setFecha(JOptionPane.showInputDialog(null, "Digite la fecha de la compra #" + (x + 1) + ": "));
            f.setHora(JOptionPane.showInputDialog(null, "Digite la hora en la que se realizó la compra #" + (x + 1) + ": "));
            f.setMonto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el monto total de la compra #" + (x + 1) + ": ")));
            arregloFactura[x] = f;

        }
    }
    public void mostrarFacturas(){
        JOptionPane.showMessageDialog(null,"FACTURAS");
        int x;
        String s="";
        for(x=0;x<arregloFactura.length;x++,s=""){
            s=s+"FACTURA #"+(x+1)+"\n\n"
                    +"Nombre: "+arregloFactura[x].getNombreClienteF()+"\n"
                    +"Fecha:"+arregloFactura[x].getFecha()+"\n"
                    +"Hora: "+arregloFactura[x].getHora()+"\n"
                    +"Total a pagar: "+arregloFactura[x].getMonto()+"\n\n";
            JOptionPane.showMessageDialog(null, "FACTURAS\n\n"+s);
        }
    }
    public void anularFacturas(){
        int opc;
        JOptionPane.showMessageDialog(null, "ANULACION DE FACTURAS");
        opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Factura que desea anular\n\n"+
                "1. Factura #1\n"+
                "2. Factura #2\n"+
                "3. Factura #3\n"));
        while(opc<1 || opc>3){
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"PORFAVOR DIGITE UNA OPCION CORRECTA!\n"+
                    "Digite el numero de Factura que desea anular\n\n"+
                    "1. Factura #1\n"+
                    "2. Factura #2\n"+
                    "3. Factura #3\n"));
        }
        Factura f = new Factura();
        f.setNombreClienteF("ANULADA");
        f.setFecha("ANULADA");
        f.setHora("ANULADA");
        f.setMonto(0.00);
        arregloFactura[opc-1] = f;
    }
}