package methods;

public class PreDefineMethods {
    public static void main(String[] args) {

        // ✅ Example 1: String methods
        String name = "Fairoz";

        // length(): returns the number of characters
        System.out.println("Length of name: " + name.length());

        // toUpperCase(): converts to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // toLowerCase(): converts to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // charAt(): returns character at given index
        System.out.println("Character at index 2: " + name.charAt(2));

        // substring(): returns part of the string
        System.out.println("Substring from index 2: " + name.substring(2));

        // equals(): compares strings
        System.out.println("Is name equal to 'Fairoz'? " + name.equals("Fairoz"));

        // contains(): checks if a string contains a specific sequence
        System.out.println("Does name contain 'roz'? " + name.contains("roz"));


        // ✅ Example 2: Math class methods
        int a = -10;
        double b = 16.25;

        // abs(): returns absolute value
        System.out.println("Absolute of -10: " + Math.abs(a));

        // sqrt(): returns square root
        System.out.println("Square root of 16.25: " + Math.sqrt(b));

        // pow(): returns power of a number
        System.out.println("2 raised to power 3: " + Math.pow(2, 3));

        // max(): returns larger of two numbers
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));

        // min(): returns smaller of two numbers
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));

        // random(): returns a random double value between 0.0 and 1.0
        System.out.println("Random number: " + Math.random());

        // ✅ Example 3: Integer wrapper methods
        String numStr = "123";

        // parseInt(): converts string to int
        int number = Integer.parseInt(numStr);
        System.out.println("Parsed integer: " + number);

        // toBinaryString(): converts integer to binary string
        System.out.println("Binary of 10: " + Integer.toBinaryString(10));

        // toHexString(): converts integer to hexadecimal
        System.out.println("Hex of 255: " + Integer.toHexString(255));

        // ✅ Example 4: System methods
        // currentTimeMillis(): returns current time in milliseconds
        System.out.println("Current time in millis: " + System.currentTimeMillis());

        // exit(): stops the program
        // System.exit(0); // Uncomment this line to stop the program here
    }
}
