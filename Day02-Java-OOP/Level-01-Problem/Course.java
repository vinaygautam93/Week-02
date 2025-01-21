// Course class to manage course details
public class Course {
    private String courseName;      // Instance variable for course name
    private int duration;           // Instance variable for duration in weeks
    private double fee;             // Instance variable for course fee
    private static String instituteName = "Default Institute"; // Class variable

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");
        Course c1 = new Course("Java Programming", 12, 600.0);
        Course c2 = new Course("Web Development", 10, 500.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
