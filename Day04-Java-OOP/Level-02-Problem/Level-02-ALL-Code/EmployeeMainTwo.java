import java.util.ArrayList;
import java.util.List;

// Represents an Employee in a department
class Employee {
    private String name;

    // Constructor to initialize an employee
    public Employee(String name) {
        this.name = name;
    }

    // Get employee details
    public String getName() {
        return name;
    }
}

// Represents a Department within a company
class Department {
    private String name;
    private List<Employee> employees;

    // Constructor to initialize a department
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display department and employee details
    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getName());
        }
    }
}

// Represents a Company composed of multiple departments
class Company {
    private String name;
    private List<Department> departments;

    // Constructor to initialize the company
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display company details
    public void displayDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    // Clear all departments and employees when the company is deleted
    public void closeCompany() {
        System.out.println("Closing company: " + name);
        departments.clear(); // Removes all departments and their employees
    }
}

// Main class to demonstrate the composition relationship
public class EmployeeMainTwo {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Create departments
        Department itDepartment = new Department("IT Department");
        Department hrDepartment = new Department("HR Department");

        // Add employees to IT department
        itDepartment.addEmployee(new Employee("Alice"));
        itDepartment.addEmployee(new Employee("Bob"));

        // Add employees to HR department
        hrDepartment.addEmployee(new Employee("Charlie"));
        hrDepartment.addEmployee(new Employee("Diana"));

        // Add departments to the company
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        // Display company structure
        company.displayDetails();

        // Delete the company and observe that all departments and employees are removed
        company.closeCompany();
    }
}
