
import java.util.Scanner;
//Employee class for  attributes name, id, and salary. 
class Employee {
    
	//attributes name, id, and salary.
	String name;
	int id;
	int salary;
	
	//Create the Constructor
	public Employee( String name , int id , int salary ) {
	   this.name = name;
	   this.id = id;
	   this.salary = salary;
	}	
	
	// Display the name, id, and salary.
	public void displayTheDetails() {
	   System.out.println("Employee Name: " + name);
       System.out.println("Employee id: " + id);
       System.out.println("Employee salary: " + salary);
    }
}
public class DisplayEmployeeDetails {
    public static void main( String []args) {
	   
	   Scanner input = new Scanner( System.in );
	   System.out.println("Enter employee Name: " );
	   String name = input.nextLine();
	   
       System.out.println("Enter employee id: ");
	   int id = input.nextInt();
	   
       System.out.println("Enter employee salary: " );
	   int salary = input.nextInt();
	   
	   //Create a object of Employee class 
	   Employee obj = new Employee( name , id , salary );
	   //Call the displayTheDetails method 
	   obj.displayTheDetails();
	}
}	
