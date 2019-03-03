/**
 *
 * @author Yesid Alejandro Peláez
 */
import java.util.*;
public class Factura {
    //Atributos de clase
    private static Double IVA = 0.19;
    private static int consecutivo =0; // variable de autoincremento para asignar el código de la factura cuando se cree una.
    //Atributos de instancia
    private String fecha;
    private String codigo;
    private Double subtotal;
    private  Double total;
    private ArrayList<Tiquete> tiquete = new ArrayList<>();
    //Cliente cliente = new Cliente();
    
    public Factura(){
        this.codigo += consecutivo +1;
        this.subtotal =0.0;
        this.total = 0.0;
        this.fecha = "FechaActual";
        consecutivo +=1; // Se prepara el código para la siguente factura
    }
    
    public void agregarTiquete(Tiquete tq){
        this.tiquete.add(tq);
    }
    
    public void removerTiquete(Tiquete tq){
        this.tiquete.remove(tq);
    }
    
    public ArrayList generarFactura(){
        //Crear un for con los atributos de tiquete
        return tiquete;
    }
    
    public double calcularTotal(){
    /*Se emplea un for para tomar el precio de 
        cada tiquete en la lista de tiquetes
        y así sumarlos para obtener un subtotal y u total*/    
    for(int i=0 ; i < tiquete.size();i++){
        this.subtotal += tiquete.get(i).getPrecio();   
    }
    this.total = this.subtotal + this.subtotal*IVA;
        return this.total;
    }
}
