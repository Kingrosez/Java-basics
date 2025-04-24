/*
What is a Static Class in Java?
In Java, top-level classes cannot be static.
You can declare a static nested class (i.e., a class inside another class marked static).
A static nested class:
Can be accessed without creating an object of the outer class.
Can access only static members of the outer class directly.
 */

package classs;

public class StaticClass {

    // Static variable
    static String course = "Java Programming";

    // Static nested class
    static class Trainer {
        void teach() {
            System.out.println("Teaching: " + course);
        }
    }

    public static void main(String[] args) {
        // Creating object of static nested class directly (no need for outer class object)
        StaticClass.Trainer obj = new StaticClass.Trainer();
        obj.teach();
    }
}

