package de.ebcsoft.EnergyApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EnergyApp extends SpringBootServletInitializer {

    public static void main(String[] args) {


        SpringApplication.run(EnergyApp.class, args);
    }
}
