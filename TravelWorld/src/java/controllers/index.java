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
import modules.Client;

@WebServlet(urlPatterns = {"/index"})
public class index extends ManageSession {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        //Usuario
        HttpSession session = request.getSession();
        if (session.getAttribute("Usuario") != null) {
            Client c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        } 
        //Prueba de envio de correo 
        //new EnvioDeCorreo().EnvioDeMail("esalazars@unal.edu.co","Una bomba","Prueb de envio de correo cinco para todos");
        //Vista  
        System.out.println("Por Get");
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        HttpSession session = request.getSession();       
        if (session.getAttribute("Usuario") != null) {
            Client c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        } 
        System.out.println("Por POST");
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        //new EnvioDeCorreo().EnvioDeMail("esalazars@unal.edu.co","Una bomba","Prueb de envio de correo cinco para todos");
        view.forward(request, response);
    }
}
