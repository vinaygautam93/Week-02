class Patient {
    static String hospitalName = "City Hospital"; // Shared hospital name for all patients
    private static int totalPatients = 0; // Tracks the total number of admitted patients
    final int patientID; // Unique identifier for each patient
    String name, ailment; // Patient's name and ailment
    int age; // Patient's age

    // Constructor to initialize patient details
    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name; // Resolving ambiguity with 'this'
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients when a new patient is admitted
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Display patient details if the object is a Patient instance
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("Alice", 1, 30, "Flu");
        Patient patient2 = new Patient("Bob", 2, 45, "Diabetes");

        patient1.displayDetails();
        patient2.displayDetails();

        System.out.println("Hospital Name: " + Patient.hospitalName);
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
