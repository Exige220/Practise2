package org.college.practice.task1.cargarage;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the garage
        CarGarage garage = CarGarage.getInstance("Modern Car Garage");

        boolean running = true;

        while (running) {
            System.out.println("\nAvailable Commands:");
            System.out.println("1. Add a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Describe a car");
            System.out.println("4. Show all cars");
            System.out.println("5. Show total number of cars");
            System.out.println("6. Find a car by name");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter car name: ");
                String name = scanner.nextLine();

                System.out.print("Enter manufacturing year: ");
                short year = Short.parseShort(scanner.nextLine());

                System.out.print("Enter manufacturer: ");
                String manufacturer = scanner.nextLine();

                Car car = new Car(name, year, manufacturer);

                if (garage.addCar(car)) {
                    System.out.println("Car successfully added.");
                } else {
                    System.out.println("A car with this name already exists.");
                }

            } else if (choice.equals("2")) {
                System.out.print("Enter car name: ");
                String name = scanner.nextLine();

                if (garage.removeCar(name)) {
                    System.out.println("Car successfully removed.");
                } else {
                    System.out.println("Car not found.");
                }

            } else if (choice.equals("3")) {
                System.out.print("Enter car name: ");
                String name = scanner.nextLine();

                System.out.println(garage.describeCar(name));

            } else if (choice.equals("4")) {
                System.out.println("Cars in the garage:");
                for (Car car : garage.getCars().values()) {
                    System.out.println(car);
                }

            } else if (choice.equals("5")) {
                System.out.println("Total number of cars in " + garage.getName() + ": " +
                        garage.getCarCount());

            } else if (choice.equals("6")) {
                System.out.print("Enter car name: ");
                String carName = scanner.nextLine();

                if (garage.getCar(carName)) {
                    System.out.println(garage.describeCar(carName));
                } else {
                    System.out.println("Car not found.");
                }

            } else if (choice.equals("7")) {
                System.out.println("Exiting program. Have a great day!");
                running = false;

            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
