/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelworld;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Finrod
 */
class Customer {

    public String name;
    public String ID;
    public String country;
    public String phone;
    public String address;
    public String birthdate;
    public String password;
    public String idtype;
    public String gender;
    public String points;
    private LinkedList<Factura> facturas = new LinkedList<>();

    void Customer() {

    }

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return this.name;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    private String getID() {
        return this.ID;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    private String getCountry() {
        return this.country;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private String getPhone() {
        return this.phone;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private String getAddress() {
        return this.address;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private String getBirthdate() {
        return this.birthdate;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getPassword() {
        return this.password;
    }

    private void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    private String getIDtype() {
        return this.idtype;
    }

    private void setPoints(String points) {
        this.points = points;
    }

    private String getpoints() {
        return this.points;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private String getGender() {
        return this.gender;
    }

    public void SignUp(String name, String ID, String country, String phone, String address,
            String birthdate, String password, String idtype, String gender, String points) {
        setName(name);
        setID(ID);
        setCountry(country);
        setPhone(phone);
        setAddress(address);
        setBirthdate(birthdate);
        setPassword(password);
        setIdtype(idtype);
        setGender(gender);
        setPoints(points);
        Customer customer = new Customer();
        TravelWorld.customers.add(customer);
    }

    public static boolean LogIn(String name, String password, ArrayList CustomerList) {
        boolean Boolean = false;
        for (Customer obj : TravelWorld.customers) {
            if (obj.getName().equals(name) && obj.getPassword().equals(password)) {
                Boolean = true;
            }
        }
        return Boolean;//devuelve true si inicio session, false si no pudo
    }

    public static void RecoverPassword(String name, String phone, String address, ArrayList CustomerList) {
        for (Customer obj : TravelWorld.customers) {
            if (obj.getName().equals(name) && obj.getPhone().equals(phone) && obj.getAddress().equals(address)) {
                Scanner scan = new Scanner(System.in);
                obj.setPassword(scan.next());
            }
        }
    }
}
