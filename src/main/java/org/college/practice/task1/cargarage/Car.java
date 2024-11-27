package org.college.practice.task1.cargarage;

public class Car {
    private final String carName; // Name of the car
    private final short year;     // Manufacturing year
    private final String manufacturer; // Manufacturer name

    // Constructor to initialize car details
    Car(String carName, short year, String manufacturer) {
        this.carName = carName;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    // Get the car's name
    String getCarName() {
        return carName;
    }

    // Get the car's manufacturer
    String getManufacturer() {
        return manufacturer;
    }

    // Get the manufacturing year
    short getYear() {
        return year;
    }

    // Display car details as a string
    @Override
    public String toString() {
        return "Car Name: " + getCarName() + ", Manufacturer: " + getManufacturer() + ", Year: " + getYear();
    }
}
