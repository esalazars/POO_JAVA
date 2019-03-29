/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import util.Message;

/**
 *
 * @author DanielGara
 */
public class LenguageServlet extends HttpServlet  {
    
    public static void setMessages(HttpServletRequest request){
        String opcion = request.getParameter("option");
        if(opcion == null){opcion = "";}
        if(opcion.equals("spa")){
            request.setAttribute("message", Message.ESP);
        }else if(opcion.equals("eng")){
            request.setAttribute("message", Message.ENG);
        }else{
            request.setAttribute("message", Message.ENG);
        }        
    }    
}