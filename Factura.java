/**
 *
 * @author Yesid Alejandro Peláez
 */
import java.util.*;
public class Factura {
    //Atributos de clase
    Double IVA = 0.19;
    int consecutivo =0; // variable de autoincremento para asignar el código de la factura cuando se cree una.
    //Atributos de instancia
    String fecha;
    String codigo;
    Double subtotal;
    Double total;
    ArrayList<Tiquete> tiquete;
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
}
