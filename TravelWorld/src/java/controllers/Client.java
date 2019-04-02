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

@WebServlet(urlPatterns = {"/Client"})
public class Client extends LenguageServlet{

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
                
        String opcion = request.getParameter("option");
        if(opcion==null){opcion = "";}
        RequestDispatcher view = request.getRequestDispatcher("Exito.jsp");
        if(opcion.equals("modifyprofile")){
            view = request.getRequestDispatcher("modifyData.jsp");
        }else if(opcion.equals("closesession")){
            view = request.getRequestDispatcher("index.jsp");
        }else if(opcion.equals("history")){
            view = request.getRequestDispatcher("History.jsp");
        }else if(opcion.equals("login")){
            view = request.getRequestDispatcher("LogIn.jsp");
        }else if(opcion.equals("singup")){
            view = request.getRequestDispatcher("Exito.jsp");
        }else if(opcion.equals("recoverypass")){
            view = request.getRequestDispatcher("RecoveryPassw.jsp");
        }
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
