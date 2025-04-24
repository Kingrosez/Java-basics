/*
 What is a Concrete Class?
A concrete class in Java is a class that:
Has complete implementation (i.e., not abstract)
Can be used to create objects
Can implement abstract classes or interfaces
 */

package classs;

// Define an interface
interface Vehicle {
    void start();
    void stop();
}

// Concrete class implementing the interface
public class ConcreteClass implements Vehicle {

    // Implementing methods of the interface
    @Override
    public void start() {
        System.out.println("Vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stopped");
    }

    // Additional method
    public void fuelType() {
        System.out.println("Runs on petrol");
    }

    // main method to run the code
    public static void main(String[] args) {
        ConcreteClass car = new ConcreteClass();
        car.start();
        car.fuelType();
        car.stop();
    }
}
