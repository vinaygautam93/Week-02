
package day05_oop.assisted_problem;

/// Base class
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor for Employee
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor for Manager
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor for Developer
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    private String university;

    // Constructor for Intern
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each type of employee
        Manager manager = new Manager("Alice", 101, 75000, 10);
        Developer developer = new Developer("Bob", 102, 65000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, "MIT");

        // Displaying details of each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}
