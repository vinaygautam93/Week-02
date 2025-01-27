package day06_oop;

// Abstract class for general product behavior
abstract class Product {
    private String productId; // Unique product ID
    private String name;      // Product name
    private double price;     // Product price

    // Constructor to initialize product properties
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount, to be implemented by subclasses
    public abstract double calculateDiscount();

    // Getter for price
    public double getPrice() {
        return price;
    }
}

// Electronics class extends Product and provides specific discount behavior
class Electronics extends Product {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price); // Call parent constructor
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount for electronics
    }
}

// Clothing class extends Product and provides specific discount behavior
class Clothing extends Product {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount for clothing
    }
}

// Groceries class extends Product and provides specific discount behavior
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount for groceries
    }
}

// Interface to handle taxable products
interface Taxable {
    double calculateTax(); // Method to calculate tax
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product product = new Electronics("E101", "Laptop", 1000);
        System.out.println("Discount: " + product.calculateDiscount()); // Calculate and display discount
    }
}
