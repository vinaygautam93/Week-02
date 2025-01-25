import java.util.ArrayList;
import java.util.List;

// Represents a book with a title and author
class Book {
    private String title;
    private String author;

    // Constructor to initialize a book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Print book details
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Represents a library that can hold multiple books
class Library {
    private String name;
    private List<Book> books; // Aggregation relationship: Library contains books

    // Constructor to initialize the library
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        System.out.println("Books:");
        for (Book book : books) {
            book.printDetails();
        }
    }
}

// Main class to demonstrate Library and Book aggregation
public class BookMainTwo {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create two libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book1); // Book can exist in multiple libraries

        // Display books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}




