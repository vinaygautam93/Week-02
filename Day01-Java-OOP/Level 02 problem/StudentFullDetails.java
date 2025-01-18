import java.util.Scanner;
//Student  class for  attributes name, rollNumber, and marks.   
class Student  {
    
	//attributes name, rollNumber, and marks.
	String name;
	String rollNumber;
	int marks;
	
	//Create the Constructor
	public Student ( String name , String rollNumber , int marks ) {
	   this.name = name;
	   this.rollNumber = rollNumber;
	   this.marks = marks;
	}	
	
	// Method to Find Grade
	public String studentGrade() {
		if( marks >= 85 && marks <= 100) {
		   return "A+";
		}
        else if( marks < 85 && 	marks >= 75 ) {
           return "A";
        }
        else if( marks < 75 && 	marks >= 60 ) {
           return "B";
        }
        else if( marks < 60 && 	marks >= 50 ) {
           return "c";
        }
		else if( marks < 50 && 	marks >= 33 ) {
           return "D";
        }
		else {
			return "F";
		}	
	}	
		
	
	// Method to Display the name, rollNumber, and marks.
	public void displayTheDetails() {
	   System.out.println("Student name: " + name);
       System.out.println("Student rollNumber: " + rollNumber);
       System.out.println("Student marks: " + marks);
	   
	   System.out.println("Student grade: " + studentGrade());
    }
}
public class StudentFullDetails {
    public static void main( String []args) {
	   
	   Scanner input = new Scanner( System.in );
	   System.out.println("Enter Student  name: " );
	   String name = input.nextLine();
	   
       System.out.println("Enter Student  rollNumber: ");
	   String rollNumber = input.nextLine();
	   
       System.out.println("Enter Student  marks: " );
	   int marks = input.nextInt();
	   
	   //Create a object of Student  class 
	   Student  obj = new Student ( name , rollNumber , marks );
	   //Call the displayTheDetails method 
	   obj.displayTheDetails();
	}
}	
