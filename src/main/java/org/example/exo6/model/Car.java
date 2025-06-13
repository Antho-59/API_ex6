package org.example.exo6.model;

public class Car {

    private int id;
    private String brand;
    private String color;
    private int yearOfManufacture;

    public Car() {
    }
    public Car(int id, String brand, String color, int yearOfManufacture) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture() {
        this.yearOfManufacture = yearOfManufacture;
    }
}
