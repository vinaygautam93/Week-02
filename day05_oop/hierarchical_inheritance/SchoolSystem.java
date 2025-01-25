package day05_oop.hierarchical_inheritance;

// Base class representing a general Person
class Person {
    protected String name; // Name of the person
    protected int age;     // Age of the person

    // Constructor to initialize Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass representing a Teacher
class Teacher extends Person {
    private String subject; // Subject taught by the teacher

    // Constructor to initialize Teacher attributes
    public Teacher(String name, int age, String subject) {
        super(name, age); // Initialize superclass attributes
        this.subject = subject;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Overriding displayInfo to include subject
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Subclass representing a Student
class Student extends Person {
    private int grade; // Grade of the student

    // Constructor to initialize Student attributes
    public Student(String name, int age, int grade) {
        super(name, age); // Initialize superclass attributes
        this.grade = grade;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Overriding displayInfo to include grade
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Subclass representing a Staff member
class Staff extends Person {
    private String department; // Department of the staff member

    // Constructor to initialize Staff attributes
    public Staff(String name, int age, String department) {
        super(name, age); // Initialize superclass attributes
        this.department = department;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Overriding displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances of different roles
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");
        Student student = new Student("Alice Johnson", 16, 10);
        Staff staff = new Staff("Mrs. Brown", 50, "Administration");

        // Display information about each role
        System.out.println("School System Details:");
        teacher.displayRole();
        teacher.displayInfo();
        System.out.println();

        student.displayRole();
        student.displayInfo();
        System.out.println();

        staff.displayRole();
        staff.displayInfo();
    }
}



