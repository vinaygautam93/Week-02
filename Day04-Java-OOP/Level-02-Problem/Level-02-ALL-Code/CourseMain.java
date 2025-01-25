import java.util.ArrayList;
import java.util.List;

// Define the Course class
class Course {
    private String courseName;
    private String courseId;
    private List<Student> enrolledStudents;

    // Constructor to initialize course attributes
    public Course(String courseName, String courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        enrolledStudents = new ArrayList<>();
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to view all students enrolled in the course
    public void viewStudents() {
        System.out.println("Students enrolled in " + courseName + " course:");
        for (Student student : enrolledStudents) {
            student.displayStudentInfo();
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }
}

// Define the Student class
class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    // Constructor to initialize student attributes
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Method to view all courses the student is enrolled in
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student: " + name + ", ID: " + studentId);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}

// Define the School class
class School {
    private String name;
    private List<Student> students;

    // Constructor to initialize school attributes
    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the school
    public void displayStudents() {
        System.out.println("Students in " + name + " school:");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}

// Main class to demonstrate the association and aggregation relationships
public class CourseMain {
    public static void main(String[] args) {
        // Create instances of School, Students, and Courses
        School school = new School("ABC High School");
        Student student1 = new Student("John", "S001");
        Student student2 = new Student("Jane", "S002");
        Course course1 = new Course("Math", "C101");
        Course course2 = new Course("Science", "C102");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display all students in the school
        school.displayStudents();

        // Display all courses enrolled by each student
        student1.viewCourses();
        student2.viewCourses();

        // View all students enrolled in each course
        course1.viewStudents();
        course2.viewStudents();
    }
}
