package System;

import java.util.Scanner;

public class RentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car c1 = new Car("C101", "Maruti", "Alto", 1500.0);
        Car c2 = new Car("C102", "Tata", "Safari", 3000.0);
        Car c3 = new Car("C103", "Mahindra", "XUV-300", 1900.0);
        Car c4 = new Car("C104", "Mahindra", "XUV-500", 2500.0);
        Car c5 = new Car("C105", "Maruti", "Ertiga", 3200.0);

        RentShop rentshop = new RentShop();
        rentshop.addCar(c1);
        rentshop.addCar(c2);
        rentshop.addCar(c3);
        rentshop.addCar(c4);
        rentshop.addCar(c5);

        while (true) {
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    rentshop.carMenu();
                    break;
                case 2:
                    System.out.print("Enter Car ID to rent: ");
                    String rentID = scanner.nextLine();
                    rentshop.rentCar(rentID);
                    break;
                case 3:
                    System.out.print("Enter Car ID to return: ");
                    String returnID = scanner.nextLine();
                    rentshop.returnCar(returnID);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using the Car Rental System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
