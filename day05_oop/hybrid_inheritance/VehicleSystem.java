package day05_oop.hybrid_inheritance;

// Superclass representing a general Vehicle
class Vehicle {
    protected String model;    // Model of the vehicle
    protected int maxSpeed;    // Maximum speed of the vehicle

    // Constructor to initialize Vehicle attributes
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display basic vehicle details
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface representing a Refuelable vehicle
interface Refuelable {
    void refuel(); // Abstract method for refueling
}

// Subclass representing an Electric Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // Battery capacity of the EV

    // Constructor to initialize ElectricVehicle attributes
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Initialize superclass attributes
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass representing a Petrol Vehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity; // Fuel tank capacity

    // Constructor to initialize PetrolVehicle attributes
    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed); // Initialize superclass attributes
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Overriding refuel method to specify refueling process
    @Override
    public void refuel() {
        System.out.println("Refueling the vehicle...");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class to test the implementation
public class VehicleSystem {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50.0);

        // Display information and actions for each vehicle
        System.out.println("Vehicle Details:");
        ev.displayInfo();
        ev.charge();
        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
