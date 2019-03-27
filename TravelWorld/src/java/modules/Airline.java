package modules;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Airline {

    private String nombre;
    private String sede;
    private float calPromedio = 0;
    //Atributos de relaciones
    private List<Calification> calificaciones = new LinkedList<Calification>();
    private HashMap<String,Flight> vuelos = new HashMap<String,Flight>();
    //Atributo de la clase
    public static HashMap<String,Airline> aerolineas = new HashMap<String,Airline>();
    
    public Airline(String nombre, String sede){
        this.setNombre(nombre);
        this.setSede(sede);
        this.setCalPromedio(0);
        Airline.aerolineas.put(nombre, this);
    }
    
    public Airline(Airline air){
        new Airline(air.getNombre(),air.getSede());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getSede() {
        return this.sede;
    }
    
    public float getCalPromedio() {
        return this.calPromedio;
    }

    public void setCalPromedio(float calPromedio) {
        this.calPromedio = calPromedio;
    }

    public List<Calification> getCalificaciones() {
        return this.calificaciones;
    }

    public void setCalificaciones(Calification calificaciones) {
        this.calificaciones.clear();
        this.calificaciones = new LinkedList<Calification>();
        this.calificaciones.add(calificaciones) ;
    }
    
    public HashMap<String, Flight> getVuelos() {
        return this.vuelos;
    }

    public void addVuelos(Flight vuelo) {
        this.vuelos.put(vuelo.getCode(),vuelo);
    }
    
    public float promCalificacion() {
        float acum = 0;
        float prom = 0;
        // Se recorre la lista de calificaciones de
        //cada aerolínea y se calcula el promedio
        
        for (int i = 0; i < calificaciones.size(); i++) {
            acum += calificaciones.get(i).getScore();
        }
        prom = acum / calificaciones.size();
        return prom;
    }
    
    public void rate(float score){
        //Creo el objeto calificacion y lo agrego a la lista de calificaciones
        //de la instancia de aerolinea
        this.calificaciones.add(new Calification(score,this));
        //Recalculo la calificacion promedio cada que hacen una calificacion
        this.promCalificacion();
    }    
}
