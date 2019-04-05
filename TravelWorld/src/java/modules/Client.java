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
public class Client extends Person {

    public static HashMap<Integer, Client> clients = new HashMap<Integer, Client>();
    private String name;
    private int id;
    private String country;
    private int phone;
    private String direction;
    private String birthdate;
    private String password;
    private String document_type;
    private String sex;
    private int points;
    private boolean state_login;

    public Client(String name, int id, String email, String country, int phone,
            String direction, String password, String document_type, String sex,String birth) {
        super(email);
        this.setName(name);
        this.setId(id);
        this.setCountry(country);
        this.setPhone(phone);
        this.setDirection(direction);
        this.setPassword(password);
        this.setDocument_type(document_type);
        this.setSex(sex);
        this.setBirthdate(birth);
        this.setPoints(0);
        this.setState_login(false);
        clients.put(id, this);
    }
    public Client(Client c){
        this(c.getName(),c.getId(),c.getEmail(),c.getCountry(),c.getPhone(),c.getDirection(),
                c.getPassword(),c.getDocument_type(),c.getSex(),c.getBirthdate());
    }
    public Client(){
        super("nada@nada");
        this.setName("vacio");
        this.setId(0);
        this.setCountry("none");
        this.setPhone(0);
        this.setDirection("none");
        this.setPassword("none");
        this.setDocument_type("none");
        this.setSex("none");
        this.setBirthdate("none");
        this.setPoints(0);
        this.setState_login(false);
        clients.put(id, this);
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setBirthdate(String birth) {
        //Formato year//month//day
        this.birthdate = birth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setState_login(boolean state_login) {
        this.state_login = state_login;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
    
    public String getCorreo(){
        return this.getEmail();
    }

    public String getCountry() {
        return this.country;
    }

    public int getPhone() {
        return this.phone;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDocument_type() {
        return this.document_type;
    }

    public String getSex() {
        return this.sex;
    }

    public int getPoints() {
        return this.points;
    }

    public boolean getState_login() {
        return state_login;
    }

    public static boolean register(String name, int id, String email, String country, int phone,
            String direction, String password, String document_type, String sex,String birth) {
        
        if (Client.clients.containsKey(id)) {
            //retorne mensaje que diga usuario existente
            return false;
        } else {
            Client var = new Client(name,id,email, country, phone,
            direction, password, document_type, sex,birth);
            //registro con exito
            return true;
        }
    }

    public static int login(int id, String password) {
        if (!Client.clients.containsKey(id)) {
            //retorna este usuario no esta registrado
            return -1;
        } else {
            if (Client.clients.get(id).getPassword().equals(password)) {
                Client.clients.get(id).setState_login(true);
                return Client.clients.get(id).getId();
            } else {
                //contraseña erronea
                return -2;
            }
        }
    }

    public Boolean modify_data(String name, String email, String country, int phone,
            String direction, String document_type, String sex, String birth) {
        try {
            this.setName(name);
            this.setEmail(email);
            this.setCountry(country);
            this.setPhone(phone);
            this.setDirection(direction);
            this.setSex(sex); 
            this.setDocument_type(document_type);
            this.setBirthdate(birth);
            return true;
        } catch (Exception var1) {
            return false;
        }
    }
}
