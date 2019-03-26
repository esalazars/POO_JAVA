/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author UNAL
 */
import java.util.HashMap;
import java.util.Map;

public class Message {

    public static HashMap<String,String> Esp = new HashMap<String,String>();
    public static HashMap<String,String> Eng = new HashMap<String,String>();

    public Message(){

        Esp.put("SeleccionIdioma", "=================================\n=== Bienvenido a Travel World ===\n=================================\n1. Español\n2. Ingles\nSeleccione un idioma:");
        Esp.put("Principal", "\n1. Iniciar Sesión.\n2. Registrarse.\n3. Buscar productos.\n4. Salir.\nOpción:");
        Esp.put("Principal2", "\n1. Buscar Productos.\n2. Cerrar Sesion.\n3. Modificar Datos.\n");
        Esp.put("Principal3", "\nSeleccione lo que desea modificar:\n1. Nombre.\n2. Pais.\n3. Numero telefono.\n4. Fecha de nacimiento.\n5. E-mail\n6. Targeta de credito.\n7. Direccion.\n8. Contraseña.");
        Esp.put("Principal4", "\nPor favor escoje lo que deseas buscar:\n1. Vuelos.\n2. Habitaciones de hotel.\n3.Cancelar busqueda.");
        Esp.put("CargandoDatos", "Cargando datos del sistema...");
        Esp.put("DatosCargados", "Datos cargados exitosamente.");
        Esp.put("GuardandoDatos", "Guardando datos...");
        Esp.put("DatosGuardados", "Datos guardados exitosamente.");
        Esp.put("ErrorCargando", "Error cargando datos del sistema.");
        Esp.put("ErrorGuardando", "Error guardando datos del sistema.");
        Esp.put("IntenteDeNuevo", "Intente de nuevo.");
        Esp.put("Reiniciando", "Reiniciado...");
        Esp.put("FinalizandoPrograma", "Finalizando programa...\nAdios.");
        Esp.put("LeneInformacion", "Por favor llene la siguiente informacion:");
        Esp.put("CuentaCreada", "Cuenta creada exitosamente");
        Esp.put("IDExiste", "ID existente. Por favor intente otro.");
        Esp.put("PedirID", "Ingrese ID de Usuario:");
        Esp.put("PedirNombre", "Ingrese nombre de usuario:");
        Esp.put("PedirPais", "Ingrese el Pais:");
        Esp.put("PedirContraseña", "Ingrese contraseña:");
        Esp.put("TipoDocumento", "Tipo de documento:");
        Esp.put("PedirEmail", "Ingresa el E-mail:");
        Esp.put("SeccionIniciada", "Sesión iniciada correctamente.\nBienvenido");
        Esp.put("ErrorIniciando", "Error iniciando sesión. Por favor intente de nuevo.");
        Esp.put("ContraseñaIncorrecta", "Contraseña incorrecta. Por favor intente de nuevo.");
        Esp.put("IDNoExiste", "ID inexistente. Por favor intente de nuevo.");
        Esp.put("PedirFechaNacimiento", "Ingrese fecha de nacimiento(aaaa/mm/dd):");
        Esp.put("ErrorFecha", "Error ingresando fecha, intentelo de nuevo siguiente el formato(aaaa/mm/dd).");
        Esp.put("PedirTelefono", "Ingrese numero telefonico:");
        Esp.put("PedirDireccion", "Ingrese direccion:");
        Esp.put("PedirTarjeta", "Ingrese numero tarjeta bancaria:");
        Esp.put("RecuperarContraseña", "Selecciona 1 para recuperar contraseña");
        Esp.put("OpcionInvalida", "Opcion invalida. Por favor intente de nuevo.");
        Esp.put("PedirRangoPrecio", "Por favor seleccione el rango de precio");
        Esp.put("Minimo", "Valor Minimo: ");
        Esp.put("Maximo", "Valor maximo: ");
        Esp.put("SeleccionarCompra", "Seleccione la id del producto que desea comprar");
        Esp.put("ProductoComprado", "Producto comprado exitosamente");
        Esp.put("InformacionModificada", "Informacion de la cuenta modificada exitosamente");
        Esp.put("SesionCerrada", "Sesion cerrada");
        Esp.put("SeleccionHistorial", "4. Mostrar historial de compras");
        Esp.put("SeleccionCancelarCompra", "5. Cancelar compra");
        Esp.put("ProductoParaCancelar", "Seleccione el producto que desee cancelar");
        Esp.put("SeleccionCerrarPrograma", "5. Cerrar Programa");
        Esp.put("Factura", "--------------------------");
        Esp.put("Subtotal", "Subtotal:             ");
        Esp.put("IVA", "IVA:                 ");
        Esp.put("Total", "Total:             ");
        Esp.put("Vacio", "");
        Esp.put("Fecha", "Fecha: ");
        Esp.put("NumeroFactura", "Numero de factura ");
        Esp.put("Cliente", "Cliente");
        Esp.put("Codigo/Valor", "Codigo producto  |   Valor");

        Eng.put("Principal", "\n1. Log In.\n2. Sign Up.\n3. Search products.\n4. Go Out.\nOption:");
        Eng.put("Principal2", "\n1. Search Products.\n2. Close Session.\n3.Modify Data.");
        Eng.put("Principal3", "\nSelect what you want to change:\n1. Name.\n2. Country.\n3. Phone number.\n4 Date of birth.\n5. E-mail.\n6 .Credit card.\n7 Address.\n8. Password.");
        Eng.put("Principal4", "\nPlease choose what you want to search for:\n1. Flights.\n2. Hotel rooms.\n3.Cancel search.");
        Eng.put("CargandoDatos", "Loading system data ...");
        Eng.put("DatosCargados", "Data loaded successfully.");
        Eng.put("GuardandoDatos", "Saving data ...");
        Eng.put("DatosGuardados", "Data saved successfully.");
        Eng.put("ErrorCargando", "Error loading system data.");
        Eng.put("ErrorGuardando", "Error loading system data.");
        Eng.put("IntenteDeNuevo", "Try again.");
        Eng.put("Reiniciando", "Reloading...");
        Eng.put("FinalizandoPrograma", "Finishing program...\\nBye.");
        Eng.put("LeneInformacion", "Please provide the following information:");
        Eng.put("CuentaCreada", "Account created succesfully");
        Eng.put("IDExiste", "ID already registered. Please try a different one");
        Eng.put("PedirID", "Enter User ID:");
        Eng.put("PedirNombre", "Enter username:");
        Eng.put("PedirPais", "Enter country:");
        Eng.put("PedirContraseña", "Ingrese contraseña:");
        Eng.put("TipoDocumento", "Tipo de documento:");
        Eng.put("PedirEmail", "Ingresa el E-mail:");
        Eng.put("SeccionIniciada", "Sesión iniciada correctamente.\nBienvenido");
        Eng.put("ErrorIniciando", "Error iniciando sesión. Por favor intente de nuevo.");
        Eng.put("ContraseñaIncorrecta", "Contraseña incorrecta. Por favor intente de nuevo.");
        Eng.put("IDNoExiste", "ID inexistente. Por favor intente de nuevo.");
        Eng.put("PedirFechaNacimiento", "Enter birthdate(yyyy/mm/dd):");
        Eng.put("ErrorFecha", "Error entering date, try again following the format yyyy/mm/dd.");
        Eng.put("PedirTelefono", "Enter phone number:");
        Eng.put("PedirDireccion", "Enter address:");
        Eng.put("PedirTarjeta", "Enter bank card number:");
        Eng.put("RecuperarContraseña", "Press 1 to recover your password");
        Eng.put("OpcionInvalida", "Invalid input. Please try again.");
        Eng.put("PedirRangoPrecio", "Please select price range");
        Eng.put("Minimo", "Min price: ");
        Eng.put("Maximo", "Max price: ");
        Eng.put("SeleccionarCompra", "Select product id to purchase");
        Eng.put("ProductoComprado", "Product purchased succesfully");
        Eng.put("InformacionModificada", "Account information succesfully modified");
        Eng.put("SesionCerrada", "Logged out succesfully");
        Eng.put("SeleccionHistorial", "4. Show purchase history");
        Eng.put("SeleccionCancelarCompra", "5. Cancel purchase");
        Eng.put("ProductoParaCancelar", "Please select the purchase you would like to cancel");
        Eng.put("SeleccionCerrarPrograma", "5. Close Program");
        Eng.put("Factura", "--------------------------");
        Eng.put("Subtotal", "Subtotal:             ");
        Eng.put("IVA", "IVA:                 ");
        Eng.put("Total", "Total:             ");
        Eng.put("Vacio", "");
        Eng.put("Fecha", "Date: ");
        Eng.put("NumeroFactura", "Receipt no. ");
        Eng.put("Cliente", "Customer");
        Eng.put("Codigo/Valor", "Product id  |   Amount Paid");
    }

    public static void getmensajesesp(String key) {
        System.out.println(Esp.get(key));
    }

    public static void getmensajeseng(String key) {
        System.out.println(Eng.get(key));
    }

}

