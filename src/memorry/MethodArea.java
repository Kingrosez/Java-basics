/*
What is the Method Area in Java?
The Method Area is a part of the JVM memory that stores class-level data like:
Class metadata (class name, superclass name, etc.)
Static variables
Constant pool
Method information (name, return type, parameters)
Field information
Code for methods and constructors
The Method Area is a shared memory area for all threads.

How to Remember:
static = class-level = goes into Method Area
instance variables/objects = go into Heap
method calls and local variables = go into Stack

Extra Note:
In Java 8 and earlier, the Method Area was also called "PermGen" (Permanent Generation). From Java 8 onward, it is replaced by "Metaspace", which grows automatically.

 */

package memorry;

public class MethodArea {
	static int count = 0;  // Stored in Method Area (because it's static)

    public static void displayMessage() {  // Method info stored in Method Area
        System.out.println("Hello from static method!");
    }

    public static void main(String[] args) {
    	MethodArea.displayMessage();  // Calls method stored in Method Area
    }
}
