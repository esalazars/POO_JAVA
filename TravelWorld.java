package travelworld;

import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TravelWorld {

    public static Airline Avianca = new Airline("Avianca");
    public static Airline JetBlue = new Airline("SpiritAirlines");
    public static Airline American = new Airline("AmericanAirlines");
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    /**
     */
    public static void main(String[] args) {
        generardatosficticios();
        Customer.LogIn("f","1243",customers);
        Scanner scan = new Scanner(System.in);
        System.out.println(Flight.SearchByArrivalCity("Medellin"));
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
        switch (opcion) {
            case "1": {
                switch (opcion2) {

                    case "1": {
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
                        break;
                    }
                    case "2": {
                        break;
                    }
                    case "3": {
                        break;
                    }
                    case "4": {
                        break;
                    }
                }
                break;
            }
            case "2": {
                switch (opcion2) {

                    case "1": {
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
                        break;
                    }
                    case "2": {
                        break;
                    }
                    case "3": {
                        break;
                    }
                    case "4": {
                        break;
                    }
                }
                break;
            }
        }
    }

    static void generardatosficticios() {

        generardatostxt();
    }

    static void generardatostxt() {
        BufferedReader in;

        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Finrod\\Desktop\\Vuelos.txt"));

            for (int i = 0; i < 10; i++) {
                String Code = in.readLine();
                Double Price = Double.parseDouble(in.readLine());
                int MaxPassengers = Integer.parseInt(in.readLine());
                String DepartureCity = in.readLine();
                String ArrivalCity = in.readLine();
                String DepartureAirport = in.readLine();
                String ArrivalAirport = in.readLine();
                String DepartureDate = in.readLine();
                String ArrivalDate = in.readLine();
                String BoardingTime = in.readLine();
                String Airline = in.readLine();
                String BoardingDoor = in.readLine();
                String Airplane = in.readLine();
                switch (Airline) {

                    case "Avianca":
                        Flight flight = new Flight(Code, Price, MaxPassengers, DepartureCity, ArrivalCity,
                                DepartureAirport, ArrivalAirport, DepartureDate, ArrivalDate,
                                BoardingTime, Airline, BoardingDoor, Airplane);
                        Avianca.flights.add(flight);
                        break;
                    case "American_Airlines":
                        Flight flightA = new Flight(Code, Price, MaxPassengers, DepartureCity, ArrivalCity,
                                DepartureAirport, ArrivalAirport, DepartureDate, ArrivalDate,
                                BoardingTime, Airline, BoardingDoor, Airplane);
                        American.flights.add(flightA);
                        break;
                    case "JetBlue":
                        Flight flightJ = new Flight(Code, Price, MaxPassengers, DepartureCity, ArrivalCity,
                                DepartureAirport, ArrivalAirport, DepartureDate, ArrivalDate,
                                BoardingTime, Airline, BoardingDoor, Airplane);
                        JetBlue.flights.add(flightJ);
                        break;
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(Airline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
