class Book {
    static String libraryName = "Central Library"; // Shared library name for all books
    final String isbn; // Unique and immutable identifier for each book
    String title, author; // Book's title and author

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title; // Resolving ambiguity with 'this'
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display book details if the object is a Book instance
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "12345");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890");

        book1.displayDetails();
        book2.displayDetails();

        Book.displayLibraryName();
    }
}
