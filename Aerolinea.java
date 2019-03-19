package proyecto_java;

import java.util.LinkedList;
public class Aerolinea {
    private String nombre;
    private String sede;
    private LinkedList<Vuelo> vuelos;
    
    public Aerolinea(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setSede(String sede){
        this.sede = sede;
    }
    
    public String getSede(){
        return this.sede;
    }
    
    public double promCalificacion(){
    int acum =0;
    double prom =0;
    // Se recorre la lista de calificaciones de
    //cada aerolínea y se calcula el promedio
    for (int i =0; i <= vuelos.size();i++){
        acum += vuelos.get(i).getPrecio();
    }
    prom = acum / vuelos.size();
        return prom;
    }
}
