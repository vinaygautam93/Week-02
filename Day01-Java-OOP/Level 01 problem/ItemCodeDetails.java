import java.util.Scanner;

class Item {
    // Attributes itemCode, itemName, and price
    int itemCode;
    String itemName;
    int price;

    // Constructor
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display the item details
    public void displayTheDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }
}

public class ItemCodeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter itemCode: ");
        int itemCode = input.nextInt();

        // Consume the leftover newline
        input.nextLine();

        System.out.println("Enter itemName: ");
        String itemName = input.nextLine();

        System.out.println("Enter item price: ");
        int price = input.nextInt();

        // Create an object of the Item class
        Item obj = new Item(itemCode, itemName, price);

        // Call the displayTheDetails method
        obj.displayTheDetails();
    }
}
