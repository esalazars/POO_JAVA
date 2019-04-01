/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author UNAL
 */
public class Message {

    public static HashMap<String, String> ENG = new HashMap<String, String>() {
        {
            put("eng","English");
            put("esp","Spanish");
            put("w1", "Welcome");
            put("w2", "Travel World is a Web company dedicated to the fast and secure commercialization of national and international flights at modest prices.");
            put("op0","Options");
            put("op1", "Log In");
            put("op2", "Flights");
            put("op3", "Sign Up");
            put("op4", "Close Session");
            put("op5", "Modify Data");
            put("op6", "Fictitious Data");
            put("op7", "Purchase history");

            put("id", "Language");
            put("id1", "Spanish");
            put("id2", "English");

            put("b", "Search");
            put("b1", "Search Flights");
            put("b2", "Search Ticket");
            put("b3", "Find Invoice");
            put("b4", "Price Range");
            put("b5", "Minimum Value");
            put("b6", "Maximum value");
            
            put ("f0", "The flights currently available are listed below");
            put ("f1", "Origin");
            put ("f2", "Destination");
            put ("f3", "Departure Airport");
            put ("f4", "Arrival Airport");put ("f5", "Code");
            put ("f6", "Price");
            put ("f7", "Maximum Passagers");
            put ("f8", "Departure Date");
            put ("f9", "Arrival Date");
            put ("f10", "Boarding Door");
            put ("f11", "Available Seating");
            put ("f12", "Airplane");
            put ("f13", "Airline");
            put ("f14", "Approach Time");
            
            put("prof", "Profile");

            put("mod", "Modify Data");
            put("mod1", "Modify Ticket");
            put("mod2", "Modify Profile");
            put("mod3", "Successfully modified profile");

            put("data", "Information");
            put("data1", "Name");
            put("data2", "Country");
            put("data3", "Phone number");
            put("data4", "Date of birth");
            put("data5", "E-mail");
            put("data6", "Address");
            put("data7", "Password");
            put("data8", "Document Type");
            put("data9", "Document Number");
            put("data10", "Date of Birth");
            put("data11", "Code");
            put("data12", "Date");

            put("rec1", "Try again");
            put("rec2", "Restarting ...");
            put("sign", "Account successfully created");
            put("sign1", "Existing ID. Please try another.");
            put("sign2", "Non-existent ID. Please try again.");
            put("sign3", "Incorrect password, please try again.");
            put("sign4", "Session started successfully");
            put("sign5", "Error logging in.");
            put("sign6", "Recover password");
            put("sign7", "Session closed");

            put("buy", "Product");
            put("buy0", "Products");
            put("buy1", "Product successfully purchased");
            put("buy2", "Cancel purchase");

            put("f", "Invoice");
            put("f1", "Subtotal");
            put("f2", "IVA");
            put("f3", "Total");
            put("f4", "Invoice number");
            
            put ("load1", "Creation of fictitious data");
            put ("load2", "Loading customer data ...");
            put ("load3", "Customer data loaded successfully");
            put ("load4", "Failure trying to load Customer Data, try again.");
            put ("load5", "Loading flight data ...");
            put ("load6", "Flight data loaded successfully");
            put ("load7", "Failure trying to load Flight Data, try again");
            put ("load8", "Loading airline data ...");
            put ("load9", "Data of Airlines loaded successfully");
            put ("load10", "Failure trying to load Airlines Data, try again");
        }
    };
    public static HashMap<String, String> ESP = new HashMap<String, String>() {
        {
            put("eng","Ingles");
            put("esp","Español");
            put("w1", "Bienvenido");
            put("w2", "Travel World es una empresa Web dedicada a la comercializacion de manera rapida y segura de tiquetes de vuelos nacionales e internacionales a modicos precios.");
            put("op0","Opciones");
            put("op1", "Iniciar Sesión");
            put("op2", "Vuelos");
            put("op3", "Registrarse");
            put("op4", "Cerrar Sesion");
            put("op5", "Modificar Datos");
            put("op6", "Datos Ficticios");
            put("op7", "Historial de compras");

            put("id", "Idioma");
            put("id1", "Español");
            put("id2", "Ingles");

            put("b", "Buscar");
            put("b1", "Buscar Vuelos");
            put("b2", "Buscar Tiquete");
            put("b3", "Buscar Factura");
            put("b4", "Rango de Precio");
            put("b5", "Valor Minimo");
            put("b6", "Valor maximo");

            put("f0","Los vuelos actualmentes disponibles son listados a continuacion");
            put("f1","Origen");
            put("f2","Destino");
            put("f3","Aeropuerto de Salida");
            put("f4","Aeropuerto de Llegada");
            put("f5","Codigo");
            put("f6","Precio");
            put("f7","Pasageros maximos");
            put("f8","Fecha de Partida");
            put("f9","Fecha de LLegada");
            put("f10","Puerta de Abordaje");
            put("f11","Asientos Disponibles");
            put("f12","Avion");
            put("f13","Aerolinea");
            put("f14","Hora de Abordaje");
            
            put("prof", "Perfil");

            put("mod", "Modificar Datos");
            put("mod1", "Modificar Tiquete");
            put("mod2", "Modificar Perfil");
            put("mod3", "Perfil modificado exitosamente");

            put("data", "Informacion");
            put("data1", "Nombre");
            put("data2", "Pais");
            put("data3", "Numero telefonico");
            put("data4", "Fecha de nacimiento");
            put("data5", "E-mail");
            put("data6", "Direccion");
            put("data7", "Contraseña");
            put("data8", "Tipo Documento");
            put("data9", "Numero Documento");
            put("data10", "Fecha de Nacimiento");
            put("data11", "Codigo");
            put("data12", "Fecha");
            

            put("rec1", "Intente de nuevo");
            put("rec2", "Reiniciando...");

            put("sign", "Cuenta creada exitosamente");
            put("sign1", "ID existente. Por favor intente otro.");
            put("sign2", "ID inexistente. Por favor intente de nuevo.");
            put("sign3", "Contraseña incorrecta. Por favor intente de nuevo.");
            put("sign4", "Sesión iniciada correctamente");
            put("sign5", "Error iniciando sesión.");
            put("sign6", "Recuperar contraseña");
            put("sign7", "Sesion cerrada");
            put("buy", "Producto");
            put("buy0", "Productos");
            put("buy1", "Producto comprado exitosamente");
            put("buy2", "Cancelar compra");

            put("f", "Factura");
            put("f1", "Subtotal");
            put("f2", "IVA");
            put("f3", "Total");
            put("f4", "Numero de factura");
            
            put("load0","Creacion de datos ficticios");
            put("load1","Imprimiendo resultados de la carga de datos");
            put("load2","Cargando datos de clientes...");
            put("load3","Datos de Clientes cargados de manera exitosa.");
            put("load4","Fracaso intentando cargar Datos de Clientes, intente de nuevo.");
            put("load5","Cargando datos de vuelos...");
            put("load6","Datos de Vuelos cargados de manera exitosa");
            put("load7","Fracaso intentando cargar Datos de Vuelos, intente de nuevo");
            put("load8","Cargando datos de aerolineas...");
            put("load9","Datos de Aerolineas cargados de manera exitosa");
            put("load10","Fracaso intentando cargar Datos de Aerolineas, intente de nuevo");
            put("load11","Finalizar y volver a inicio");
        }
    };
}
