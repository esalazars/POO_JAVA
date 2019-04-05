/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author user Eladio Salazar Suarez
 */
import java.util.HashMap;

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
    private String boardingDoor;
    //Los asientos seran nombre y true o false para disponible o no
    private HashMap<String, Boolean> seats = new HashMap<String, Boolean>();
    private String airplane;
    private HashMap<Integer, Tiquet> tiquets = new HashMap<Integer, Tiquet>();
    private Airline airline;

    //Lista de vuelos creados
    public static HashMap<String, Flight> flights = new HashMap<String, Flight>();

    public Flight(Flight vuelo){
        this(vuelo.getCode(),vuelo.getPrice(),
                vuelo.getDepartureCity(),vuelo.getArrivalCity(),
                vuelo.getDepartureAirport(),vuelo.getArrivalAirport(),
                vuelo.getDepartureDate(),vuelo.getArrivalDate(),vuelo.getBoardingTime(),
                vuelo.getBoardingDoor(), vuelo.getSeats(),vuelo.getAirplane(),
                vuelo.getAirline());
    }
    
    public Flight(String code, double price, String departureCity,
            String arrivalCity, String departureAirport, String arrivalAirport,
            String departureDate, String arrivalDate, String boardingTime,
            String boardingDoor, HashMap<String, Boolean> seats, String airplane,
            Airline airline) {
        this.setCode(code);
        this.setPrice(price);
        this.setMaxPassengers((int)seats.size());
        this.setDepartureCity(departureCity);
        this.setArrivalCity(arrivalCity);
        this.setDepartureAirport(departureAirport);
        this.setArrivalAirport(arrivalAirport);
        this.setDepartureDate(departureDate);
        this.setArrivalDate(arrivalDate);
        this.setBoardingTime(boardingTime);
        this.setBoardingDoor(boardingDoor);
        this.setSeats(seats);
        this.setAirplane(airplane);
        this.setAirline(airline);
        this.setAirplane(airplane);
        Flight.flights.put(this.getCode(), this);
    }
    
    public Flight(String code, double price, String departureCity,
            String arrivalCity, String departureAirport, String arrivalAirport,
            String departureDate, String arrivalDate, String boardingTime,
            String boardingDoor, String[] seats, String airplane,
            Airline airline) {
        this.setCode(code);
        this.setPrice(price);
        this.setMaxPassengers(seats.length);
        this.setDepartureCity(departureCity);
        this.setArrivalCity(arrivalCity);
        this.setDepartureAirport(departureAirport);
        this.setArrivalAirport(arrivalAirport);
        this.setDepartureDate(departureDate);
        this.setArrivalDate(arrivalDate);
        this.setBoardingTime(boardingTime);
        this.setBoardingDoor(boardingDoor);
        this.setSeats(seats);
        this.setAirplane(airplane);
        this.setAirline(airline);
        Flight.flights.put(this.getCode(), this);
    }
        
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

    public String getDepartureAirport() {
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

    //Puerta de abordaje
    public void setBoardingDoor(String puerta) {
        this.boardingDoor = puerta;
    }

    public String getBoardingDoor() {
        return this.boardingDoor;
    }

    //Asientos recibe lista de string que son los asientos
    public void setSeats(String[] asientos) {
        for(int i = 0; i< asientos.length;i++){
            this.seats.put(asientos[i],true);
        }
    }
    
    public void setSeats(HashMap<String,Boolean> asientos) {
        this.seats.clear();
        this.seats = asientos;        
    }
    
    public HashMap<String, Boolean> getSeats() {
        return this.seats;
    }
    
    //Avion
    public void setAirplane(String avion) {
        this.airplane = avion;
    }

    public String getAirplane() {
        return this.airplane;
    }
    
    //Tiquetes
    public void setTiquets(Tiquet tiquete){
        this.tiquets.clear();
        this.tiquets = new HashMap<Integer,Tiquet>();
        this.tiquets.put(tiquete.getCode(),tiquete);
    }
    
    public HashMap<Integer,Tiquet> getTiquets() {
        return this.tiquets;
    }
    
    public void addTiquet(Tiquet tiquete){
        this.tiquets.put(tiquete.getCode(), tiquete);
    }
    
    //Aerolinea 
    public void setAirline(Airline aerolinea) {
        this.airline = new Airline(aerolinea);
    }

    public Airline getAirline() {
        return this.airline;
    }
 
    /*Faltantes por definir
    Cancelar()
    Comprar()
    Buscar()
    Editar()
    notificar();
    */
    public boolean editFlight(Flight flight){
        
        return false;
    }
    //Metodos Estaticos
    //Metodo para Editar un vuelo ya creado
    
    //Metodo para eliminar un tiquete
    public static boolean delete(String code){
        if(Flight.flights.containsKey(code)){
            try{
                //Borra objeto y clave
                Flight.flights.put(code,null);
                Flight.flights.remove(code);
            }
            catch(Exception e){
                //Si no se pudo borrar
                return false;
            }
        }
        //Si el vuelo no existe
        return false;
    }
    
    //Buscar por codigo, asientos disponibles, aerolinea, ciudad de partida,
    // ciudad de llegada, aeropuerto de salida, aeropuerto de llegada,
    // fecha de salida, precios.
    //Metodo busqueda por:
    //1.Codigo
//    public static Flight search(String atributte, String codigo){
//    };
}
