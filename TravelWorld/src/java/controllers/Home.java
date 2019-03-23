package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modules.Flight;
import modules.Tiquet;

@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Flight v1 = new Flight();
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);  
    }
}
