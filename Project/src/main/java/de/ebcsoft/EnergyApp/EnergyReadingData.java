package de.ebcsoft.EnergyApp;

import java.time.LocalDate;
import java.time.LocalTime;

public class EnergyReadingData {


    private Long id;

    private LocalDate readingDate;

    private LocalTime readingTime;

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


}