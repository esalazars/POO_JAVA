/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelworld;

import java.util.ArrayList;


class Ticket {

    private int ID;
    public Factura factura;
    public Flight flight;

    public Ticket() {
        this.setID(-1);
    }

    public Ticket(int id, Flight flight) {
        this.setID(id);
        this.flight=flight;
    }

    

    public void setID(int id) {
        this.ID = id;

    }

    

    public void Save() {
        factura.addProduct(this);
        
    }

    

    
}
