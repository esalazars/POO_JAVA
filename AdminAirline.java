package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Airline;

@WebServlet(urlPatterns = {"/AdminAirlines"})
public class AdminAirlines extends MainServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        setMessages(request);
        
        request.setAttribute("airlines", Airline.aerolineass);

        RequestDispatcher view = request.getRequestDispatcher("listAirlines.jsp");
        view.forward(request, response);

    }
}
