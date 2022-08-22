import javax.swing.*;

public class RutinaRegistroUsuarios {
RUsuarioCliente arregloRegistroUsuarioCliente[]=new RUsuarioCliente[3];

public void llenarArregloRegistroUsuarioCliente(){
    JOptionPane.showMessageDialog(null, "USUARIO / CLIENTE");
    int x;
    for (x = 0; x < arregloRegistroUsuarioCliente.length; x++) {
        RUsuarioCliente ruc = new RUsuarioCliente();
        ruc.setNombreUC(JOptionPane.showInputDialog(null, "Digite el nombre del Usuario / Cliente  #" + (x + 1) + ": "));
        ruc.setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del Usuario / Cliente #" + (x + 1) + ": "));
        ruc.setNickname(JOptionPane.showInputDialog(null, "Digite el nickname del Usuario / Cliente #" + (x + 1) + ": "));
        ruc.setTipo(JOptionPane.showInputDialog(null, "Digite si la persona #"+ (x + 1) +" es Usuario o Cliente: "));
        ruc.setContraseña(JOptionPane.showInputDialog(null, "Digite la contraseña del Usuario / Cliente #" + (x + 1) + ": "));
        ruc.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del Usuario / Cliente #" + (x + 1) + ": "));
        arregloRegistroUsuarioCliente[x] = ruc;
        }
    }
public void mostrarArregloRegistroUsuarioCliente(){
    JOptionPane.showMessageDialog(null,"USUARIOS / CLIENTE REGISTRADOS");
    int x;
    String s="";
    for(x=0;x< arregloRegistroUsuarioCliente.length;x++,s=""){
        s=s+"USUARIOS / CLIENTES REGISTRADOS #"+(x+1)+"\n\n"
                +"Nombre: "+arregloRegistroUsuarioCliente[x].getNombreUC()+"\n"
                +"Apellidos:"+arregloRegistroUsuarioCliente[x].getApellidos()+"\n"
                +"Nickname: "+arregloRegistroUsuarioCliente[x].getNickname()+"\n"
                +"Tipo: "+arregloRegistroUsuarioCliente[x].getTipo()+"\n"
                +"Contraseña: "+arregloRegistroUsuarioCliente[x].getContraseña()+"\n"
                +"Estado: "+arregloRegistroUsuarioCliente[x].getEstado()+"\n\n";
        JOptionPane.showMessageDialog(null, "USUARIOS / CLIENTES\n\n"+s);
    }
}


public void consultarUsuarioCliente(){
        int x;
        String s="";
        String nomb;
        JOptionPane.showMessageDialog(null, "BUSCADOR DE USUARIOS / CLIENTES");
        nomb=JOptionPane.showInputDialog(null,
                "Digite el nombre del Usuario / Cliente a buscar:");
        for(x=0;x<arregloRegistroUsuarioCliente.length;x++){
            if(nomb.equals(arregloRegistroUsuarioCliente[x].getNombreUC()))
            {
                s=s+"USUARIOS / CLIENTES REGISTRADOS #"+(x+1)+"\n\n"
                        +"Nombre: "+arregloRegistroUsuarioCliente[x].getNombreUC()+"\n"
                        +"Apellidos:"+arregloRegistroUsuarioCliente[x].getApellidos()+"\n"
                        +"Nickname: "+arregloRegistroUsuarioCliente[x].getNickname()+"\n"
                        +"Tipo: "+arregloRegistroUsuarioCliente[x].getTipo()+"\n"
                        +"Contraseña: "+arregloRegistroUsuarioCliente[x].getContraseña()+"\n"
                        +"Estado: "+arregloRegistroUsuarioCliente[x].getEstado()+"\n\n";
                JOptionPane.showMessageDialog(null, "RESULTADO DE LA BUSQUEDA\n\n"+s);
            }
        }
    }
public void inactivarUsuarioCliente(){
        int opc;
        JOptionPane.showMessageDialog(null,"INACTIVACION DE CLIENTES");
        opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Usuario / Cliente que desea inactivar\n\n"+
                "1. Usuario / Cliente #1\n"+
                "2. Usuario / Cliente #2\n"+
                "3. Usuario / Cliente #3\n"));
        while(opc<1 || opc>3){
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"PORFAVOR DIGITE UNA OPCION CORRECTA!\n"+
                    "Digite el numero de Usuario / Cliente que desea inactivar\n\n"+
                    "1. Usuario / Cliente #1\n"+
                    "2. Usuario / Cliente #2\n"+
                    "3. Usuario / Cliente #3\n"));
        }
    RUsuarioCliente ruc = new RUsuarioCliente();
    ruc.setNickname("INACTIVO");
    ruc.setTipo("INACTIVO");
    ruc.setContraseña("INACTIVO");
    ruc.setEstado("INACTIVO");
    arregloRegistroUsuarioCliente[opc-1] = ruc;

    }
}
