class Vehicle {
    static double registrationFee = 5000.0; // Shared registration fee for all vehicles
    final String registrationNumber; // Unique identifier for each vehicle
    String ownerName, vehicleType; // Owner's name and type of the vehicle

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber; // Resolving ambiguity with 'this'
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the shared registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display vehicle details if the object is a Vehicle instance
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("V123", "John", "Car");
        Vehicle vehicle2 = new Vehicle("V456", "Emily", "Bike");

        vehicle1.displayDetails();
        vehicle2.displayDetails();

        Vehicle.updateRegistrationFee(5500.0);
        System.out.println("Updated Registration Fee: $" + Vehicle.registrationFee);
    }
}
