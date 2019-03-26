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
public class Client {
    
    public static HashMap <Integer,Client> clients = new HashMap <Integer,Client> ();
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
    
    public Client(){
        new Client("",0,"",0,"","","","",0);
    }

    public Client(String name, int id, String country, int phone, 
            String direction, String password, String document_type, String sex,
            int points){
        this.setName(name);
        this.setId(id);
        this.setCountry(country);
        this.setPhone(phone);
        this.setDirection(direction);
        this.setPassword(password);
        this.setDocument_type(document_type);
        this.setSex(sex);
        this.setPoints(points);
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

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
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
    
    public static String register (String name, int id, String country, int phone, 
            String direction, String password, String document_type, String sex,
            int points){
        
        String date = "";
        if (Client.clients.containsKey(id)){
            
        }else{
            Client var = new Client(name,id,country,phone,direction,password,
                    document_type,sex,points);
            Client.clients.put(id,var);
        }
        return "";
    }
    
    public static String login (int id, String password){
        if (!Client.clients.containsKey(id)){

        }else{
            if (Client.clients.get(id).equals(password)){
                
                //return Client.clients.get(id);
            }else{

            }
        }
        return "";
    }
}