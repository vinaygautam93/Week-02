package day05_oop.multilevel_inheritance;

// Base class representing a general Order
class Order {
    protected String orderId;     // Unique ID of the order
    protected String orderDate;   // Date when the order was placed

    // Constructor to initialize Order attributes
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status (default: "Order Placed")
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass representing a Shipped Order
class ShippedOrder extends Order {
    protected String trackingNumber; // Tracking number for the shipment

    // Constructor to initialize ShippedOrder attributes
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Initialize attributes from the superclass
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus to indicate the order is shipped
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Overriding displayOrderDetails to include tracking information
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display general order details
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass representing a Delivered Order
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate; // Date when the order was delivered

    // Constructor to initialize DeliveredOrder attributes
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Initialize attributes from superclass
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus to indicate the order is delivered
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Overriding displayOrderDetails to include delivery information
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display shipped order details
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to demonstrate multilevel inheritance
public class OnlineRetail {
    public static void main(String[] args) {
        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD12345", "2025-01-15", "TRK987654", "2025-01-20");

        // Display the order details and current status
        System.out.println("Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Current Status: " + deliveredOrder.getOrderStatus());
    }
}

