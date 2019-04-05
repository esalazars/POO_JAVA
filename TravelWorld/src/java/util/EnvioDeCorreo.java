/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.awt.HeadlessException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class EnvioDeCorreo {

    public static final String MI_CORREO = "travelworld20182s@gmail.com";
    public static final String MI_CONTRA = "proyectopoo";
    public static final String SERVIDOR_SMTP = "smtp.gmail.com";
    public static final String PUERTO_ENVIO = "465";

    //metodo que recibe y envia el email
    public boolean EnvioDeMail(String mailReceptor, String asunto, String cuerpo) {
        Properties props = new Properties();//propiedades a agragar
        props.put("mail.smtp.user", EnvioDeCorreo.MI_CORREO);//correo origen
        props.put("mail.smtp.host", EnvioDeCorreo.SERVIDOR_SMTP);//tipo de servidor
        props.put("mail.smtp.port", EnvioDeCorreo.PUERTO_ENVIO);//puesto de salida
        props.put("mail.smtp.starttls.enable", "true");//inicializar el servidor
        props.put("mail.smtp.auth", "true");//autentificacion
        props.put("mail.smtp.socketFactory.port", EnvioDeCorreo.PUERTO_ENVIO);//activar el puerto
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        SecurityManager security = System.getSecurityManager();
        try {
            Authenticator auth = new autentificadorSMTP();//autentificar el correo
            Session session = Session.getInstance(props, auth);//se inica una session
            // session.setDebug(true);
            MimeMessage msg = new MimeMessage(session);//se crea un objeto donde ira la estructura del correo
            msg.setText(cuerpo);//seteo el cuerpo del mensaje
            msg.setSubject(asunto);//setea asunto (opcional)
            msg.setFrom(new InternetAddress(EnvioDeCorreo.MI_CORREO));//agrega la la propiedad del correo origen
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(mailReceptor));//agrega el destinatario
            Transport.send(msg);//envia el mensaje
            return true;
        } catch (HeadlessException e) {
        } catch (MessagingException e) {
        } catch (Exception e) {
        }
        //fin try-catch
        System.out.println("Finaliza envio, esperemos que llegue para hoy");
        return false;
    }//fin metodo enviaEmail

    public class autentificadorSMTP extends javax.mail.Authenticator {

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(MI_CORREO, MI_CONTRA);//autentifica tanto el correo como la contraseña
        }
    }

    //public static void main(String[] Args) {
        
    //    new EnvioDeCorreo().EnvioDeMail("kristianquinchia@gmail.com", "dadw", "afwd");
    //}

}
