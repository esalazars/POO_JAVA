/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Airline;
import modules.Flight;

@WebServlet(urlPatterns = {"/Client"})
public class Clients extends ManageSession{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
         setSession(request);
         HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            session.setAttribute("Usuario", session.getAttribute("Usuario"));
            request.setAttribute("usuario", session.getAttribute("Usuario"));
        }
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        
        view.forward(request, response);  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
         setSession(request);
        //Verificando inicio de sesion        
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            session.setAttribute("Usuario", session.getAttribute("Usuario"));
            request.setAttribute("usuario", session.getAttribute("Usuario"));
        }
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        
        view.forward(request, response);
    }
}
