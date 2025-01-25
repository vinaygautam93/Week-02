package day05_oop.multilevel_inheritance;


// Base class representing a generic Course
class Course {
    protected String courseName; // Name of the course
    protected int duration;      // Duration of the course in weeks

    // Constructor to initialize Course attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass representing an Online Course
class OnlineCourse extends Course {
    protected String platform;    // Platform offering the course
    protected boolean isRecorded; // Whether the course is recorded

    // Constructor to initialize OnlineCourse attributes
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Initialize attributes from the superclass
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayCourseInfo to include online course details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Display general course details
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass representing a Paid Online Course
class PaidOnlineCourse extends OnlineCourse {
    private double fee;      // Course fee
    private double discount; // Discount on the fee

    // Constructor to initialize PaidOnlineCourse attributes
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Initialize attributes from the superclass
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the final fee after applying the discount
    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    // Overriding displayCourseInfo to include paid course details
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Display online course details
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + getFinalFee());
    }
}

// Main class to demonstrate the course hierarchy
public class EducationalCourse {
    public static void main(String[] args) {
        // Create a PaidOnlineCourse object
        PaidOnlineCourse course = new PaidOnlineCourse("Java Programming", 12, "Udemy", true, 200.0, 20.0);

        // Display course details
        System.out.println("Course Details:");
        course.displayCourseInfo();
    }
}
