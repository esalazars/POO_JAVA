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
            put("op1", "Login");
            put("op2", "Flights");
            put("op3", "Register");
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
        }
    };
    public static HashMap<String, String> ESP = new HashMap<String, String>() {
        {
            put("eng","Ingles");
            put("esp","Español");
            put("w1", "Bienvenido");
            put("w2", "Travel World es una empresa Web dedicada a la comercializacion de manera rapida y segura de tiquetes de vuelos nacionales e internacionales a modicos precios.");
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
        }
    };
}
