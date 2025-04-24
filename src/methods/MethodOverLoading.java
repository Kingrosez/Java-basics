/*  
 What is Method Overloading?
Method overloading means having multiple methods with the same name but different parameters (type or number).
It helps in achieving compile-time polymorphism in Java.
*/

package methods;

public class MethodOverLoading {

    // Method with no parameters
    void show() {
        System.out.println("No parameters");
    }

    // Method with one int parameter
    void show(int a) {
        System.out.println("Integer parameter: " + a);
    }

    // Method with two int parameters
    void show(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with one double parameter
    void show(double a) {
        System.out.println("Double parameter: " + a);
    }

    // Method with string parameter
    void show(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();

        obj.show();               // No parameters
        obj.show(10);             // Integer
        obj.show(10, 20);         // Two integers
        obj.show(3.14);           // Double
        obj.show("Fairoz");       // String
    }
}
