import java.util.ArrayList;
import java.util.List;

// Faculty Class
class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Faculty: " + name + ", Specialization: " + specialization);
    }
}

// Department Class
class Department {
    private String name;
    private List<Faculty> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        employees.add(faculty);
    }

    public void displayFaculties() {
        System.out.println("Faculties in Department: " + name);
        for (Faculty faculty : employees) {
            faculty.displayInfo();
        }
    }
}

// University Class
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getClass().getSimpleName());
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        for (Department department : departments) {
            System.out.println("Deleting Department: " + department.getClass().getSimpleName());
        }
        departments.clear();
    }
}

// Main Class
public class FacultyMain {
    public static void main(String[] args) {
        // Create University
        University university = new University("XYZ University");

        // Create Departments
        Department csDepartment = new Department("Computer Science");
        Department meDepartment = new Department("Mechanical Engineering");

        // Add Departments to University
        university.addDepartment(csDepartment);
        university.addDepartment(meDepartment);

        // Create Faculty Members
        Faculty faculty1 = new Faculty("Dr. John", "Artificial Intelligence");
        Faculty faculty2 = new Faculty("Dr. Jane", "Robotics");

        // Add Faculty to Departments
        csDepartment.addFaculty(faculty1);
        meDepartment.addFaculty(faculty2);

        // Display Departments and Faculties
        university.displayDepartments();
        csDepartment.displayFaculties();
        meDepartment.displayFaculties();

        // Delete University
        university.deleteUniversity();

        // Faculties still exist
        faculty1.displayInfo();
        faculty2.displayInfo();
    }
}
