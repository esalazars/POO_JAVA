/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Airline;
import modules.Flight;
import modules.Client;

@WebServlet(urlPatterns = {"/Home/SignUp"})
public class Airlines extends LenguageServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        HttpSession session = request.getSession();
        //Lista de objetos
        //Aerolineas
        session.setAttribute("Airlines", Airline.aerolineas);
        request.setAttribute("airlines",Airline.aerolineas);
        //Vuelos
        session.setAttribute("Flights", Flight.flights);
        request.setAttribute("flights", Flight.flights);
        //Clientes
        session.setAttribute("Clients", Client.clients);
        request.setAttribute("clients", Client.clients);
        
        RequestDispatcher view = request.getRequestDispatcher("Exito.jsp");
        view.forward(request, response);  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       setMessages(request);
        //Configurando la sesion
        HttpSession session = request.getSession();
        //Lista de objetos
        //Aerolineas
        session.setAttribute("Airlines", Airline.aerolineas);
        request.setAttribute("airlines",Airline.aerolineas);
        //Vuelos
        session.setAttribute("Flights", Flight.flights);
        request.setAttribute("flights", Flight.flights);
        //Clientes
        session.setAttribute("Clients", Client.clients);
        request.setAttribute("clients", Client.clients);
        

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}