package day05_oop.assisted_problem;

//Create a hierarchy where Animal is the superclass
 class Animal {

    //Define a superclass Animal with attributes name and age
    String name;
    int age;
    //Define a superclass Animal with method makeSound().
    void makeSound() {
        System.out.println(" Animal Sound ");
    }
}

//Animal is the superclass, and Dog subclasses
class Dog extends  Animal {
     // Override makeSound() method in this class
     @Override
    void makeSound() {
        System.out.println(" Dog Sound ");
    }
}
//Animal is the superclass Cat are subclasses
class Cat extends  Animal {
    // Override makeSound() method in this class
    @Override
    void makeSound() {
        System.out.println(" Cat Sound ");
    }
}
//Animal is the superclass and Bird are subclasses
class Bird extends Animal {
    // Override makeSound() method in this class
    @Override
    void makeSound() {
        System.out.println(" Bird Sound ");
    }
}
public class AnimalHierarchy {
     public static void main( String [] args ) {
         // Learn basic inheritance
         // Learn basic method overriding
         //we can create a Animal class object and call makeSound() the method
         Animal obj1 = new Animal();
         obj1.makeSound();

         //we can create a Dog class object and call makeSound() the method
         Dog obj2 = new Dog();
         obj2.makeSound();

         //we can create a cat class object and call makeSound() the method
         Cat obj3 = new Cat();
         obj3.makeSound();

         //we can create a Bird class object and call makeSound() the method
         Bird obj4 = new Bird();
         obj4.makeSound();

     }
}


