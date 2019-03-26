/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

import java.util.*;

/**
 *
 * @author UNAL
 */

public class Person {
    private String email;
    //Lista de personas suscritas para recibir notificacionesS
    public static List<String> people = new ArrayList<String>();
    
    public Person(String ema){
        this.setEmail(ema);
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static void suscribe(String email){
        Person.people.add(email);
    }
}
