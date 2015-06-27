package javaapplication5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  *
 * @author Chad
* i created this code with help from the internet. 
its really cool it grabs the webpage and allows us to then interact with the webpage

 */
import java.net.*;
import java.io.*;

public class httpurl {
    public static void main(String[] args) throws Exception {
        URL byui = new URL("http://www.byui.edu/"); // this is the webpage that it will grab the information from
        URLConnection test = byui.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(test.getInputStream()));
        String inputLine;
        // this takes two different strings then allows them to be compared
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        // this just keeps printing out the webpage line by line until it is done
        in.close();
    }
}