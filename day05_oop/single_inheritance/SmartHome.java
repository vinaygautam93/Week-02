package day05_oop.single_inheritance;


// Superclass representing a generic smart device
class Device {
    protected String deviceId; // Unique identifier for the device
    protected String status;   // Status of the device (e.g., "ON", "OFF")

    // Constructor to initialize Device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device information
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass representing a Thermostat
class Thermostat extends Device {
    private double temperatureSetting; // Current temperature setting

    // Constructor to initialize Thermostat attributes
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call the constructor of the superclass
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus to include thermostat-specific details
    @Override
    public void displayStatus() {
        super.displayStatus(); // Display general device details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the implementation
public class SmartHome {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("THERMO123", "ON", 24.5);

        // Display information about the thermostat
        System.out.println("Smart Home Device Info:");
        thermostat.displayStatus();
    }
}
