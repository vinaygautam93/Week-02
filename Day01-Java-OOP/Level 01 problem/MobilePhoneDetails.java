import java.util.Scanner;
//MobilePhone class for  attributes brand, model, and price.   
class MobilePhone {
    
	//attributes brand, model, and price.
	String brand;
	String model;
	int price;
	
	//Create the Constructor
	public MobilePhone( String brand , String model , int price ) {
	   this.brand = brand;
	   this.model = model;
	   this.price = price;
	}	
	
	// Method to Display the brand, model, and price.
	public void displayTheDetails() {
	   System.out.println("Book brand: " + brand);
       System.out.println("Book model: " + model);
       System.out.println("Book price: " + price);
    }
}
public class MobilePhoneDetails {
    public static void main( String []args) {
	   
	   Scanner input = new Scanner( System.in );
	   System.out.println("Enter MobilePhone brand: " );
	   String brand = input.nextLine();
	   
       System.out.println("Enter MobilePhone model: ");
	   String model = input.nextLine();
	   
       System.out.println("Enter MobilePhone price: " );
	   int price = input.nextInt();
	   
	   //Create a object of MobilePhone class 
	   MobilePhone obj = new MobilePhone( brand , model , price );
	   //Call the displayTheDetails method 
	   obj.displayTheDetails();
	}
}	
