
import static controllers.LenguageServlet.setMessages;
import controllers.ManageSession;
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
@WebServlet(urlPatterns = {"/Client/CloseSession"})
public class CloseSession extends ManageSession{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        //Configurando la sesion
        setSession(request);
        HttpSession session = request.getSession();
        if (session.getAttribute("Usuario") != null) {
            Client c = null;
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        } 
        RequestDispatcher view = request.getRequestDispatcher("../index.jsp");
        System.out.println("Close Session Por Get");
        view.forward(request, response);
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        setMessages(request);
        setSession(request);
        //Configurando la sesion
        HttpSession session = request.getSession();
        RequestDispatcher view = request.getRequestDispatcher("../index.jsp");
        if (session.getAttribute("Usuario") != null) {
            Client c = null;
            session.setAttribute("Usuario", c);
            request.setAttribute("usuario", c);
        }         
        System.out.println("Close session por post");
        view.forward(request, response);
    }
}