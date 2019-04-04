/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.LenguageServlet.setMessages;
import java.io.IOException;
import java.io.InputStream;
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
import static org.apache.commons.io.IOUtils.lineIterator;
import org.apache.commons.io.LineIterator;

@WebServlet(urlPatterns = {"/Fictitional"})
public class Ficticional extends LenguageServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        LoadData.loadData();
        InputStream input = getServletContext().getResourceAsStream("ClientData.txt");
        //String result = IOUtils.toString(input,"UTF-8");
        //System.out.println(result);
        LineIterator it = lineIterator(input, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println("Linea 1:"+line);
                LoadData.processData(line);
            }
        } finally {
            it.close();
        }
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
        
        //Creando clientes para prueba de que no haya error en la clase
        //RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
