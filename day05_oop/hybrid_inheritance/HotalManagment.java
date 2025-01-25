package day05_oop.hybrid_inheritance;

// Superclass representing a general Person
class Person {
    protected String name; // Name of the person
    protected int id;      // ID of the person

    // Constructor to initialize Person attributes
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface representing a Worker
interface Worker {
    void performDuties(); // Abstract method for duties
}

// Subclass representing a Chef
class Chef extends Person implements Worker {
    private String specialty; // Specialty of the chef

    // Constructor to initialize Chef attributes
    public Chef(String name, int id, String specialty) {
        super(name, id); // Initialize superclass attributes
        this.specialty = specialty;
    }

    // Overriding performDuties to specify chef's duties
    @Override
    public void performDuties() {
        System.out.println("Duties: Prepares meals and oversees kitchen operations.");
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass representing a Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned; // Number of tables assigned to the waiter

    // Constructor to initialize Waiter attributes
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id); // Initialize superclass attributes
        this.tablesAssigned = tablesAssigned;
    }

    // Overriding performDuties to specify waiter's duties
    @Override
    public void performDuties() {
        System.out.println("Duties: Serves customers and takes orders.");
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}

// Main class to test the implementation
public class HotalManagment {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Alice Johnson", 201, 5);

        // Display information and duties for each worker
        System.out.println("Restaurant Staff Details:");
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
