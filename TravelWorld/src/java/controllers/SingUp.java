/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.LenguageServlet.setMessages;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Client;
import util.EnvioDeCorreo;
import util.Message;
/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/Client/SignUp"})
public class SingUp extends ManageSession {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        RequestDispatcher view = request.getRequestDispatcher("../SignUp.jsp");
        
        view.forward(request, response);  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        HttpSession session = request.getSession();
        //Obteniendo los datos del formulario
        int id = Integer.parseInt(request.getParameter("id")),
                telefono = Integer.parseInt(request.getParameter("telefono"));
        String nombre = request.getParameter("nombre"),pais = request.getParameter("pais"),
                fecha_nac = request.getParameter("fecha_de_nacimiento"), 
                email = request.getParameter("correo"), 
                direccion = request.getParameter("direccion"),
                contrase = request.getParameter("contra"), 
                tipo = request.getParameter("tipo_documento"), 
                sexo = request.getParameter("sexo");
        RequestDispatcher view = request.getRequestDispatcher("../index.jsp");
        //Modificando los datos
        
        if(Client.register(nombre,id,email,pais,telefono,direccion,contrase,sexo,tipo,fecha_nac)){
            session.setAttribute("User",Client.clients.get(id));
            request.setAttribute("user",Client.clients.get(id));
            new EnvioDeCorreo().EnvioDeMail(email,
                    "Aviso de Registro",Message.ESP.get("sign"));
            view = request.getRequestDispatcher("../LogIn.jsp");
        }else{
            view = request.getRequestDispatcher("../SingUp.jsp");
        }        
        view.forward(request, response);
    }
}