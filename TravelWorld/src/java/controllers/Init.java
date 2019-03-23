/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author UNAL
 */
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modules.*;

@WebServlet(urlPatterns = {"/Home"})

public class Init extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Tiquet t1 = new Tiquet(new Flight());
        System.out.println("Instancia Tiquet t1 creada, y el pdf?");
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);  
    }
}
