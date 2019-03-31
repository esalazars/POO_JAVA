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
        RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
        view.forward(request, response);
    }
}
