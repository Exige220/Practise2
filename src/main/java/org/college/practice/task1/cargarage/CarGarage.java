package org.college.practice.task1.cargarage;

import java.util.HashMap;
public class CarGarage {
    private static CarGarage instance = null; // Singleton instance
    private HashMap<String, Car> cars; // Collection to store cars
    private String garageName; // Name of the garage

    // Private constructor for singleton pattern
    private CarGarage(String garageName) {
        this.garageName = garageName;
        this.cars = new HashMap<>();
    }

    // Static method to get the singleton instance
    public static CarGarage getInstance(String name) {
        if (instance == null) {
            instance = new CarGarage(name);
        }
        return instance;
    }

    // Add a car to the garage
    public boolean addCar(Car car) {
        if (!cars.containsKey(car.getCarName())) {
            cars.put(car.getCarName(), car);
            return true;
        }
        return false;
    }

    // Remove a car by its name
    public boolean removeCar(String name) {
        return cars.remove(name) != null;
    }

    // Get a description of a specific car
    public String describeCar(String name) {
        Car car = cars.get(name);
        if (car != null) {
            return car.toString();
        }
        return "Car not found";
    }

    // Check if a car exists in the garage
    public boolean getCar(String name) {
        return cars.containsKey(name);
    }

    // Get the total number of cars in the garage
    public int getCarCount() {
        return cars.size();
    }

    // Get all cars in the garage
    public HashMap<String, Car> getCars() {
        return cars;
    }

    // Get the name of the garage
    public String getName() {
        return garageName;
    }
}
