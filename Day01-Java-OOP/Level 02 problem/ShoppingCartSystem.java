import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for item details
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to update quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<CartItem> cartItems;

    // Constructor to initialize an empty shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println(quantity + " more of " + itemName + " added to the cart.");
                return;
            }
        }
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart Items:");
            for (CartItem item : cartItems) {
                System.out.println(item.getItemName() + " - ₹" + item.getPrice() + " x " + item.getQuantity() +
                        " = ₹" + item.getTotalPrice());
            }
        }
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + totalCost);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Loop to handle user actions
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart items");
            System.out.println("4. Display total cost");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter item price:");
                    double price = scanner.nextDouble();
                    System.out.println("Enter quantity:");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.println("Enter item name to remove:");
                    String removeItem = scanner.nextLine();
                    cart.removeItem(removeItem);
                    break;

                case 3:
                    cart.displayCartItems();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Thank you for using the Shopping Cart System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
