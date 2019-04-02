/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author UNAL
 */

public class Calification {

    private float score;
    private Airline airline;
    //Atributo estatico de clase
    public static List<Calification> calificaciones = new LinkedList<Calification>();
    
    public Calification(Calification calif){
        this(calif.getScore(),calif.getAirline());
    }
    
    public Calification(float score,Airline aerolinea){
        this.setScore(score);
        this.setAirline(aerolinea);
        calificaciones.add(this);        
    }
    
    public float getScore() {
        return this.score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    public Airline getAirline(){
        return this.airline;
    }
    
    public void setAirline(Airline aerolinea){
        this.airline = new Airline(aerolinea);
    }
}
