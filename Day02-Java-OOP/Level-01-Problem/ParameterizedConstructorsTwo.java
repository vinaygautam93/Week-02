//Create a Book class with attributes title, author, and price
class Book {
    String title;
    String author;
    int price;

    // Parameterized constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class ParameterizedConstructorsTwo {
    public static void main(String[] args) {
        // Creating an object of the Book class
        Book obj = new Book("DSA", "Vinay", 1000);

        // Printing the details of the book
        System.out.println("Title: " + obj.title);
        System.out.println("Author: " + obj.author);
        System.out.println("Price: " + obj.price);
    }
}

	
	    