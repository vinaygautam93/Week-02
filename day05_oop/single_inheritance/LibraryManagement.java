package day05_oop.single_inheritance;

// Superclass representing a Book
class Book {
    protected String title;           // Title of the book
    protected int publicationYear;    // Year the book was published

    // Constructor to initialize Book attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass representing an Author
class Author extends Book {
    private String name;  // Author's name
    private String bio;   // Short biography of the author

    // Constructor to initialize Author attributes
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call the constructor of the superclass
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test the implementation
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "An American novelist known for his iconic works.");

        // Display information about the book and its author
        System.out.println("Library Info:");
        author.displayInfo();
    }
}

