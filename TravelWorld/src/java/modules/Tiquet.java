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
    private int code;
    private String /* Facture*/ facture; //Atributos de relacion
    private Flight flight;//Atributos de relacion
    private static int serial = 0;
    public static HashMap<Integer,Tiquet> tiquets = new HashMap<Integer,Tiquet>(); // Lista de tiquets creados
//    public static final DEST = ;
    
    
    public Tiquet(){//Constructor por defecto
        Tiquet.more();
        this.setCode(Tiquet.serial);
        this.setFlight(new Flight());
        tiquets.put(this.getCode(), this);
    }
    
    public Tiquet(Flight flight){
        Tiquet.more();
        this.setCode(Tiquet.serial);
        this.setFlight(flight);
        tiquets.put(this.getCode(), this);
    }
    
    //Definicion de set y get
    //Codigo
    public void setCode(int codigo){
        if(Tiquet.tiquets.containsKey(codigo)){
            Tiquet.more();
            this.setCode(Tiquet.serial);
        }else{
            this.code = codigo;
        }
    }
    public int getCode(){
	return this.code;
    }
    //Vuelo
    public void setFlight(Flight vuelo){
	this.flight = vuelo;
    }
    public Flight getFlight(){
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
    public void saveTiquet(){
        
    }
    //Metodo imprimir, tomara el pdf creado y lo imprimira
    public void printTiquet(){
		
    }	//Metodos de clase
    //Define serial para cada tiquete generado, es un metodo auxiliar
    private static void more(){
        Tiquet.serial++;
        if(Tiquet.tiquets.containsKey(Tiquet.serial)){
            Tiquet.more();
        }
    }
    //Borrar tiquete
    public static Boolean delete(int codigo){
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
    /*Metodos por definir
    Guardar()
    Imprimir()
    */
    


}
