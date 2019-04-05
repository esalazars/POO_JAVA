/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.LenguageServlet.setMessages;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modules.Client;
import util.LoadData;
import static org.apache.commons.io.IOUtils.lineIterator;
import org.apache.commons.io.LineIterator;

@WebServlet(urlPatterns = {"/Fictitional"})
public class Ficticional extends ManageSession {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        LoadData.loadData();
        InputStream input = getServletContext().getResourceAsStream("ClientData.txt");
        //String result = IOUtils.toString(input,"UTF-8");
        //System.out.println(result);
        LineIterator it = lineIterator(input, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println("Linea 1:"+line);
                LoadData.processData(line);
            }
        } finally {
            it.close();
        }
        setSession(request);
        HttpSession session = request.getSession();
        if (session.getAttribute("Usuario") != null) {
            Client c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        } 
        //Creando clientes para prueba de que no haya error en la clase
        //RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
         System.out.println("Ficticios Por Get");
        RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
        view.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        LoadData.loadData();
        InputStream input = getServletContext().getResourceAsStream("ClientData.txt");
        //String result = IOUtils.toString(input,"UTF-8");
        //System.out.println(result);
        LineIterator it = lineIterator(input, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println("Linea 1:"+line);
                LoadData.processData(line);
            }
        } finally {
            it.close();
        }
        setSession(request);
        HttpSession session = request.getSession();
        if (session.getAttribute("Usuario") != null) {
            Client c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        }  
        //Creando clientes para prueba de que no haya error en la clase
        //RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
        System.out.println("Ficticios Por Post");
        RequestDispatcher view = request.getRequestDispatcher("LoadFictitional.jsp");
        view.forward(request, response);
    }
}
