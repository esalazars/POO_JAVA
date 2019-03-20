// Empece con la clase principal antes de que nos coja la tarde. Sin interfaz grafica por ahora


package TravelWorld;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TravelWorld {

    /**
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mensajes.Mensajes();
        Mensajes.getmensajesesp("SeleccionIdioma");
        String opcion = scan.next();
        String opcion2;
        if (!opcion.equals("1") && !opcion.equals("2")) {
            Mensajes.getmensajesesp("SeleccionIdioma");
        } else if (opcion == "1") {
            Mensajes.getmensajesesp("Principal");
        } else {
            Mensajes.getmensajeseng("Principal");
        }
        opcion2 = scan.next();
        if (opcion.equals("1")) {
            if (opcion2.equals("1")) {
                Mensajes.getmensajesesp("PedirNombre");
                String Nombre = scan.next();
                Mensajes.getmensajesesp("PedirEmail");
                String Email = scan.next();
                Mensajes.getmensajesesp("PedirContraseña");
                String Contraseña = scan.next();
                Mensajes.getmensajesesp("PedirPais");
                String Pais = scan.next();
                Mensajes.getmensajesesp("PedirTelefono");
                String Telefono = scan.next();
                Mensajes.getmensajesesp("PedirDireccion");
                String Direccion = scan.next();

            } else if (opcion2.equals("2")) {
            } else if (opcion2.equals("3")) {
            } else if (opcion2.equals("4")) {
            }
        } else if (opcion.equals("2")){
            if (opcion2.equals("1")) {
                Mensajes.getmensajeseng("PedirNombre");
                String Nombre = scan.next();
                Mensajes.getmensajeseng("PedirEmail");
                String Email = scan.next();
                Mensajes.getmensajeseng("PedirContraseña");
                String Contraseña = scan.next();
                Mensajes.getmensajeseng("PedirPais");
                String Pais = scan.next();
                Mensajes.getmensajeseng("PedirTelefono");
                String Telefono = scan.next();
                Mensajes.getmensajeseng("PedirDireccion");
                String Direccion = scan.next();

            } else if (opcion2.equals("2")) {
            } else if (opcion2.equals("3")) {
            } else if (opcion2.equals("4")) {
            }
        }
    }

}
