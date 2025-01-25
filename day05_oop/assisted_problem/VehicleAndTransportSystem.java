package day05_oop.assisted_problem;
// Base class representing a generic vehicle
class Vehicle {
    protected int maxSpeed;    // Maximum speed of the vehicle
    protected String fuelType; // Type of fuel the vehicle uses

    // Constructor to initialize Vehicle attributes
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass representing a Car
class Car extends Vehicle {
    private int seatCapacity; // Number of seats in the car

    // Constructor to initialize Car attributes
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo to include Car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display common details
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass representing a Truck
class Truck extends Vehicle {
    private int loadCapacity; // Maximum load capacity in tons

    // Constructor to initialize Truck attributes
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo to include Truck-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display common details
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass representing a Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasCarrier; // Whether the motorcycle has a carrier

    // Constructor to initialize Motorcycle attributes
    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    // Overriding displayInfo to include Motorcycle-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method to display common details
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class to demonstrate the Vehicle hierarchy
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Creating objects for each type of vehicle
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Storing all vehicle objects in an array of type Vehicle
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Displaying information for each vehicle
        System.out.println("Vehicle Details:");
        for (Vehicle v : vehicles) {
            System.out.println("-------------");
            v.displayInfo(); // Polymorphism in action
        }
    }
}
