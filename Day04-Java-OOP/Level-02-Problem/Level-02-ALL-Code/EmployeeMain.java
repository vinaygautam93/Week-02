import java.util.ArrayList;

// Define the Employee class
class Employee {
    private String name;
    private String id;

    // Constructor to initialize the Employee attributes
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to get the employee's name
    public String getName() {
        return name;
    }

    // Method to get the employee's ID
    public String getId() {
        return id;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

// Define the Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor to initialize the Department with its name
    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + name + " department:");
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }
}

// Define the Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize the Company with its name
    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display all departments in the company
    public void displayDepartments() {
        System.out.println("Departments in " + name + " company:");
        for (Department department : departments) {
            department.displayEmployees();
        }
    }

    // Method to delete the company and all departments
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company " + name + " and all associated departments and employees have been deleted.");
    }
}

// EmployeeMain class to demonstrate the Composition relationship
public class EmployeeMain {
    public static void main(String[] args) {
        // Create Company instance
        Company company = new Company("TechCorp");

        // Create Department instances
        Department engineering = new Department("Engineering");
        Department hr = new Department("HR");

        // Create Employee instances
        Employee employee1 = new Employee("Alice", "E101");
        Employee employee2 = new Employee("Bob", "E102");
        Employee employee3 = new Employee("Charlie", "E103");

        // Add employees to departments
        engineering.addEmployee(employee1);
        engineering.addEmployee(employee2);
        hr.addEmployee(employee3);

        // Add departments to the company
        company.addDepartment(engineering);
        company.addDepartment(hr);

        // Display the company, departments, and employees
        company.displayDepartments();

        // Delete the company (along with all departments and employees)
        company.deleteCompany();
    }
}
