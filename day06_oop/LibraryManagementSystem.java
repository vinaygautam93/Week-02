package day06_oop;

// Abstract class LibraryItem defines the structure for different types of library items
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize library item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to get loan duration, to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

// Subclass for Book
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }
}

// Subclass for Magazine
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }
}

// Subclass for DVD
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }
}

// Interface for reservable items
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Java Programming", "John Doe");
        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
    }
}
