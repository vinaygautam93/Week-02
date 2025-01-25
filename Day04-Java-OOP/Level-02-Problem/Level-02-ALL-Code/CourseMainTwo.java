import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String name;
    private String code;
    private Professor professor;
    private List<Student> students;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewDetails() {
        System.out.println("Course: " + name + " (" + code + ")");
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Courses for " + name + " (ID: " + id + "):");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private int id;
    private List<Course> assignedCourses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setProfessor(this);
    }

    public void viewCourses() {
        System.out.println("Courses for Professor " + name + " (ID: " + id + "):");
        for (Course course : assignedCourses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Main Class
public class CourseMainTwo {
    public static void main(String[] args) {
        // Create Students
        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);

        // Create Professor
        Professor drSmith = new Professor("Dr. Smith", 201);

        // Create Courses
        Course cs101 = new Course("Data Structures", "CS101");
        Course cs102 = new Course("Algorithms", "CS102");

        // Enroll Students
        alice.enrollCourse(cs101);
        bob.enrollCourse(cs101);
        alice.enrollCourse(cs102);

        // Assign Professor
        drSmith.assignCourse(cs101);

        // View Details
        cs101.viewDetails();
        cs102.viewDetails();
        alice.viewCourses();
        drSmith.viewCourses();
    }
}
