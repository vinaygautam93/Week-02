// Person class demonstrating a copy constructor
public class Person {
    private String name; // Attribute to store name
    private int age;     // Attribute to store age

    // Parameterized constructor to initialize attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor to clone another Person object
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create a person object
        Person originalPerson = new Person("Alice", 30);
        System.out.println("Original Person: " + originalPerson.getName() + ", Age: " + originalPerson.getAge());

        // Create a copy of the person object
        Person copiedPerson = new Person(originalPerson);
        System.out.println("Copied Person: " + copiedPerson.getName() + ", Age: " + copiedPerson.getAge());
    }
}
