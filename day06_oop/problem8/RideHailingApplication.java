package day06_oop.problem8;

// Abstract class Vehicle defines common properties and methods for different vehicles
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare, to be implemented by subclasses
    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm + "/km";
    }

    // Getter for ratePerKm
    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Subclass for Car
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Now using the getter method to access ratePerKm
    }
}

// Subclass for Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Subclass for Auto
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "Alex", 10);
        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 20km: " + car.calculateFare(20));

        Vehicle bike = new Bike("V002", "Brian", 5);
        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 15km: " + bike.calculateFare(15));
    }
}
