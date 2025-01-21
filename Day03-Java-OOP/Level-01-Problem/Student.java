class Student {
    static String universityName = "Global University"; // Shared university name for all students
    private static int totalStudents = 0; // Tracks the total number of students
    final int rollNumber; // Roll number, unique and immutable for each student
    String name, grade; // Name and grade of the student

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String grade) {
        this.name = name; // Resolving ambiguity with 'this'
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students whenever a new student is enrolled
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details if the object is a Student instance
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        student1.displayDetails();
        student2.displayDetails();

        Student.displayTotalStudents();
    }
}
