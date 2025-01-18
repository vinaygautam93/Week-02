
import java.util.Scanner;
//Book class for  attributes title, author, and price.   
class Book {
    
	//attributes title, author, and price.
	String title;
	String author;
	int price;
	
	//Create the Constructor
	public Book( String title , String author , int price ) {
	   this.title = title;
	   this.author = author;
	   this.price = price;
	}	
	
	// Method to Display the title, author, and price.
	public void displayTheDetails() {
	   System.out.println("Book title: " + title);
       System.out.println("Book author: " + author);
       System.out.println("Book price: " + price);
    }
}
public class BookDetails {
    public static void main( String []args) {
	   
	   Scanner input = new Scanner( System.in );
	   System.out.println("Enter Book title: " );
	   String title = input.nextLine();
	   
       System.out.println("Enter Book author: ");
	   String author = input.nextLine();
	   
       System.out.println("Enter Book price: " );
	   int price = input.nextInt();
	   
	   //Create a object of Book class 
	   Book obj = new Book( title , author , price );
	   //Call the displayTheDetails method 
	   obj.displayTheDetails();
	}
}	
