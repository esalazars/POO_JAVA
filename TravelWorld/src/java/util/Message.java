/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;

/**
 *
 * @author UNAL
 */
public class Message {

    public static HashMap<String, String> Leng = new HashMap<String, String>() {
        {
            put("w1", "Welcome");
            put("w2", "Travel World is a Web company dedicated to the fast and secure commercialization of national and international flights at modest prices.");

            put("op1", "Login");
            put("op2", "Flights");
            put("op3", "Register");
            put("op4", "Close Session");
            put("op5", "Modify Data");
            put("op6", "Fictitious Data");
            put("op7", "Purchase history");

            put("id", "Language");
            put("id1", "Spanish");
            put("id2", "English");

            put("b", "Search");
            put("b1", "Search Flights");
            put("b2", "Search Ticket");
            put("b3", "Find Invoice");
            put("b4", "Price Range");
            put("b5", "Minimum Value");
            put("b6", "Maximum value");

            put("prof", "Profile");

            put("mod", "Modify Data");
            put("mod1", "Modify Ticket");
            put("mod2", "Modify Profile");
            put("mod3", "Successfully modified profile");

            put("data", "Information");
            put("data1", "Name");
            put("data2", "Country");
            put("data3", "Phone number");
            put("data4", "Date of birth");
            put("data5", "E-mail");
            put("data6", "Address");
            put("data7", "Password");
            put("data8", "Document Type");
            put("data9", "Document Number");
            put("data10", "Date of Birth");
            put("data11", "Code");
            put("data12", "Date");

            put("rec1", "Try again");
            put("rec2", "Restarting ...");
            put("sign", "Account successfully created");
            put("sign1", "Existing ID. Please try another.");
            put("sign2", "Non-existent ID. Please try again.");
            put("sign3", "Incorrect password, please try again.");
            put("sign4", "Session started successfully");
            put("sign5", "Error logging in.");
            put("sign6", "Recover password");
            put("sign7", "Session closed");

            put("buy", "Product");
            put("buy0", "Products");
            put("buy1", "Product successfully purchased");
            put("buy2", "Cancel purchase");

            put("f", "Invoice");
            put("f1", "Subtotal");
            put("f2", "IVA");
            put("f3", "Total");
            put("f4", "Invoice number");

        }
    };
}
