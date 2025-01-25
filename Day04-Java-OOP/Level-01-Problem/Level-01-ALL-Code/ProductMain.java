import java.util.ArrayList;
import java.util.List;

// Represents a Product in the store
class Product {
    private String productName;
    private double price;

    // Constructor to initialize product with name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Get the product name
    public String getProductName() {
        return productName;
    }

    // Get the price of the product
    public double getPrice() {
        return price;
    }
}

// Represents a Customer who buys multiple products
class Customer {
    private String name;
    private String customerID;
    private List<Product> products;

    // Constructor to initialize the customer with name and ID
    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.products = new ArrayList<>();
    }

    // Add a product to the customer's purchase list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get the list of products the customer has bought
    public List<Product> getProducts() {
        return products;
    }

    // Get the customer's name
    public String getName() {
        return name;
    }
}

// BillGenerator class to compute the total bill for the customer
class BillGenerator {
    // Method to calculate the total bill for the customer
    public static double generateBill(Customer customer) {
        double total = 0.0;

        // Calculate the total by summing up the prices of all purchased products
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }

        // Return the total amount
        return total;
    }
}

// Main class to demonstrate the system
public class ProductMain {
    public static void main(String[] args) {
        // Create products
        Product phone = new Product("Smartphone", 699.99);
        Product laptop = new Product("Laptop", 999.99);
        Product headphones = new Product("Headphones", 199.99);

        // Create a customer and add products to their purchase list
        Customer customer = new Customer("Alice Smith", "C1001");
        customer.addProduct(phone);
        customer.addProduct(laptop);
        customer.addProduct(headphones);

        // Generate and print the total bill for the customer
        double totalBill = BillGenerator.generateBill(customer);
        System.out.println("Total bill for " + customer.getName() + ": $" + totalBill);
    }
}
