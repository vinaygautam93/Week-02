// LibraryBook class
class LibraryBook {
    public String ISBN;           // Public attribute
    protected String title;       // Protected attribute
    private String author;        // Private attribute

    // Constructor to initialize book details
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }
}

// Subclass demonstrating access modifiers
class EBook extends LibraryBook {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}
