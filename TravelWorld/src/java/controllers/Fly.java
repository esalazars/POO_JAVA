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
import modules.Airline;
import modules.Flight;

@WebServlet(urlPatterns = {"/Fly"})
public class Fly extends LenguageServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Configuracion de mensajes
        setMessages(request);
        //Creo dos objetos para prueba
        HashMap <String, Boolean> asientos = new HashMap<String,Boolean>(){
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
        
        RequestDispatcher view = request.getRequestDispatcher("Fly.jsp");
        view.forward(request, response);  
    }
}