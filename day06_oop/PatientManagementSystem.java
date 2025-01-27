package day06_oop;

// Abstract class Patient defines common properties and methods for patients
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill, to be implemented by subclasses
    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

// Subclass for InPatient
class InPatient extends Patient {
    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 5000; // In-patient bill calculation
    }
}

// Subclass for OutPatient
class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 1000; // Out-patient bill calculation
    }
}

// Interface for medical records management
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

public class PatientManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John Doe", 35);
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());

        Patient outPatient = new OutPatient("P002", "Jane Doe", 28);
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());
    }
}
