// Circle class demonstrating constructor chaining
public class Circle {
    private double radius; // Attribute to store radius

    // Default constructor with a default radius
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create a circle with default radius
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());

        // Create a circle with a specific radius
        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle Radius: " + customCircle.getRadius());
        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
    }
}
