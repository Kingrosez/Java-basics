/*
What is an Enum in Java?
An enum is a special Java type used to define a set of named constants (like DAYS, COLORS, etc.).
Enums are type-safe and can have:
Variables
Constructors
Methods

Key Features of Enums:
Enums extend java.lang.Enum implicitly, so they can’t extend other classes.
Can include constructors, fields, and methods.
Enum values are constants (use UPPER_CASE by convention).
Can be used in switch statements.
 */

package enums;

// Define an enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Enums {

    // Method that accepts an enum as a parameter
    public void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Weekend vibes 😎");
                break;
            default:
                System.out.println("Just another weekday.");
        }
    }

    public static void main(String[] args) {
        Enums obj = new Enums();
        
        // Accessing enum values
        Day today = Day.SUNDAY;
        System.out.println("Today is: " + today);
        
        // Passing enum to method
        obj.printDayMessage(today);
    }
}
