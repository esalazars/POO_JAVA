/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelworld;

/**
 *
 * @author Finrod
 */
import java.util.*;

public final class Flight {//Ya no hay herencia

    private String code;
    private double price;
    private int maxPassengers;
    private String departureCity;
    private String arrivalCity;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDate;
    private String arrivalDate;
    private String boardingTime;
    private String airline;
    private String boardingDoor;
    private String airplane;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public Flight() {//Constructor por defecto

        this.setCode("0000");
        this.setPrice(100000);
        this.setMaxPassengers(3);
        this.setDepartureCity("Medellin");
        this.setArrivalCity("Bogota");
        this.setDepartureAirport("Juan Pablo Segundo");
        this.setArrivalAirport("El Dorado");
        this.setDepartureDate("05-04-19");
        this.setArrivalDate("05-04-19");
        this.setBoardingTime("10AM");
        this.setAirline("Sin implementar");
        this.setBoardingDoor("A1");
        this.setAirplane("Airbus 270");

    }

    ;

    public Flight(String code, double price, int maxPassengers, String departureCity,
            String arrivalCity, String departureAirport, String arrivalAirport,
            String departureDate, String arrivalDate, String boardingTime,
            String airline, String boardingDoor,
            String airplane) {
//Constructor preferido
        this.setCode(code);
        this.setPrice(price);
        this.setMaxPassengers(maxPassengers);
        this.setDepartureCity(departureCity);
        this.setArrivalCity(arrivalCity);
        this.setDepartureAirport(departureAirport);
        this.setArrivalAirport(arrivalAirport);
        this.setDepartureDate(departureDate);
        this.setArrivalDate(arrivalDate);
        this.setBoardingTime(boardingTime);
        this.setAirline(airline);
        this.setBoardingDoor(boardingDoor);
        //this.setSeats(seats);
        this.setAirplane(airplane);

    }

    public static void GenerarAirline() {

    }

    ;
        
    //Definicion de los get y set y metodos de instancia
    //Codigo
    public void setCode(String codigo) {
        this.code = codigo;

    }

    public String getCode() {
        return this.code;
    }

    //Precio
    public void setPrice(double precio) {
        this.price = precio;
    }

    public double getPrice() {
        return this.price;
    }

    //Pasajeros maximos
    public void setMaxPassengers(int pasajeros) {
        this.maxPassengers = pasajeros;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    //Ciudad de partida
    public void setDepartureCity(String ciudad) {
        this.departureCity = ciudad;
    }

    public String getDepartureCity() {
        return this.departureCity;
    }

    //Ciudad de llegada
    public void setArrivalCity(String ciudad) {
        this.arrivalCity = ciudad;
    }

    public String getArrivalCity() {
        return this.arrivalCity;
    }

    //Aeropuerto de partida
    public void setDepartureAirport(String aeropuerto) {
        this.departureAirport = aeropuerto;
    }

    public String getDepartureAireport() {
        return this.departureAirport;
    }

    //Aeropuerto de llegada
    public void setArrivalAirport(String aeropuerto) {
        this.arrivalAirport = aeropuerto;
    }

    public String getArrivalAirport() {
        return this.arrivalAirport;
    }

    //Fecha de Salida
    public void setDepartureDate(String fecha) {
        this.departureDate = fecha;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    //Fecha de llegada
    public void setArrivalDate(String fecha) {
        this.arrivalDate = fecha;
    }

    public String getArrivalDate() {
        return this.arrivalDate;
    }

    //Hora de abordaje
    public void setBoardingTime(String fecha) {
        this.boardingTime = fecha;
    }

    public String getBoardingTime() {
        return this.boardingTime;
    }

    //Aerolinea Falta probar los objetos aerolinea
    public void setAirline(String /*Airlane*/ aerolinea) {
        this.airline = aerolinea;
    }

    public String /*Airline */ getAirline() {
        return this.airline;
    }

    //Puerta de abordaje
    public void setBoardingDoor(String puerta) {
        this.boardingDoor = puerta;
    }

    public String getBoardingDoor() {
        return this.boardingDoor;
    }

    //Asientos falta verificar tipo de datos
    public void setSeats(List<String> asiento) {
        this.seats = asiento;
    }

    public List<String> getSeats() {
        return this.seats;
    }

    //Avion
    public void setAirplane(String avion) {
        this.airplane = avion;
    }

    public String getAirplane() {
        return this.airplane;
    }

    //Metodos Estaticos
    //Buscar por codigo, asientos disponibles, aerolinea, ciudad de partida,
    // ciudad de llegada, aeropuerto de salida, aeropuerto de llegada,
    // fecha de salida, precios.
    //Metodo busqueda por:
    //1.Codigo
    // public static Flight search(String atributte, String codigo) {
    //} 
    public static List SearchByArrivalCity(String city) {
        //SelectedFlights.clear();
        ArrayList<String> SelectedFlights = new ArrayList<>();

        for (Flight obj : TravelWorld.Avianca.flights) {
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.American.flights) {
                        System.out.println(obj.getCode());
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.JetBlue.flights) {
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        return SelectedFlights;//devuelve arraylist con los codigos de los vuelos

    }

    public static List SearchByDepartureCity(String city) {
ArrayList<String> SelectedFlights = new ArrayList<>();
        for (Flight obj : TravelWorld.Avianca.flights) {
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.American.flights) {
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.JetBlue.flights) {
            if (obj.getArrivalCity().equals(city)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        return SelectedFlights;
    }

    public static List SearchByDepartureDate(String date) {
ArrayList<String> SelectedFlights = new ArrayList<>();

        for (Flight obj : TravelWorld.Avianca.flights) {
            if (obj.getArrivalCity().equals(date)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.American.flights) {
            if (obj.getArrivalCity().equals(date)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        for (Flight obj : TravelWorld.JetBlue.flights) {
            if (obj.getArrivalCity().equals(date)) {
                SelectedFlights.add(obj.getCode());
            }
        }
        return SelectedFlights;
    }

    public static List SearchByAirLine(String airline) {
ArrayList<String> SelectedFlights = new ArrayList<>();

        switch (airline) {
            case "Avianca": {
                for (Flight obj : TravelWorld.Avianca.flights) {
                SelectedFlights.add(obj.getCode());
                }
            }case "American_Airlines": {
                for (Flight obj : TravelWorld.American.flights) {
                SelectedFlights.add(obj.getCode());
                }
            }case "JetBlue": {
                for (Flight obj : TravelWorld.JetBlue.flights) {
                SelectedFlights.add(obj.getCode());
                }
            }
        }
       
        return SelectedFlights;
    }

    public static void Buy(ArrayList code) {//recibe lista de los productos a comprar
        int idticket = 1;
        for (int counter = 0; counter < code.size(); counter++) { 	
          for (Flight obj : TravelWorld.Avianca.flights) {
            if (code.get(counter).equals(obj.getCode())) {
                obj.maxPassengers--;
                Ticket ticket=new Ticket(idticket,obj);
                obj.tickets.add(ticket);
                idticket++;
            }
        }
        }
}
}
