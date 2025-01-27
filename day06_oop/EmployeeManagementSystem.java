package day06_oop;

// Abstract class Employee to hold common properties and methods for all employees.
abstract class Employee {
    private int employeeId; // Unique employee ID
    private String name;    // Name of the employee
    private double baseSalary; // Base salary of the employee

    // Constructor to initialize common properties
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to be implemented by subclasses to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }

    // Getter method for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }
}

// FullTimeEmployee class extends Employee and provides implementation for full-time employees
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Full-time employees have a fixed salary
    }
}

// PartTimeEmployee class extends Employee and implements salary calculation based on hours worked
class PartTimeEmployee extends Employee {
    private int workHours; // Number of hours worked by the part-time employee

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours; // Part-time salary is calculated by multiplying base salary with hours worked
    }
}

// Interface to represent department behavior
interface Department {
    void assignDepartment(String departmentName); // Assign department to an employee
    String getDepartmentDetails(); // Get department details
}

// Manager class implements Department interface to assign and display department details
class Manager implements Department {
    private String departmentName;

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Bob", 2000, 80);

        emp1.displayDetails(); // Display details of full-time employee
        emp2.displayDetails(); // Display details of part-time employee

        Manager manager = new Manager();
        manager.assignDepartment("HR");
        System.out.println(manager.getDepartmentDetails()); // Display assigned department
    }
}
