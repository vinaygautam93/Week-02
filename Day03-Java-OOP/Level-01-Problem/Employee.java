class Employee {
    static String companyName = "Tech Corp"; // Shared company name for all employees
    private static int totalEmployees = 0; // Tracks the total number of employees
    final int id; // Employee ID, which cannot be changed after assignment
    String name, designation; // Employee's name and job title

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name; // Resolving ambiguity with 'this'
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees whenever a new employee is added
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details if the object is an Employee instance
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 1, "Developer");
        Employee emp2 = new Employee("Emma", 2, "Manager");

        emp1.displayDetails();
        emp2.displayDetails();

        System.out.println("Company Name: " + Employee.companyName);
        Employee.displayTotalEmployees();
    }
}
