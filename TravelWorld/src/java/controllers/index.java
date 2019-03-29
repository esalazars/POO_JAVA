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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/"})
public class index extends MainServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Intentando configurar mensajes
        setMessages(request);
        String opcion = request.getParameter("option");
        
        if(opcion == null){opcion = "";}
        
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");/*
        if(!Message.Leng.isEmpty()){
            view = request.getRequestDispatcher("Exito.jsp");
        }else{
            request.setAttribute("Lenguage",Message.Leng);
            view = request.getRequestDispatcher("index.jsp");
        }*/        
        view.forward(request, response);  
    }
}
