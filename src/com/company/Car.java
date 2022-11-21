package com.company;

public class Car implements Comparable<Car> {

    private int number;
    private String model;
    private String brand;
    private String color;
    private int power;

    @Override
    public String toString () {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    public Car (int number, String model, String brand, String color, int power) {
        this.number = number;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.power = power;
    }



    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public int getPower () {
        return power;
    }

    public void setPower (int power) {
        this.power = power;
    }

    @Override
    public int compareTo (Car car) {
        return this.number - car.number;
    }
}
