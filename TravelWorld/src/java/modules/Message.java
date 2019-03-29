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

    public static HashMap<String, String> Leng = new HashMap<String, String>();
//    public static HashMap<String,String> Eng = new HashMap<String,String>();

    public static void init_Lenguage(String leng) {
        if (!Message.Leng.isEmpty()) {
//            Message.Leng.clear();
            if (leng.equals("esp")) {
                Message.Leng.put("w1", "Bienvenido");
                Message.Leng.put("w2", "Travel World es una empresa Web dedicada a la comercializacion de manera rapida y segura de tiquetes de vuelos nacionales e internacionales a modicos precios.");

                Message.Leng.put("op1", "Iniciar Sesión");
                Message.Leng.put("op2", "Vuelos");
                Message.Leng.put("op3", "Registrarse");
                Message.Leng.put("op4", "Cerrar Sesion");
                Message.Leng.put("op5", "Modificar Datos");
                Message.Leng.put("op6", "Datos Ficticios");
                Message.Leng.put("op7", "Historial de compras");

                Message.Leng.put("id", "Idioma");
                Message.Leng.put("id1", "Español");
                Message.Leng.put("id2", "Ingles");

                Message.Leng.put("b", "Buscar");
                Message.Leng.put("b1", "Buscar Vuelos");
                Message.Leng.put("b2", "Buscar Tiquete");
                Message.Leng.put("b3", "Buscar Factura");
                Message.Leng.put("b4", "Rango de Precio");
                Message.Leng.put("b5", "Valor Minimo");
                Message.Leng.put("b6", "Valor maximo");

                Message.Leng.put("prof", "Perfil");

                Message.Leng.put("mod", "Modificar Datos");
                Message.Leng.put("mod1", "Modificar Tiquete");
                Message.Leng.put("mod2", "Modificar Perfil");
                Message.Leng.put("mod3", "Perfil modificado exitosamente");

                Message.Leng.put("data", "Informacion");
                Message.Leng.put("data1", "Nombre");
                Message.Leng.put("data2", "Pais");
                Message.Leng.put("data3", "Numero telefonico");
                Message.Leng.put("data4", "Fecha de nacimiento");
                Message.Leng.put("data5", "E-mail");
                Message.Leng.put("data6", "Direccion");
                Message.Leng.put("data7", "Contraseña");
                Message.Leng.put("data8", "Tipo Documento");
                Message.Leng.put("data9", "Numero Documento");
                Message.Leng.put("data10", "Fecha de Nacimiento");
                Message.Leng.put("data11", "Codigo");
                Message.Leng.put("data12", "Fecha");

                Message.Leng.put("rec1", "Intente de nuevo");
                Message.Leng.put("rec2", "Reiniciando...");

                Message.Leng.put("sign", "Cuenta creada exitosamente");
                Message.Leng.put("sign1", "ID existente. Por favor intente otro.");
                Message.Leng.put("sign2", "ID inexistente. Por favor intente de nuevo.");
                Message.Leng.put("sign3", "Contraseña incorrecta. Por favor intente de nuevo.");
                Message.Leng.put("sign4", "Sesión iniciada correctamente");
                Message.Leng.put("sign5", "Error iniciando sesión.");
                Message.Leng.put("sign6", "Recuperar contraseña");
                Message.Leng.put("sign7", "Sesion cerrada");
                Message.Leng.put("buy", "Producto");
                Message.Leng.put("buy0", "Productos");
                Message.Leng.put("buy1", "Producto comprado exitosamente");
                Message.Leng.put("buy2", "Cancelar compra");

                Message.Leng.put("f", "Factura");
                Message.Leng.put("f1", "Subtotal");
                Message.Leng.put("f2", "IVA");
                Message.Leng.put("f3", "Total");
                Message.Leng.put("f4", "Numero de factura");

            } else if (leng.equals("eng")) {
                Message.Leng.put("w1", "Welcome");
                Message.Leng.put("w2", "Travel World is a Web company dedicated to the fast and secure commercialization of national and international flights at modest prices.");

                Message.Leng.put("op1", "Login");
                Message.Leng.put("op2", "Flights");
                Message.Leng.put("op3", "Register");
                Message.Leng.put("op4", "Close Session");
                Message.Leng.put("op5", "Modify Data");
                Message.Leng.put("op6", "Fictitious Data");
                Message.Leng.put("op7", "Purchase history");
                
                Message.Leng.put("id", "Language");
                Message.Leng.put("id1", "Spanish");
                Message.Leng.put("id2", "English");
                
                Message.Leng.put("b", "Search");
                Message.Leng.put("b1", "Search Flights");
                Message.Leng.put("b2", "Search Ticket");
                Message.Leng.put("b3", "Find Invoice");
                Message.Leng.put("b4", "Price Range");
                Message.Leng.put("b5", "Minimum Value");
                Message.Leng.put("b6", "Maximum value");
                
                Message.Leng.put("prof", "Profile");

                Message.Leng.put("mod", "Modify Data");
                Message.Leng.put("mod1", "Modify Ticket");
                Message.Leng.put("mod2", "Modify Profile");
                Message.Leng.put("mod3", "Successfully modified profile");
                
                Message.Leng.put("data", "Information");
                Message.Leng.put("data1", "Name");
                Message.Leng.put("data2", "Country");
                Message.Leng.put("data3", "Phone number");
                Message.Leng.put("data4", "Date of birth");
                Message.Leng.put("data5", "E-mail");
                Message.Leng.put("data6", "Address");
                Message.Leng.put("data7", "Password");
                Message.Leng.put("data8", "Document Type");
                Message.Leng.put("data9", "Document Number");
                Message.Leng.put("data10", "Date of Birth");
                Message.Leng.put("data11", "Code");
                Message.Leng.put("data12", "Date");
                
                Message.Leng.put("rec1", "Try again");
                Message.Leng.put("rec2", "Restarting ...");
                Message.Leng.put("sign", "Account successfully created");
                Message.Leng.put("sign1", "Existing ID. Please try another.");
                Message.Leng.put("sign2", "Non-existent ID. Please try again.");
                Message.Leng.put("sign3", "Incorrect password, please try again.");
                Message.Leng.put("sign4", "Session started successfully");
                Message.Leng.put("sign5", "Error logging in.");
                Message.Leng.put("sign6", "Recover password");
                Message.Leng.put("sign7", "Session closed");
                
                Message.Leng.put("buy", "Product");
                Message.Leng.put("buy0", "Products");
                Message.Leng.put("buy1", "Product successfully purchased");
                Message.Leng.put("buy2", "Cancel purchase");
                
                Message.Leng.put("f", "Invoice");
                Message.Leng.put("f1", "Subtotal");
                Message.Leng.put("f2", "IVA"); 
                Message.Leng.put("f3", "Total");
                Message.Leng.put("f4", "Invoice number");

            }
        } else {
            if (leng.equals("esp")) {
                Message.Leng.put("w1", "Bienvenido");
                Message.Leng.put("w2", "Travel World es una empresa Web dedicada a la comercializacion de manera rapida y segura de tiquetes de vuelos nacionales e internacionales a modicos precios.");

                Message.Leng.put("op1", "Iniciar Sesión");
                Message.Leng.put("op2", "Vuelos");
                Message.Leng.put("op3", "Registrarse");
                Message.Leng.put("op4", "Cerrar Sesion");
                Message.Leng.put("op5", "Modificar Datos");
                Message.Leng.put("op6", "Datos Ficticios");
                Message.Leng.put("op7", "Historial de compras");

                Message.Leng.put("id", "Idioma");
                Message.Leng.put("id1", "Español");
                Message.Leng.put("id2", "Ingles");

                Message.Leng.put("b", "Buscar");
                Message.Leng.put("b1", "Buscar Vuelos");
                Message.Leng.put("b2", "Buscar Tiquete");
                Message.Leng.put("b3", "Buscar Factura");
                Message.Leng.put("b4", "Rango de Precio");
                Message.Leng.put("b5", "Valor Minimo");
                Message.Leng.put("b6", "Valor maximo");

                Message.Leng.put("prof", "Perfil");

                Message.Leng.put("mod", "Modificar Datos");
                Message.Leng.put("mod1", "Modificar Tiquete");
                Message.Leng.put("mod2", "Modificar Perfil");
                Message.Leng.put("mod3", "Perfil modificado exitosamente");

                Message.Leng.put("data", "Informacion");
                Message.Leng.put("data1", "Nombre");
                Message.Leng.put("data2", "Pais");
                Message.Leng.put("data3", "Numero telefonico");
                Message.Leng.put("data4", "Fecha de nacimiento");
                Message.Leng.put("data5", "E-mail");
                Message.Leng.put("data6", "Direccion");
                Message.Leng.put("data7", "Contraseña");
                Message.Leng.put("data8", "Tipo Documento");
                Message.Leng.put("data9", "Numero Documento");
                Message.Leng.put("data10", "Fecha de Nacimiento");
                Message.Leng.put("data11", "Codigo");
                Message.Leng.put("data12", "Fecha");

                Message.Leng.put("rec1", "Intente de nuevo");
                Message.Leng.put("rec2", "Reiniciando...");

                Message.Leng.put("sign", "Cuenta creada exitosamente");
                Message.Leng.put("sign1", "ID existente. Por favor intente otro.");
                Message.Leng.put("sign2", "ID inexistente. Por favor intente de nuevo.");
                Message.Leng.put("sign3", "Contraseña incorrecta. Por favor intente de nuevo.");
                Message.Leng.put("sign4", "Sesión iniciada correctamente");
                Message.Leng.put("sign5", "Error iniciando sesión.");
                Message.Leng.put("sign6", "Recuperar contraseña");
                Message.Leng.put("sign7", "Sesion cerrada");
                Message.Leng.put("buy", "Producto");
                Message.Leng.put("buy0", "Productos");
                Message.Leng.put("buy1", "Producto comprado exitosamente");
                Message.Leng.put("buy2", "Cancelar compra");

                Message.Leng.put("f", "Factura");
                Message.Leng.put("f1", "Subtotal");
                Message.Leng.put("f2", "IVA");
                Message.Leng.put("f3", "Total");
                Message.Leng.put("f4", "Numero de factura");

            } else if (leng.equals("eng")) {
                Message.Leng.put("w1", "Welcome");
                Message.Leng.put("w2", "Travel World is a Web company dedicated to the fast and secure commercialization of national and international flights at modest prices.");

                Message.Leng.put("op1", "Login");
                Message.Leng.put("op2", "Flights");
                Message.Leng.put("op3", "Register");
                Message.Leng.put("op4", "Close Session");
                Message.Leng.put("op5", "Modify Data");
                Message.Leng.put("op6", "Fictitious Data");
                Message.Leng.put("op7", "Purchase history");
                
                Message.Leng.put("id", "Language");
                Message.Leng.put("id1", "Spanish");
                Message.Leng.put("id2", "English");
                
                Message.Leng.put("b", "Search");
                Message.Leng.put("b1", "Search Flights");
                Message.Leng.put("b2", "Search Ticket");
                Message.Leng.put("b3", "Find Invoice");
                Message.Leng.put("b4", "Price Range");
                Message.Leng.put("b5", "Minimum Value");
                Message.Leng.put("b6", "Maximum value");
                
                Message.Leng.put("prof", "Profile");

                Message.Leng.put("mod", "Modify Data");
                Message.Leng.put("mod1", "Modify Ticket");
                Message.Leng.put("mod2", "Modify Profile");
                Message.Leng.put("mod3", "Successfully modified profile");
                
                Message.Leng.put("data", "Information");
                Message.Leng.put("data1", "Name");
                Message.Leng.put("data2", "Country");
                Message.Leng.put("data3", "Phone number");
                Message.Leng.put("data4", "Date of birth");
                Message.Leng.put("data5", "E-mail");
                Message.Leng.put("data6", "Address");
                Message.Leng.put("data7", "Password");
                Message.Leng.put("data8", "Document Type");
                Message.Leng.put("data9", "Document Number");
                Message.Leng.put("data10", "Date of Birth");
                Message.Leng.put("data11", "Code");
                Message.Leng.put("data12", "Date");
                
                Message.Leng.put("rec1", "Try again");
                Message.Leng.put("rec2", "Restarting ...");
                Message.Leng.put("sign", "Account successfully created");
                Message.Leng.put("sign1", "Existing ID. Please try another.");
                Message.Leng.put("sign2", "Non-existent ID. Please try again.");
                Message.Leng.put("sign3", "Incorrect password, please try again.");
                Message.Leng.put("sign4", "Session started successfully");
                Message.Leng.put("sign5", "Error logging in.");
                Message.Leng.put("sign6", "Recover password");
                Message.Leng.put("sign7", "Session closed");
                
                Message.Leng.put("buy", "Product");
                Message.Leng.put("buy0", "Products");
                Message.Leng.put("buy1", "Product successfully purchased");
                Message.Leng.put("buy2", "Cancel purchase");
                
                Message.Leng.put("f", "Invoice");
                Message.Leng.put("f1", "Subtotal");
                Message.Leng.put("f2", "IVA"); 
                Message.Leng.put("f3", "Total");
                Message.Leng.put("f4", "Invoice number");
            }
        }
    }
}
