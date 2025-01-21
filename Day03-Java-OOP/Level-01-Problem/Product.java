class Product {
    static double discount = 5.0; // Shared discount for all products
    final String productID; // Unique identifier for each product
    String productName; // Name of the product
    double price; // Price of the product
    int quantity; // Quantity of the product in the cart

    // Constructor to initialize product details
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; // Resolving ambiguity with 'this'
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the shared discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display product details if the object is a Product instance
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("P101", "Laptop", 1200.0, 2);
        Product product2 = new Product("P102", "Mouse", 25.0, 5);

        product1.displayDetails();
        product2.displayDetails();

        Product.updateDiscount(10.0);
        System.out.println("Updated Discount: " + Product.discount + "%");
    }
}
