import javax.swing.JOptionPane;
public class MenuPrincipal {
    private int mod1, mod2, mod3, mod4, mod5;

    public void mostrarMenu() {
        while (mod1 != 5) {
            mod1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MENÚ PRINCIPAL   \n\n"
                            + "1. Registro de Usuarios\n"
                            + "2. Catalogos\n"
                            + "3. Facturas\n"
                            + "4. Cajas\n"
                            + "5. Salir del Menú\n\n"
                            + "Digite el numero de opción: "));
            switch (mod1) {
                case 1: {
                    mostrarModuloUsuarios();
                    mod2=0;
                    break;
                }
                case 2: {
                    mostrarModuloCatalogos();
                    mod3=0;
                    break;
                }
                case 3: {
                    mostrarModuloFacturas();
                    mod4=0;
                    break;
                }
                case 4: {
                    mostarModuloCajas();
                    mod5=0;
                    break;
                }
                case 5: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostrarModuloUsuarios() {
        RutinaRegistroUsuarios ru = new RutinaRegistroUsuarios();
        while (mod2 != 5) {
            mod2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE REGISTRO DE USUARIOS   \n\n"
                            + "1. Agregar Usuario / Cliente\n"
                            + "2. Mostrar Usuarios / Clientes\n"
                            + "3. Buscar Usuarios / Clientes\n"
                            + "4. Inactivar Usuario / Cliente\n"
                            + "5. Regresar\n\n"
                            + "Digite su opción:"));
            switch (mod2) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "AGREGAR USUARIO / CLIENTE");
                    ru.llenarArregloRegistroUsuarioCliente();
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "MOSTRAR USUARIOS / CLIENTES");
                    ru.mostrarArregloRegistroUsuarioCliente();
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "BUSCAR USUARIO / CLIENTE");
                    ru.consultarUsuarioCliente();
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, "INACTIVAR USUARIO / CLIENTE");
                    ru.inactivarUsuarioCliente();
                    break;
                }
                case 5:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostrarModuloCatalogos() {
        RutinaCatalogos rc = new RutinaCatalogos();
        int x;
        int y;
        int z;
        while (mod3 != 5) {
            mod3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE CATALOGOS   \n\n"
                            + "1. Agregar Catalogos\n"
                            + "2. Mostrar Catalogos\n"
                            + "3. Editar Catalogos\n"
                            + "4. Inactivar Catalogos\n"
                            + "5. Regresar\n\n"
                            + "Digite su opción:"));
            switch (mod3) {
                case 1: {
                    JOptionPane.showMessageDialog(null, "AGREGAR CATALOGOS");
                    rc.llenarArregloOpeCli();
                    rc.llenarArregloVehiculo();
                    rc.llenarArregloReparacion();
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "MOSTRAR CATALOGOS");
                    x=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite 1 para recorrer el catalogo de Operarios / Clientes\n"
                    +"Digite 2 para recorrer el catalogo de Vehiculos\n"
                    +"Digite 3 para recorrer el catalogo de Reparaciones\n"
                    +"Digite 4 para recorrer todos los catalogos\n"+
                    "Digite un numero diferente para salir\n\n"+": "));
                    if (x==1){
                        rc.mostrarArregloOpeCli();
                    }else if (x==2){
                        rc.mostrarArregloVehiculo();
                    }else if (x==3){
                        rc.mostrarArregloReparacion();
                    }else if (x==4){
                        rc.mostrarArregloOpeCli();
                        rc.mostrarArregloVehiculo();
                        rc.mostrarArregloReparacion();
                    }else{
                        break;
                    }
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, "EDITAR CATALOGOS");
                    y=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite 1 para editar el catalogo de Operarios / Clientes\n"
                                    +"Digite 2 para editar el catalogo de Vehiculos\n"
                                    +"Digite 3 para editar el catalogo de Reparaciones\n"
                                    +"Digite un numero diferente para salir\n\n"+": "));
                    if (y==1){
                        rc.editarArregloOpeCli();
                    }else if (y==2){
                        rc.editarArregloVehiculo();
                    }else if (y==3){
                        rc.editarArregloReparacion();
                    }else{
                        break;
                    }
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, "INACTIVAR CATALOGOS");
                    z=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite 1 para inactivar el catalogo de Operarios / Clientes\n"
                                    +"Digite 2 para inactivar el catalogo de Vehiculos\n"
                                    +"Digite 3 para inactivar el catalogo de Reparaciones\n"
                                    +"Digite un numero diferente para salir\n\n"+": "));
                    if (z==1){
                        rc.inactivarArregloOpeCli();
                    }else if (z==2){
                        rc.inactivarArregloVehiculo();
                    }else if (z==3){
                        rc.inactivarArregloReparacion();
                    }else{
                        break;
                    }
                    break;
                }
                case 5:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostrarModuloFacturas(){
        RutinaFactura rf = new RutinaFactura();
        while (mod4!=4){
            mod4=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE FACTURAS   \n\n"
            +"1. Emitir facturas\n"
            +"2. Mostrar facturas\n"
            +"3. Anular facturas\n"
            +"4. Regresar\n\n"
            +"Digite su opcion: "));

            switch (mod4){

                case 1:{
                    JOptionPane.showMessageDialog(null, "EMITIR FACTURAS");
                    rf.emitirFactura();
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null,"MOSTRAR FACTURAS");
                    rf.mostrarFacturas();
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null,"ANULAR FACTURAS");
                    break;
                }
                case 4:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
    public void mostarModuloCajas(){
        while (mod5!=3){
            mod5=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "   MODULO DE CAJAS   \n\n"
            +"1. Sumar ingresos del dia\n"
            +"2. Mostrar ingresos del dia\n"
            +"3. Regresar\n\n"));

            switch (mod5){

                case 1:{
                    JOptionPane.showMessageDialog(null, "SUMA DE INGRESOS");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null, "MOSTRAR INGRESOS");
                    break;
                }
                case 3:{
                    mostrarMenu();
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,
                            "\nPorfavor ingrese una opcion correcta!\n");
                }
            }
        }
    }
}
