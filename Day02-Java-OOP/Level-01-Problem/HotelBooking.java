// HotelBooking class with multiple constructors
public class HotelBooking {
    private String guestName; // Guest name
    private String roomType;  // Type of room
    private int nights;       // Number of nights booked

    // Default constructor with default values
    public HotelBooking() {
        this("Guest", "Standard", 1); // Calls the parameterized constructor
    }

    // Parameterized constructor to initialize attributes
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor to create a new booking from an existing one
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Default booking
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Parameterized booking
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();

        // Copy booking
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();
    }
}
