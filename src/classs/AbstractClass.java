/*
 What is an Abstract Class?
An abstract class in Java:
Is declared using the abstract keyword.
Cannot be instantiated directly.
Can have both abstract methods (without body) and concrete methods (with body).
Must be extended by a subclass to implement abstract methods.
 */
package classs;
// Abstract class
abstract class Animal {
    
    // Abstract method (no body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass that extends the abstract class
public class AbstractClass extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        AbstractClass dog = new AbstractClass();  // Creating object of subclass
        dog.sound();  // Calls implemented method
        dog.sleep();  // Calls inherited concrete method
    }
}
