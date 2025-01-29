package System;

public class Car {
    private String carID;
    private String brand;
    private String model;
    private double rentalPrice;
    private boolean isRented;

    public Car(String carID, String brand, String model, double rentalPrice) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isRented = false; // Initially, car is available
    }

    public String getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        this.isRented = true;
    }

    public void returnCar() {
        this.isRented = false;
    }

    @Override
    public String toString() {
        return "Car ID: " + carID + " | Brand: " + brand + " | Model: " + model + 
               " | Rental Price: $" + rentalPrice + " per day | Status: " + 
               (isRented ? "Rented" : "Available");
    }
}
