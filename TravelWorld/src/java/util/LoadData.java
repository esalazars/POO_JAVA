/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.util.HashMap;
import modules.Airline;
import modules.Client;
import modules.Flight;

/**
 *
 * @author user
 */
public class LoadData{

    public static void loadData() throws IOException {
        //Creacion de las aerolineas
        Airline a1 = new Airline("Viva Colombia", "Colombia");
        Airline a2 = new Airline("LAN", "Chile");
        System.out.println("Aerolineas Creadas");
        //Creacion de los vuelos
        HashMap<String, Boolean> asientos = new HashMap<String, Boolean>() {
            {
                put("A0", true);
                put("A1", true);
                put("A2", true);
            }
        };
        new Flight("001", 100000,"Medellin", "Bogota", "Olaya Herrera", "El Dorado",
                "2019-05-10", "2019-05-15", "10:30", "P01", asientos, "Boeing 747", a1);
        asientos.put("B1", true);
        new Flight("002", 1500000,"Bogota", "Santiago de Chile", "Olaya Herrera",
                "Aeropuerto Internacional Arturo Merino Benitez", "2019-06-01", "2019-06-05",
                "20:00", "P12",asientos, "Airbus 360", a2);
        System.out.println("Vuelos Creadas");
    }

    public static void processData(String data) throws IOException{
        String[] info = data.split(";");
        System.out.println(info[0]);
        //Procesamiento de los tipos de datos
        String nombre = info[0], correo = info[2], pais = info[3], direccion = info[5],
                contrase = info[6], tipo_documento = info[7],sexo = info[8], fecha = info[9];
        int id = Integer.parseInt(info[1]),telefono = Integer.parseInt(info[4]);//,year,mes,dia;
        System.out.println((new Client(nombre,id,correo,pais,telefono,direccion, contrase, tipo_documento,
                sexo,fecha)).getCountry());
        System.out.println("Clientes Creadas");
    }
}
