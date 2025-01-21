// Book class with borrow functionality
public class Book {
    private String title;       // Book title
    private String author;      // Book author
    private double price;       // Book price
    private boolean available;  // Availability status

    // Constructor to initialize book attributes
    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a book
        Book book = new Book("Java Programming", "John Smith", 500.0, true);
        System.out.println("Borrowing the book: " + (book.borrowBook() ? "Success" : "Failed"));
        System.out.println("Borrowing the book again: " + (book.borrowBook() ? "Success" : "Failed"));
    }
}
