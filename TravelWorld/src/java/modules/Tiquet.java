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

import java.util.*;

public class Tiquet{
	private double code;
	private String /* Facture*/ facture; //Atributos de relacion
	private String /* Flight*/ flight;//Atributos de relacion
	private static double serial = 0;
	public static HashMap<Double,Tiquet> tiquets = new HashMap<Double,Tiquet>(); // Lista de tiquets creados

	public Tiquet(){//Constructor por defecto
		Tiquet.more();
		this.setCode(Tiquet.serial);
		this.setFacture("Sin definir clase");
		this.setFlight("Sin definir clase");
		tiquets.put(this.getCode(), this);
	}

	public Tiquet(String /* Flight*/ flight){
		Tiquet.more();
		this.setCode(Tiquet.serial);
		this.setFacture("Sin asignar");
		this.setFlight(flight);
		tiquets.put(this.getCode(), this);
	}

	//Definicion de set y get
	//Codigo
	public void setCode(double codigo){
		if(Tiquet.tiquets.containsKey(codigo)){
			Tiquet.more();
			this.setCode(Tiquet.serial);
		}else{
			this.code = codigo;
		}
	}
	public double getCode(){
		return this.code;
	}
	//Vuelo
	public void setFlight(String vuelo){
		this.flight = vuelo;
	}
	public String getFlight(){
		return this.flight;
	}
	//Factura en la cual fue pagada
	public void setFacture(String factura){
		this.facture = factura;
	}
	public String getFacture(){
		return this.facture;
	}
	//Metodo guardar, creara un pdf con el tiquete
	public void savePdf(){
		
	}
	//Metodo imprimir, tomara el pdf creado y lo imprimira
	public void printTiquet(){
		
	}
	//Metodos de clase
	//Define serial para cada tiquete generado, es un metodo auxiliar
	private static void more(){
		Tiquet.serial++;
		if(Tiquet.tiquets.containsKey(Tiquet.serial)){
			Tiquet.more();
		}
	}
	//Borrar tiquete
	public static Boolean delete(double codigo){
		if(Tiquet.tiquets.containsKey(codigo)){
			try{
				if(Tiquet.tiquets.remove(codigo) != null){
					return true;
				}
				return false;
			}
			catch(Exception e){
				return false;
			}
			
		}else{
			return false;
		}
	}
	


}
