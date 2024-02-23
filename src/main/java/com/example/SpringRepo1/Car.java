package com.example.SpringRepo1;

import jakarta.persistence.*;

@Entity
@Table

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String modelName;
    @Column (nullable = false)
    private String serialNumber;
    @Column (nullable = true)
    private double currentPrice;

    public Car(Long id, String modelName, String serialNumber, double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", currentPrice=" + currentPrice +
                '}';
    }
}

