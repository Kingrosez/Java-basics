/*
What is a Final Class?
A final class cannot be extended (i.e., no class can inherit from it).
This is useful when you want to prevent inheritance for security, consistency, or design reasons.
Often used in utility classes (like java.lang.Math, java.lang.String).
 */

package classs;

// Declaring a final class
//Make sure this is a concrete class (NOT abstract or an interface)
final class Vehicle1 {
 void display() {
     System.out.println("This is a vehicle.");
 }
}


// Uncommenting the below code will give an error
// because you can't extend a final class
/*
class Car extends Vehicle {
    void show() {
        System.out.println("This is a car.");
    }
}
*/

public class FinalClass {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.display();
    }
}

