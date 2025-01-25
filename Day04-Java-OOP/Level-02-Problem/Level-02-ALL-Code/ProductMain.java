import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order Class
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}

// Customer Class
class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrders() {
        System.out.println("Orders for " + name + " (" + email + "):");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main Class
public class ProductMain {
    public static void main(String[] args) {
        // Create Products
        Product laptop = new Product("Laptop", 750.0);
        Product mouse = new Product("Mouse", 25.0);
        Product keyboard = new Product("Keyboard", 50.0);

        // Create Orders
        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order(102);
        order2.addProduct(keyboard);

        // Create Customer
        Customer customer = new Customer("John Doe", "john@example.com");

        // Place Orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // View Orders
        customer.viewOrders();
    }
}
