package controllers;

import static controllers.LenguageServlet.setMessages;
import static controllers.ManageSession.setSession;
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
@WebServlet(urlPatterns = {"/Client/LogIn"})
public class LogIn extends ManageSession{

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
        //HttpSession session = request.getSession();
        //Obteniendo los datos del formulario
        //int id = Integer.parseInt(request.getParameter("id"));
        //String contrase = request.getParameter("contra");
        RequestDispatcher view = request.getRequestDispatcher("../LogIn.jsp");
        //Registrandose
        /*if(Client.login(id, contrase)== id){
            //Logeado correcto
            System.out.println("Logueado correcto");
            session.setAttribute("User",Client.clients.get(id));
            request.setAttribute("user",Client.clients.get(id));
            view = request.getRequestDispatcher("../index.jsp");
        }else if(Client.login(id, contrase)==-1){
            //No registrado todavia
            System.out.println("Logueado incorrecto no registrado");
            request.setAttribute("error","sign2");
            view = request.getRequestDispatcher("../LogIn.jsp");
        }else if(Client.login(id, contrase)==-2){
            //contrasena mala
            System.out.println("Logueado incorrecto mala passw");
            request.setAttribute("error","sign3");
            view = request.getRequestDispatcher("../LogIn.jsp");        
        }*/
        System.out.println("Login Por Get");
        view.forward(request, response);
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        setSession(request);
        //Configurando la sesion
        HttpSession session = request.getSession();
         
        //Obteniendo los datos del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        String contrase = request.getParameter("contra");
        RequestDispatcher view = request.getRequestDispatcher("../Fly.jsp");
        //Registrandose
        int res = Client.login(id, contrase);
        if(res == id){
            //Logeado correcto
            System.out.println("Logueado correcto");
            Client.clients.get(id).setState_login(true);
            session.setAttribute("Usuario", Client.clients.get(id));
            request.setAttribute("usuario", Client.clients.get(id));
            view = request.getRequestDispatcher("../Fly.jsp");
        }else if(res ==-1){
            //No registrado todavia
            System.out.println("Logueado incorrecto no registrado");
            request.setAttribute("error","sign2");
            view = request.getRequestDispatcher("../LogIn.jsp");
        }else if(res == -2){
            //contrasena mala
            System.out.println("Logueado incorrecto mala passw");
            request.setAttribute("error","sign3");
            view = request.getRequestDispatcher("../LogIn.jsp");        
        }else{
            Client c = new Client((Client)session.getAttribute("Usuario"));
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        }
        System.out.println("Login por post");
        view.forward(request, response);
    }
}