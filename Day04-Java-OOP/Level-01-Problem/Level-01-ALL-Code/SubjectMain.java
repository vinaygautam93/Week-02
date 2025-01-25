import java.util.ArrayList;
import java.util.List;

// Represents a Subject in which a student can enroll
class Subject {
    private String subjectName;
    private double score;

    // Constructor to initialize subject with a name and score
    public Subject(String subjectName, double score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    // Get the subject name
    public String getSubjectName() {
        return subjectName;
    }

    // Get the score for this subject
    public double getScore() {
        return score;
    }
}

// Represents a Student who has multiple subjects
class Student {
    private String name;
    private String studentID;
    private List<Subject> subjects;

    // Constructor to initialize a student with a name and ID
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
    }

    // Add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Get the list of subjects for this student
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Get the student's name
    public String getName() {
        return name;
    }
}

// GradeCalculator class to compute grades for a student
class GradeCalculator {
    // Method to calculate the average score of a student
    public static double calculateAverage(Student student) {
        List<Subject> subjects = student.getSubjects();
        double totalScore = 0;

        // Sum all the scores from the subjects
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        // Return the average score
        return subjects.size() > 0 ? totalScore / subjects.size() : 0;
    }

    // Method to calculate the grade based on average score
    public static String calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

// Main class to demonstrate the working of the application
public class SubjectMain {
    public static void main(String[] args) {
        // Create subjects
        Subject math = new Subject("Math", 85);
        Subject science = new Subject("Science", 90);
        Subject english = new Subject("English", 75);

        // Create a student and add subjects to them
        Student student = new Student("John Doe", "S12345");
        student.addSubject(math);
        student.addSubject(science);
        student.addSubject(english);

        // Calculate the average score for the student
        double averageScore = GradeCalculator.calculateAverage(student);
        System.out.println("Average Score for " + student.getName() + ": " + averageScore);

        // Calculate and display the grade based on the average score
        String grade = GradeCalculator.calculateGrade(averageScore);
        System.out.println("Grade for " + student.getName() + ": " + grade);
    }
}