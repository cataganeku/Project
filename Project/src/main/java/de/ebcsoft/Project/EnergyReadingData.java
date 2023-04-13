package de.ebcsoft.Project;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

@Entity
public class EnergyReadingData {


    @GeneratedValue
    private Long id;

    @Column(name = "reading_date")
    private LocalDate readingDate;

    @Column(name = "reading_time")
    private LocalTime readingTime;

    @Column(name = "energy_consumption")
    private double energyConsumption;

    public EnergyReadingData() {
        // Constructor vacío requerido por JPA

    }

    public EnergyReadingData(LocalDate readingDate, LocalTime readingTime, double energyConsumption) {
        this.readingDate = readingDate;
        this.readingTime = readingTime;
        this.energyConsumption = energyConsumption;
        id = new ThreadLocal<Long>().get();
    }

    // getters y setters

    public LocalDate getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(LocalDate readingDate) {
        this.readingDate = readingDate;
    }

    public LocalTime getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(LocalTime readingTime) {
        this.readingTime = readingTime;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public void  run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Energieverbrauch ein:");
        double energyConsumption = scanner.nextDouble();
        scanner.close();
        EnergyReadingData energyReadingData = new EnergyReadingData(LocalDate.now(), LocalTime.now(), energyConsumption);
        // Aquí deberías guardar la entidad energyReadingData en tu base de datos
        System.out.println("Energieverbrauch gespeichert: " + energyReadingData.getEnergyConsumption());
    }
}