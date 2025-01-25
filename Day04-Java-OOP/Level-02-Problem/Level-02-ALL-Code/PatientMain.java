import java.util.ArrayList;
import java.util.List;

// Patient Class
class Patient {
    private String name;
    private String ailment;
    private List<Doctor> doctors;

    public Patient(String name, String ailment) {
        this.name = name;
        this.ailment = ailment;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayDoctors() {
        System.out.println("Doctors for " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }
    }

    public String getName() {
        return name;
    }
}

// Doctor Class
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting " + patient.getName() + " for their ailment.");
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void displayPatients() {
        System.out.println("Patients for Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

// Hospital Class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Main Class
public class PatientMain {
    public static void main(String[] args) {
        // Create Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Alice", "Neurologist");

        // Add Doctors to Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create Patients
        Patient patient1 = new Patient("John", "Heart Issues");
        Patient patient2 = new Patient("Emily", "Migraine");

        // Add Patients to Hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1);
        doctor2.consult(patient2);

        // Display Details
        hospital.showDetails();
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();
    }
}
