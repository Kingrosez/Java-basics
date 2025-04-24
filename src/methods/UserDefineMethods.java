package methods;

public class UserDefineMethods {

    // Method without return type and without parameters
    void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }

    // Method with return type and no parameters
    int getYear() {
        return 2025;
    }

    // Method with parameters and return type
    int add(int a, int b) {
        return a + b;
    }

    // Method with parameters and no return type
    void displayMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Main method to call user-defined methods
    public static void main(String[] args) {
        UserDefineMethods obj = new UserDefineMethods();

        obj.greet(); // calling method without parameters
        System.out.println("Current year: " + obj.getYear()); // method with return
        System.out.println("Sum: " + obj.add(10, 20)); // passing arguments and getting result
        obj.displayMessage("Fairoz"); // passing a string to display
    }
}

