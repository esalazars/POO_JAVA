/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import modules.Airline;
import modules.Client;
import modules.Flight;

/**
 *
 * @author user
 */
public class LoadData {

    public static void loadData() throws IOException {
        //Creacion de las aerolineas
        Airline a1 = new Airline("Viva Colombia", "Colombia");
        Airline a2 = new Airline("LAN", "Chile");
        //Creacion de los vuelos
        //Creando fechas y asientos
        Calendar salida = Calendar.getInstance();
        salida.set(2019, 05, 10);
        Calendar llegada = Calendar.getInstance();
        llegada.set(2019, 05, 20);
        HashMap<String, Boolean> asientos = new HashMap<String, Boolean>() {
            {
                put("A0", true);
                put("A1", true);
                put("A2", true);
            }
        };
        Flight f1 = new Flight("001", 100000, 100, "Medellin", "Bogota", "Olaya Herrera", "El Dorado",
                salida, llegada, salida, "P01", asientos, "Boeing 747", a1);
        salida.set(2019, 06, 01);
        llegada.set(2019, 06, 05);
        asientos.put("B1", true);
        Flight f2 = new Flight("002", 1500000, 600, "Bogota", "Santiago de Chile", "Olaya Herrera",
                "Aeropuerto Internacional Arturo Merino Benitez", salida, llegada, salida, "P12",
                asientos, "Airbus 360", a2);
        //loadTxt();
    }

    public static void loadTxt() throws IOException {
        
        /*
        String sep = File.separator;
        //String url = "." + sep + "data" + sep + "ClientData.txt";
        String url = "."+sep+"ClientData.txt";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(url);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                processData(linea);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }*/
    }
    public static void processData(String data){
        String[] info = data.split(";");
        //Procesamiento de los tipos de datos
        String nombre = info[0], correo = info[2], pais = info[3], direccion = info[5],
                contrase = info[6], tipo_documento = info[7],sexo = info[8], fecha = info[9];
        int id = Integer.parseInt(info[1]),telefono = Integer.parseInt(info[4]);//,year,mes,dia;
        /*String[] fProcess = fecha.split("-");
        year = Integer.parseInt(fProcess[0]); mes = Integer.parseInt(fProcess[1]);
        dia = Integer.parseInt(fProcess[2]);*/
        new Client(nombre,id,correo,pais,telefono,direccion, contrase, tipo_documento,
                sexo,fecha);        
    }
}
