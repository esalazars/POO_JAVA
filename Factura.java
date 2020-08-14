/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelworld;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Finrod
 */
class Factura {

    public int ID = 0;
    public Date purchasedate;
    public final double IVA = 1.18;
    public Double Total;
    public Double Subtotal;
    public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    public Customer customer;

    public Factura() {
        this.ID++;
        Date now =new Date();
        this.purchasedate = now;
    }

    void addProduct(Ticket ticket) {
        this.tickets.add(ticket);
    }
    void removeProduct(Ticket ticket) {
        this.tickets.remove(ticket); 
    }
    public void generar(){
        
    }
}
