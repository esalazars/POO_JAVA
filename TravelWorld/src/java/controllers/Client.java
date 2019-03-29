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
public class Client extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = request.getParameter("option");
        if(opcion==null){opcion = "";}
        RequestDispatcher view = request.getRequestDispatcher("Exito.jsp");
        if(opcion.equals("ModifyProfile")){
            view = request.getRequestDispatcher("modifyData.jsp");
        }else if(opcion.equals("CloseSession")){
            view = request.getRequestDispatcher("index.jsp");
        }else if(opcion.equals("history")){
            view = request.getRequestDispatcher("History.jsp");
        }else if(opcion.equals("LogIn")){
            view = request.getRequestDispatcher("LogIn.jsp");
        }else if(opcion.equals("SingUp")){
            view = request.getRequestDispatcher("SignUp.jsp");
        }else if(opcion.equals("RecoveryPass")){
            view = request.getRequestDispatcher("RecoveryPassw.jsp");
        }
        view.forward(request, response);  
    }
}
