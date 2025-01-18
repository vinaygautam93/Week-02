import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor to initialize ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book the ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for the movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for ticket details
        System.out.println("Enter movie name:");
        String movieName = scanner.nextLine();
        System.out.println("Enter seat number:");
        String seatNumber = scanner.nextLine();
        System.out.println("Enter ticket price:");
        double price = scanner.nextDouble();

        // Create a new ticket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Display ticket details
        ticket.displayTicketDetails();

        // Ask the user to book the ticket
        System.out.println("\nDo you want to book this ticket? (yes/no)");
        scanner.nextLine(); // Consume newline
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            ticket.bookTicket();
        } else {
            System.out.println("Booking canceled.");
        }

        // Display ticket details after user's decision
        System.out.println("\nUpdated Ticket Details:");
        ticket.displayTicketDetails();

        scanner.close();
    }
}
