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

@WebServlet(urlPatterns = {"/Client"})
public class Client extends LenguageServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
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
}
