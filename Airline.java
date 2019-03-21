/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelworld;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Finrod
 */
final class Airline {


    private String name;
    private double averagerating;
    private int numberofrates;
    private LinkedList<String> Comments = new LinkedList<>();
    private LinkedList<Double> Rating = new LinkedList<>();
    public ArrayList<Flight> flights=new ArrayList<Flight>();
      
    public Airline() {
        this.setname("name");

    }

    public Airline(String name) {
        
        this.setname(name);
    }

    

    public void setname(String name) {
        this.name = name;
    }

    public void Rate(double rate) {
        this.Rating.add(rate);
        this.averagerating=(this.averagerating*this.numberofrates+rate)/(this.numberofrates+1);
        this.numberofrates++;
    }

    public void Comment(String Comment) {
        this.Comments.add(Comment);
    }
    public double getaveragerating(){
        return this.averagerating;
    }
    //no se share que hace
    public void share(){
        
    }
    

}
