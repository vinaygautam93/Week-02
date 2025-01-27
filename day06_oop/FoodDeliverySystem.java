package day06_oop;

// Abstract class FoodItem defines common properties and methods for food items
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price, to be implemented by subclasses
    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }
}

// Subclass for VegItem
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

// Subclass for NonVegItem
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 5.0; // Non-veg items have additional charges
    }
}

// Interface for items that are discountable
interface Discountable {
    void applyDiscount();
    double getDiscountDetails();
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Burger", 100, 2);
        System.out.println(vegItem.getItemDetails());
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());

        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 120, 2);
        System.out.println(nonVegItem.getItemDetails());
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
    }
}
