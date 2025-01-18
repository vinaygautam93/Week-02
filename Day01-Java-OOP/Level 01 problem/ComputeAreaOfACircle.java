
import java.util.Scanner;

// Circle class for attributes radius and calculating area
class Circle {
    // Attribute radius
    int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display the result
    public void displayResults() {
        System.out.println("Area is: " + getArea());
        System.out.println("Circumference is: " + getCircumference());
    }
}

public class ComputeAreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = input.nextInt();

        // Create an object of Circle class
        Circle obj = new Circle(radius);

        // Call the displayResults method
        obj.displayResults();

        input.close();
    }
}
