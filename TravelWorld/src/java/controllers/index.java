/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Airline;
import modules.Flight;
import util.Message;

@WebServlet(urlPatterns = {"/index"})
public class index extends LenguageServlet {

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
        session.setAttribute("Clients", modules.Client.clients);
        request.setAttribute("clients", modules.Client.clients);
        
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
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
        session.setAttribute("Clients", modules.Client.clients);
        request.setAttribute("clients", modules.Client.clients);
        
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
