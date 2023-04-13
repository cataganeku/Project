package de.ebcsoft.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

	// Crear un objeto EnergyReading
		LocalDate generationType;
		generationType = null;
		Long id = null;
		EnergyReadingData energyReading = new EnergyReadingData();

	// Crear y mostrar la ventana
		NewWindow ventana;
		ventana = new NewWindow(energyReading);
        ventana.setVisible(true);

		SpringApplication.run(ProjectApplication.class, args);
}}


