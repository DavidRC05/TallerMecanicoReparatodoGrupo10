
import javax.swing.JOptionPane;
public class RutinaCatalogos {
    final private OperarioCliente arregloOperarioCliente[] = new OperarioCliente[5];
    final private Vehiculo arregloVehiculo[] = new Vehiculo[5];
    final private Reparacion arregloReparacion[] = new Reparacion[5];

    public void llenarArregloVehiculo() {
        JOptionPane.showMessageDialog(null, "LLENADO DEL CATALOGO DE VEHICULOS");
        int x;
        for (x = 0; x < arregloVehiculo.length; x++) {
            Vehiculo v = new Vehiculo();
            v.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del vehiculo #" + (x + 1) + ": "));
            v.setEstilo(JOptionPane.showInputDialog(null, "Digite el estilo del vehiculo #" + (x + 1) + ": "));
            v.setPaisDeOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen del vehiculo #" + (x + 1) + ": "));
            v.setCaracteristicas(JOptionPane.showInputDialog(null, "Digite las caracteristicas del vehiculo #" + (x + 1) + ": "));
            v.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del Vehiculo #" + (x + 1) + ": "));
            arregloVehiculo[x] = v;
            if (x != 0) {
                for (int y = 0; y < x; y++) {
                    if (arregloVehiculo[y] == arregloVehiculo[x]) {
                        JOptionPane.showMessageDialog(null, "El catalogo que quiere ingresar ya existe en el arreglo\n"
                                + "Porfavor ingrese un dato correcto!");
                        v.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del vehiculo #" + (x + 1) + ": "));
                        v.setEstilo(JOptionPane.showInputDialog(null, "Digite el estilo del vehiculo #" + (x + 1) + ": "));
                        v.setPaisDeOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen del vehiculo #" + (x + 1) + ": "));
                        v.setCaracteristicas(JOptionPane.showInputDialog(null, "Digite las caracteristicas del vehiculo #" + (x + 1) + ": "));
                        v.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del Vehiculo #" + (x + 1) + ": "));
                        arregloVehiculo[x] = v;
                    }
                }
            }
        }
    }

    public void llenarArregloOpeCli() {
        JOptionPane.showMessageDialog(null, "LLENADO DEL CATALOGO DE OPERARIOS / CLIENTES");
        int x;
        for (x = 0; x < arregloOperarioCliente.length; x++) {
            OperarioCliente p = new OperarioCliente();
            p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del operario / cliente #" + (x + 1) + ": "));
            p.setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del operario / cliente #" + (x + 1) + ": "));
            p.setCiudad(JOptionPane.showInputDialog(null, "Digite la ciudad del operario / cliente #" + (x + 1) + ": "));
            p.setDireccion(JOptionPane.showInputDialog(null, "Digite la direccion del operario / cliente #" + (x + 1) + ": "));
            p.setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el telefono del operario / cliente #" + (x + 1) + ": ")));
            p.setCorreo(JOptionPane.showInputDialog(null, "Digite el correo del operario / cliente #" + (x + 1) + ": "));
            p.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del operario / cliente #" + (x + 1) + ": "));
            arregloOperarioCliente[x] = p;
            if (x != 0) {
                for (int y = 0; y < x; y++) {
                    if (arregloOperarioCliente[y] == arregloOperarioCliente[x]) {
                        JOptionPane.showMessageDialog(null, "El catalogo que quiere ingresar ya existe en el arreglo\n"
                                + "Porfavor ingrese un dato correcto!");
                        p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del operario / cliente #" + (x + 1) + ": "));
                        p.setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del operario / cliente #" + (x + 1) + ": "));
                        p.setCiudad(JOptionPane.showInputDialog(null, "Digite la ciudad del operario / cliente #" + (x + 1) + ": "));
                        p.setDireccion(JOptionPane.showInputDialog(null, "Digite la direccion del operario / cliente #" + (x + 1) + ": "));
                        p.setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el telefono del operario / cliente #" + (x + 1) + ": ")));
                        p.setCorreo(JOptionPane.showInputDialog(null, "Digite el correo del operario / cliente #" + (x + 1) + ": "));
                        p.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del operario / cliente #" + (x + 1) + ": "));
                        arregloOperarioCliente[x] = p;
                    }
                }
            }
        }
    }

        public void llenarArregloReparacion () {
            JOptionPane.showMessageDialog(null, "LLENADO DEL CATALOGO DE REPARACIONES");
            int x;
            for (x = 0; x < arregloReparacion.length; x++) {
                Reparacion c = new Reparacion();
                c.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripción de la reparación #" + (x + 1) + ": "));
                c.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el costo de la reparacion #" + (x + 1) + ": ")));
                arregloReparacion[x] = c;
                if (x != 0) {
                    for (int y = 0; y < x; y++) {
                        if (arregloReparacion[y] == arregloReparacion[x]) {
                            JOptionPane.showMessageDialog(null, "El catalogo que quiere ingresar ya existe en el arreglo\n"
                                    + "Porfavor ingrese un dato correcto!");
                            c.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripción de la reparación #" + (x + 1) + ": "));
                            c.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el costo de la reparacion #" + (x + 1) + ": ")));
                            arregloReparacion[x] = c;
                        }
                    }
                }
            }
        }


        public void mostrarArregloVehiculo () {
            JOptionPane.showMessageDialog(null, "CATALOGO DE VEHICULOS");
            int x;
            String s = "";
            for (x = 0; x < arregloVehiculo.length; x++, s = "") {
                s = s + "VEHICULO #" + (x + 1) + "\n\n"
                        + "Marca: " + arregloVehiculo[x].getMarca() + "\n"
                        + "Estilo:" + arregloVehiculo[x].getEstilo() + "\n"
                        + "Pais de Origen: " + arregloVehiculo[x].getPaisDeOrigen() + "\n"
                        + "Caracteristicas: " + arregloVehiculo[x].getCaracteristicas() + "\n"
                        + "Estado: " + arregloVehiculo[x].getEstado() + "\n\n";
                JOptionPane.showMessageDialog(null, "CATALOGO DE VEHICULOS\n\n" + s);
            }
        }

        public void mostrarArregloOpeCli () {
            JOptionPane.showMessageDialog(null, "CATALOGO DE OPERARIOS / CLIENTES");
            int x;
            String s = "";
            for (x = 0; x < arregloOperarioCliente.length; x++, s = "") {
                s = s + "OPERARIO / CLIENTE #" + (x + 1) + "\n\n"
                        + "Nombre: " + arregloOperarioCliente[x].getNombre() + "\n"
                        + "Apellido: " + arregloOperarioCliente[x].getApellidos() + "\n"
                        + "Ciudad: " + arregloOperarioCliente[x].getCiudad() + "\n"
                        + "Direccion: " + arregloOperarioCliente[x].getDireccion() + "\n"
                        + "Telefono: " + arregloOperarioCliente[x].getTelefono() + "\n"
                        + "Correo Electronico: " + arregloOperarioCliente[x].getCorreo() + "\n"
                        + "Estado: " + arregloOperarioCliente[x].getEstado() + "\n\n";
                JOptionPane.showMessageDialog(null, "CATALOGO DE OPERARIOS / CLIENTES\n\n" + s);
            }
        }

        public void mostrarArregloReparacion () {
            JOptionPane.showMessageDialog(null, "CATALOGO DE REPARACIONES");
            int x;
            String s = "";
            for (x = 0; x < arregloReparacion.length; x++, s = "") {
                s = s + "REPARACION #" + (x + 1) + "\n\n"
                        + "Descripcion: " + arregloReparacion[x].getDescripcion() + "\n"
                        + "Costo: " + arregloReparacion[x].getCosto() + "\n\n";
                JOptionPane.showMessageDialog(null, "CATALOGO DE REPARACIONES\n\n" + s);
            }
        }

        public void editarArregloVehiculo () {
            int cata;
            JOptionPane.showMessageDialog(null, "EDICION DE CATALOGOS DE VEHICULOS");
            cata = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea editar\n\n" +
                    "1. Catalogo de vehiculo #1\n" +
                    "2. Catalogo de vehiculo #2\n" +
                    "3. Catalogo de vehiculo #3\n" +
                    "4. Catalogo de vehiculo #4\n" +
                    "5. Catalogo de vehiculo #5"));
            while (cata > 5 || cata < 1) {
                cata = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR INGRESE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea editar\n\n" +
                        "1. Catalogo de vehiculo #1\n" +
                        "2. Catalogo de vehiculo #2\n" +
                        "3. Catalogo de vehiculo #3\n" +
                        "4. Catalogo de vehiculo #4\n" +
                        "5. Catalogo de vehiculo #5"));
            }
            Vehiculo v = new Vehiculo();
            v.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del vehiculo en el catalogo " + cata));
            v.setEstilo(JOptionPane.showInputDialog(null, "Digite el estilo del vehiculo en el catalogo " + cata));
            v.setPaisDeOrigen(JOptionPane.showInputDialog(null, "Digite el pais de origen del vehiculo en el catalogo " + cata));
            v.setCaracteristicas(JOptionPane.showInputDialog(null, "Digite las caracteristicas del vehiculo en el catalogo " + cata));
            v.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del Vehiculo en el catalogo " + cata));
            arregloVehiculo[cata - 1] = v;

        }

        public void editarArregloOpeCli () {
            int cata;
            JOptionPane.showMessageDialog(null, "EDICION DE CATALOGOS DE OPERARIOS / CLIENTES");
            cata = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea editar\n\n" +
                    "1. Catalogo de Operario / Cliente #1\n" +
                    "2. Catalogo de Operario / Cliente #2\n" +
                    "3. Catalogo de Operario / Cliente #3\n" +
                    "4. Catalogo de Operario / Cliente #4\n" +
                    "5. Catalogo de Operario / Cliente #5"));
            while (cata > 5 || cata < 1) {
                cata = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR INGRESE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea editar\n\n" +
                        "1. Catalogo de Operario / Cliente #1\n" +
                        "2. Catalogo de Operario / Cliente #2\n" +
                        "3. Catalogo de Operario / Cliente #3\n" +
                        "4. Catalogo de Operario / Cliente #4\n" +
                        "5. Catalogo de Operario / Cliente #5"));
            }
            OperarioCliente p = new OperarioCliente();
            p.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del operario / cliente del catalogo " + cata));
            p.setApellidos(JOptionPane.showInputDialog(null, "Digite los apellidos del operario / cliente del catalogo " + cata));
            p.setCiudad(JOptionPane.showInputDialog(null, "Digite la ciudad del operario / cliente del catalogo " + cata));
            p.setDireccion(JOptionPane.showInputDialog(null, "Digite la direccion del operario / cliente del catalogo " + cata));
            p.setTelefono(Long.parseLong(JOptionPane.showInputDialog(null, "Digite el telefono del operario / cliente del catalogo " + cata)));
            p.setCorreo(JOptionPane.showInputDialog(null, "Digite el correo del operario / cliente del catalogo " + cata));
            p.setEstado(JOptionPane.showInputDialog(null, "Digite el estado del operario / cliente del catalogo " + cata));
            arregloOperarioCliente[cata - 1] = p;


        }
        public void editarArregloReparacion () {
            int cata;
            JOptionPane.showMessageDialog(null, "EDICION DE CATALOGOS DE OPERARIOS / CLIENTES");
            cata = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea editar\n\n" +
                    "1. Catalogo de Reparacion #1\n" +
                    "2. Catalogo de Reparacion #2\n" +
                    "3. Catalogo de Reparacion #3\n" +
                    "4. Catalogo de Reparacion #4\n" +
                    "5. Catalogo de Reparacion #5"));
            while (cata > 5 || cata < 1) {
                cata = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR INGRESE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea editar\n\n" +
                        "1. Catalogo de Reparacion #1\n" +
                        "2. Catalogo de Reparacion #2\n" +
                        "3. Catalogo de Reparacion #3\n" +
                        "4. Catalogo de Reparacion #4\n" +
                        "5. Catalogo de Reparacion #5"));
            }
            Reparacion c = new Reparacion();
            c.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripción de la reparación del catalogo " + cata));
            c.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el costo de la reparacion del catalogo " + cata)));
            arregloReparacion[cata - 1] = c;
        }
        public void inactivarArregloVehiculo () {
            int opc;
            JOptionPane.showMessageDialog(null, "INACTIVACION DE CATALOGO DE VEHICULOS");
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea inactivar\n\n" +
                    "1. Catalogo de vehiculo #1\n" +
                    "2. Catalogo de vehiculo #2\n" +
                    "3. Catalogo de vehiculo #3\n" +
                    "4. Catalogo de vehiculo #4\n" +
                    "5. Catalogo de vehiculo #5"));
            while (opc < 1 || opc > 5) {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR DIGITE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea inactivar\n\n" +
                        "1. Catalogo de vehiculo #1\n" +
                        "2. Catalogo de vehiculo #2\n" +
                        "3. Catalogo de vehiculo #3\n" +
                        "4. Catalogo de vehiculo #4\n" +
                        "5. Catalogo de vehiculo #5"));
            }
            Vehiculo v = new Vehiculo();
            v.setMarca("INACTIVO");
            v.setEstilo("INACTIVO");
            v.setPaisDeOrigen("INACTIVO");
            v.setCaracteristicas("INACTIVO");
            v.setEstado("INACTIVO");
            arregloVehiculo[opc - 1] = v;
        }
        public void inactivarArregloOpeCli () {
            int opc;
            JOptionPane.showMessageDialog(null, "INACTIVACION DE CATALOGO DE OPERARIOS / CLIENTES");
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea inactivar\n\n" +
                    "1. Catalogo de Operario / Cliente #1\n" +
                    "2. Catalogo de Operario / Cliente #2\n" +
                    "3. Catalogo de Operario / Cliente #3\n" +
                    "4. Catalogo de Operario / Cliente #4\n" +
                    "5. Catalogo de Operario / Cliente #5"));
            while (opc < 1 || opc > 5) {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR DIGITE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea inactivar\n\n" +
                        "1. Catalogo de Operario / Cliente #1\n" +
                        "2. Catalogo de Operario / Cliente #2\n" +
                        "3. Catalogo de Operario / Cliente #3\n" +
                        "4. Catalogo de Operario / Cliente #4\n" +
                        "5. Catalogo de Operario / Cliente #5"));
            }
            OperarioCliente p = new OperarioCliente();
            p.setNombre("INACTIVO");
            p.setApellidos("INACTIVO");
            p.setCiudad("INACTIVO");
            p.setDireccion("INACTIVO");
            p.setTelefono(0);
            p.setCorreo("INACTIVO");
            p.setEstado("INACTIVO");
            arregloOperarioCliente[opc - 1] = p;
        }
        public void inactivarArregloReparacion(){
            int opc;
            JOptionPane.showMessageDialog(null, "INACTIVACION DE CATALOGO DE REPARACIONES");
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero del catalogo que desea inactivar\n\n" +
                    "1. Catalogo de Reparacion #1\n" +
                    "2. Catalogo de Reparacion #2\n" +
                    "3. Catalogo de Reparacion #3\n" +
                    "4. Catalogo de Reparacion #4\n" +
                    "5. Catalogo de Reparacion #5"));
            while (opc < 1 || opc > 5) {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "PORFAVOR DIGITE UNA OPCION CORRECTA!\n" +
                        "Digite el numero del catalogo que desea inactivar\n\n" +
                        "1. Catalogo de Reparacion #1\n" +
                        "2. Catalogo de Reparacion #2\n" +
                        "3. Catalogo de Reparacion #3\n" +
                        "4. Catalogo de Reparacion #4\n" +
                        "5. Catalogo de Reparacion #5"));
            }
            Reparacion c = new Reparacion();
            c.setDescripcion("INACTIVO");
            c.setCosto(0.00);
            arregloReparacion[opc - 1] = c;
        }
}

