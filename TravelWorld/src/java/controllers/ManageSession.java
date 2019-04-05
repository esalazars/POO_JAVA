/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modules.Airline;
import modules.Flight;
import modules.Client;
/**
 *
 * @author user
 */
public class ManageSession extends LenguageServlet {
    
    public static void setSession(HttpServletRequest request ){
        HttpSession session = request.getSession();
        //Lista de objetos
        //Aerolineas
        HashMap<String,Airline> aerolineas = new HashMap<String,Airline>();
        if(null!= session.getAttribute("Airlines")){
            aerolineas = (HashMap<String,Airline>) Airline.aerolineas;
        }
        session.setAttribute("Airlines", aerolineas);
        request.setAttribute("airlines", aerolineas);
        //Vuelos
        HashMap<String,Flight> vuelos = new HashMap<String,Flight>();
        if(null!= session.getAttribute("Flights")){
            vuelos = (HashMap<String,Flight>)Flight.flights ;
        }
        session.setAttribute("Flights", vuelos);
        request.setAttribute("flights", vuelos);
        //Clientes
        HashMap<Integer,Client> clientes = new HashMap<Integer,Client>();
        if(null!= session.getAttribute("Clients")){
            clientes = (HashMap<Integer,Client>) Client.clients;
        }
        session.setAttribute("Clients", clientes);
        request.setAttribute("clients", clientes);
              
    } 
}
