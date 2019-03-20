/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelWorld;

/**
 *
 * @author user Eladio Salazar Suarez
 */

import java.util.*;
import java.util.Calendar;

public final class Flight{//Ya no hay herencia
	private String code;
	private double price;
 	private int maxPassengers;
 	private String departureCity;
 	private String arrivalCity;
 	private String departureAirport;
 	private String arrivalAirport;
 	private Calendar departureDate;
 	private Calendar arrivalDate;
 	private Calendar boardingTime;
 	private String airline;
 	private String boardingDoor;
 	private List<String> seats;
 	private String airplane;
 	private String tiquet;
    //Lista de vuelos creados
    public static HashMap<String, Flight> flights = new HashMap<String, Flight>();

 	public Flight(){//Constructor por defecto
            this.setCode("0000");
            this.setPrice(100000);
            this.setMaxPassengers(3);
            this.setDepartureCity("Medellin");
            this.setArrivalCity("Bogota");
            this.setDepartureAirport("Juan Pablo Segundo");
            this.setArrivalAirport("El Dorado");
            this.setDepartureDate(Calendar.getInstance());
            this.setArrivalDate(Calendar.getInstance());
            this.setBoardingTime(Calendar.getInstance());
            this.setAirline("Sin implementar");
            this.setBoardingDoor("A1");
            List<String> lista = new ArrayList<>(Arrays.asList("A1","A2","A3"));
            this.setSeats(lista);
            this.setAirplane("Airbus 270");
            this.setTiquets("Sin implementar");
            flights.put("0000", this);
 	};

    public Flight(String code, double price, int maxPassengers, String departureCity,
                    String arrivalCity, String departureAirport, String arrivalAirport,
                    Calendar departureDate, Calendar arrivalDate, Calendar boardingTime, 
                    String airline, String boardingDoor, List<String> seats, 
                    String airplane, String tiquet){//Constructor preferido
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
            this.setSeats(seats);
            this.setAirplane(airplane);
            this.setTiquets(tiquet);
    };
        
    //Definicion de los get y set y metodos de instancia
    //Codigo
    public void setCode(String codigo){
        this.code = codigo;
    }
    public String getCode(){
        return this.code;
    }
    //Precio
    public void setPrice(double precio){
        this.price = precio;
    }
    public double getPrice(){
        return this.price;
    }
    //Pasajeros maximos
    public void setMaxPassengers(int pasajeros){
        this.maxPassengers = pasajeros;
    }
    public int getMaxPassengers(){
        return this.maxPassengers;
    }
    //Ciudad de partida
    public void setDepartureCity(String ciudad){
        this.departureCity = ciudad;
    }
    public String getDepartureCity(){
        return this.departureCity;
    }
    //Ciudad de llegada
    public void setArrivalCity(String ciudad){
        this.arrivalCity = ciudad;
    }
    public String getArrivalCity(){
        return this.arrivalCity;
    }
    //Aeropuerto de partida
    public void setDepartureAirport(String aeropuerto){
        this.departureAirport = aeropuerto;
    }
    public String getDepartureAireport(){
        return this.departureAirport;
    }
    //Aeropuerto de llegada
    public void setArrivalAirport(String aeropuerto){
        this.arrivalAirport = aeropuerto;
    }
    public String getArrivalAirport(){
        return this.arrivalAirport;
    }
    //Fecha de Salida
    public void setDepartureDate(Calendar fecha){
        this.departureDate = fecha;
    }
    public Calendar getDepartureDate(){
        return this.departureDate;
    }
    //Fecha de llegada
    public void setArrivalDate(Calendar fecha){
        this.arrivalDate = fecha;
    }
    public Calendar getArrivalDate(){
        return this.arrivalDate;
    }
    //Hora de abordaje
    public void setBoardingTime(Calendar fecha){
        this.boardingTime = fecha;
    }
    public Calendar getBoardingTime(){
        return this.boardingTime;
    }
    //Aerolinea Falta probar los objetos aerolinea
    public void setAirline(String /*Airlane*/ aerolinea){
        this.airline = aerolinea;
    }
    public String /*Airline */ getAirline(){
        return this.airline;
    }
    //Puerta de abordaje
    public void setBoardingDoor(String puerta){
        this.boardingDoor = puerta;
    }
    public String getBoardingDoor(){
        return this.boardingDoor;
    }
    //Asientos falta verificar tipo de datos
    public void setSeats(List<String> asiento){
        this.seats = asiento;
    }
    public List<String> getSeats(){
        return this.seats;
    }
    //Avion
    public void setAirplane(String avion){
        this.airplane = avion;
    }
    public String getAirplane(){
        return this.airplane;
    }
    //Tiquete falta clase tiquete
    public void setTiquets(String /*Tiquet*/ tiquete){
        this.tiquet = tiquete;
    }
    public String /*Tiquet */ getTiquets(){
        return this.tiquet;
    }
    
    //Metodos Estaticos
    
    //Buscar por codigo, asientos disponibles, aerolinea, ciudad de partida,
    // ciudad de llegada, aeropuerto de salida, aeropuerto de llegada,
    // fecha de salida, precios.
    //Metodo busqueda por:
    //1.Codigo
//    public static Flight search(String atributte, String codigo){
             
//    };
    
}