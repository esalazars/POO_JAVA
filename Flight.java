/*

 Author= Eladio Slazar Suarez


*/
import java.util.Datetime as dt

public class Flight{//Ya no hay herencia
	private String code;
	private double price;
 	private int maxPassengers;
 	private String departureCity;
 	private String arrivalCity;
 	private String departureAirport;
 	private String arrivalAirport;
 	private Datetime departureDate;
 	private Datetime arrivalDate;
 	private Time boardingTime;
 	private String airline;
 	private String boardingDoor;
 	private String *seats;
 	private String  airplane;
 	private String tiquet;

 	public Flight(){//Constructor por defecto
 		this.setCode('0000');
 		this.setPrice(100000);
 		this.setMaxPassengers(100);
 		this.setDepartureCity('Medellin');
 		this.setArrivalCity('Bogota');
 		this.setDepartureAirport('Juan Pablo Segundo');
 		this.setArrivalAirport('El Dorado');
 		this.setDepartureDate(LocalDate.now());
 		this.setArrivalDate(LocalDate.now());
 		this.setBoardingTime(LocalDate.now());
 		this.setAirline('Sin implementar');
 		this.setBoardingDoor('A1');
 		this.setSeats(List('A1','A2','A3', 'A4', 'A5'));
 		this.setAirplane('Airbus 270');
 		this.setTiquet('Sin implementar');
 	}

 	public search(){
 	//Buscar por codigo, pasajeros maximos, precios, 
 	//

 	}

}