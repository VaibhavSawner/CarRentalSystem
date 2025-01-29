package System;

import java.util.ArrayList;

public class RentShop {
    private ArrayList<Car> carList;

    public RentShop() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void carMenu() {
        System.out.println("==== Available Cars for Rent ====");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public Car findCarByID(String carID) {
        for (Car car : carList) {
            if (car.getCarID().equalsIgnoreCase(carID)) {
                return car;
            }
        }
        return null;
    }

    public boolean rentCar(String carID) {
        Car car = findCarByID(carID);
        if (car != null && !car.isRented()) {
            car.rentCar();
            System.out.println("Car " + carID + " has been rented successfully!");
            return true;
        } else {
            System.out.println("Car is either not available or already rented.");
            return false;
        }
    }

    public boolean returnCar(String carID) {
        Car car = findCarByID(carID);
        if (car != null && car.isRented()) {
            car.returnCar();
            System.out.println("Car " + carID + " has been returned successfully!");
            return true;
        } else {
            System.out.println("Car is either not rented or does not exist.");
            return false;
        }
    }
}
