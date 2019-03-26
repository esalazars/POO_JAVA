/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;
import java.util.*;
/**
 *
 * @author Yesid Alejandro Peláez
 */

public class Facture {

    //Atributos de clase
    private static Double IVA = 0.19;
    private static int consecutivo = 0; // variable de autoincremento para asignar el código de la factura cuando se cree una.
    //Atributos de instancia
    private String fecha;
    private String codigo;
    private Double subtotal;
    private Double total;
    private ArrayList<Tiquet> tiquete = new ArrayList<>();
    //Cliente cliente = new Cliente();

    public Facture() {
        this.codigo += consecutivo + 1;
        this.subtotal = 0.0;
        this.total = 0.0;
        this.fecha = "FechaActual";
        consecutivo += 1; // Se prepara el código para la siguente factura
    }
    
    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ArrayList<Tiquet> getTiquete() {
        return this.tiquete;
    }

    public void setTiquete(ArrayList<Tiquet> tiquete) {
        this.tiquete = tiquete;
    }

    public void agregarTiquete(Tiquet tq) {
        this.tiquete.add(tq);
    }

    public void removerTiquete(Tiquet tq) {
        this.tiquete.remove(tq);
    }

    public ArrayList generarFactura() {
        //Crear un for con los atributos de tiquete
        return tiquete;
    }

    public double calcularTotal() {
        /*Se emplea un for para tomar el precio de 
        cada tiquete en la lista de tiquetes
        y así sumarlos para obtener un subtotal y u total*/
        for (int i = 0; i < tiquete.size(); i++) {
        //    this.subtotal += tiquete.get(i).getPrice();
        }
        this.total = this.subtotal + this.subtotal * IVA;
        return this.total;
    }
}
