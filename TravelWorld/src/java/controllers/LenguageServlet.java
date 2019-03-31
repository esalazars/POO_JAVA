/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.util.HashMap;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import util.Message;

/**
 *
 * @author DanielGara
 */
public class LenguageServlet extends HttpServlet  {
    
    public static void setMessages(HttpServletRequest request){
        HttpSession session = request.getSession();
        
        String opcion = request.getParameter("option");
        HashMap<String,String> lenguage = Message.ENG;
        if(opcion == null){opcion = "";}
        if(opcion.equals("esp")){
            lenguage = Message.ESP;
            //request.setAttribute("message", Message.ESP);
        }else if(opcion.equals("eng")){
            lenguage = Message.ENG;
            //request.setAttribute("message", Message.ENG);
        }else{
            if(null != session.getAttribute("message")){
                lenguage =(HashMap<String,String>) session.getAttribute("message");
            }      
        }
        request.setAttribute("message", lenguage);
    }    
}