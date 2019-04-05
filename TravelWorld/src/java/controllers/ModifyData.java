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
@WebServlet(urlPatterns = {"/Client/ModifyData"})
public class ModifyData extends ManageSession {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
        RequestDispatcher view = request.getRequestDispatcher("../ModifyData.jsp");
        System.out.println("Modificar datos por GEt");
        view.forward(request, response);  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        HttpSession session = request.getSession();
        Client c = new Client();
        if (session.getAttribute("Usuario") != null) {
            c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        } 
        //Obteniendo los datos del formulario
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String nombre = request.getParameter("nombre"),pais = request.getParameter("pais"),
                fecha_nac = request.getParameter("fecha_de_nacimiento"), 
                email = request.getParameter("email"), 
                direccion = request.getParameter("direccion"), 
                tipo = request.getParameter("tipo_documento"), 
                sexo = request.getParameter("sexo");
        RequestDispatcher view = request.getRequestDispatcher("../ModifyData.jsp");
        //Registrandose
        if(c.modify_data(nombre,email,pais,telefono,direccion,tipo,sexo,fecha_nac)){
            session.setAttribute("Usuario",c);
            request.setAttribute("usuario",c);
            view = request.getRequestDispatcher("../Fly.jsp");
        }else{
            view = request.getRequestDispatcher("../ModifyData.jsp");
        }        
        System.out.println("Modificar datos por Post");
        view.forward(request, response);
    }
}