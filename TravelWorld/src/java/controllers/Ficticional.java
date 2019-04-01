/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.LenguageServlet.setMessages;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Airline;
import util.LoadData;
import modules.Client;
import modules.Flight;

@WebServlet(urlPatterns = {"/Fictitional"})
public class Ficticional extends LenguageServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        LoadData.loadData();
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
        HashMap<String,controllers.Client> clientes = new HashMap<String,controllers.Client>();
        if(null != session.getAttribute("Clients")){
            clientes=(HashMap<String,controllers.Client>) session.getAttribute("Clients");
        }
        session.setAttribute("Clients", clientes);
        request.setAttribute("clients", clientes);
        
        if(!Client.clients.isEmpty()){
            request.setAttribute("clients", Client.clients);
            request.setAttribute("dataClients",true);
        }else if(!Airline.aerolineas.isEmpty()){
            request.setAttribute("airlines", Airline.aerolineas);
            if(!Flight.flights.isEmpty()){
                request.setAttribute("flights",Flight.flights);
            }
            request.setAttribute("dataFly",true);
            request.setAttribute("dataAirlines",true);           
        }else{
            request.setAttribute("dataClients",false);
            request.setAttribute("dataFly",false);
            request.setAttribute("dataAirlines",false);            
        }
        //Creando clientes para prueba de que no haya error en la clase
        //RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
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
        HashMap<String,controllers.Client> clientes = new HashMap<String,controllers.Client>();
        if(null != session.getAttribute("Clients")){
            clientes=(HashMap<String,controllers.Client>) session.getAttribute("Clients");
        }
        session.setAttribute("Clients", clientes);
        request.setAttribute("clients", clientes);

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
