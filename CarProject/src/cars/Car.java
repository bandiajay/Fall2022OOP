/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars;

/**
 *
 * @author AJAY
 */
public class Car {
    private String model;
    private double price;
    private boolean sedan;

    public Car(String model, double price, boolean sedan) {
        this.model = model;
        this.price = price;
        this.sedan = sedan;
    }

    public Car(String model, boolean sedan) {
        this.model = model;
        this.sedan = sedan;
        this.price = -99.0;
    }

    public Car(String model) {
        this.model = model;
        this.price = 999999.0;
        this.sedan = true;
    }

    public Car() {
        this.model = "Not yet invented!";
        this.price = -99.9;
        this.sedan = false;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", price=" + price + ", sedan=" + sedan + '}';
    }
    
    
    
}
