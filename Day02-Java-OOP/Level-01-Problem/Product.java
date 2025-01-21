// Product class to manage inventory
public class Product {
    private String productName;   // Instance variable for product name
    private double price;         // Instance variable for product price
    private static int totalProducts = 0; // Class variable for total products

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.0);
        Product p2 = new Product("Smartphone", 500.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
