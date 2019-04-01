/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Airline;
import modules.Flight;

@WebServlet(urlPatterns = {"/Fly"})
public class Fly extends LenguageServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Configuracion de mensajes
        setMessages(request);
        //Configurando la sesion
        HttpSession session = request.getSession();
        //Lista de objetos
        //Aerolineas
        HashMap<String,Airline> aerolineas = new HashMap<String,Airline>();
        if(null != session.getAttribute("Airlines")){
            aerolineas=(HashMap<String,Airline>) session.getAttribute("Airlines");
        }
        session.setAttribute("Airlines", aerolineas);
        request.setAttribute("airlines", aerolineas);
        //Vuelos
        HashMap<String,Flight> vuelos = new HashMap<String,Flight>();
        if(null != session.getAttribute("Flights")){
            vuelos=(HashMap<String,Flight>) session.getAttribute("Flights");
        }
        session.setAttribute("Flights", vuelos);
        request.setAttribute("flights", vuelos);
        //Clientes
        HashMap<String,Client> clientes = new HashMap<String,Client>();
        if(null != session.getAttribute("Clients")){
            clientes=(HashMap<String,Client>) session.getAttribute("Clients");
        }
        session.setAttribute("Clients", clientes);
        request.setAttribute("clients", clientes);
        //Creo dos objetos para prueba
        /*HashMap <String, Boolean> asientos = new HashMap<String,Boolean>(){
                            {
                                put("A0",true);
                                put("A1",true);
                                put("A2",true);  
                            }
                        };
        Airline a1 = new Airline("VivaColombia","Medellin");
        Airline a2 = new Airline("RoloBogota","Bogota");
        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 6, 10);
        Flight v1 = new Flight("001",100,100,"medellin","bogota","Pablo segundo","El dorado",
                        Calendar.getInstance(),c1,Calendar.getInstance(),
                        "P10",asientos, "Meteoro",a1);
        c1.set(2019, 7, 20);
        asientos.put("B0",true);
        Flight v2 = new Flight("002",100,100,"bogota","medellin","El dorado","Rionegro feo",
                        Calendar.getInstance(),c1,Calendar.getInstance(),
                        "P10",asientos, "Meteoro",a2);
        request.setAttribute("flights", Flight.flights);
        */
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configura la sesion
        HttpSession session = request.getSession();
        //Lista de objetos
        //Aerolineas
        HashMap<String,Airline> aerolineas = new HashMap<String,Airline>();
        if(null != session.getAttribute("Airlines")){
            aerolineas=(HashMap<String,Airline>) session.getAttribute("Airlines");
        }
        session.setAttribute("Airlines", aerolineas);
        request.setAttribute("airlines", aerolineas);
        //Vuelos
        HashMap<String,Flight> vuelos = new HashMap<String,Flight>();
        if(null != session.getAttribute("Flights")){
            vuelos=(HashMap<String,Flight>) session.getAttribute("Flights");
        }
        session.setAttribute("Flights", vuelos);
        request.setAttribute("flights", vuelos);
        //Clientes
        HashMap<String,Client> clientes = new HashMap<String,Client>();
        if(null != session.getAttribute("Clients")){
            clientes=(HashMap<String,Client>) session.getAttribute("Clients");
        }
        session.setAttribute("Clients", clientes);
        request.setAttribute("clients", clientes);

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}