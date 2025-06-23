package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            System.out.println("App Name: " + prop.getProperty("name"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}