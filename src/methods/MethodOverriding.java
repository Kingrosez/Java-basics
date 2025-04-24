/*
 What is Method Overriding?
Method Overriding occurs when a child class provides its own implementation of a method that is already defined in its parent class.
The method in both classes must have the same name, return type, and parameters.
 */



package methods;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a; // Reference of parent class

        a = new Dog();  // Refers to Dog object
        a.sound();      // Calls Dog's sound()

        a = new Cat();  // Refers to Cat object
        a.sound();      // Calls Cat's sound()
    }
}

