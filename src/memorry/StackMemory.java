/*
 What is Stack Memory in Java?
Stack Memory is used to store primitive variables (like int, float, etc.) and method call information (such as local variables and method calls).
Each thread has its own stack, meaning the stack memory is not shared between threads.
The stack operates on the Last In, First Out (LIFO) principle: the last method called is the first one to return.

Key Points About Stack Memory:
Stores local variables: Variables defined inside methods (including parameters) are stored in stack memory.
Method Calls: Every method call pushes a new stack frame onto the stack, which includes the method's local variables.
Automatic Cleanup: When a method finishes executing, its stack frame is popped off the stack, and all local variables are discarded automatically.
LIFO Structure: Last-in, first-out — the most recent method call is the first to return.

Stack vs. Heap:
Feature	            Stack Memory	                        	Heap Memory
Used for	        Local variables, method calls	        	Objects, arrays
Size	            Small and limited	                    	Larger, more flexible
Lifetime	        Temporary, cleared once the method ends		Long-lived, managed by GC
Thread Safety	    separate for each thread	            	Shared among all threads
 */

package memorry;

public class StackMemory {

    // Simple method that demonstrates stack memory
    public static void main(String[] args) {
        int a = 10; // Stored in Stack (primitive type)

        // Calling another method
        addNumbers(a, 20);  // Method call added to Stack

        // Local variables in methods are also stored in Stack
        String message = "Hello Stack!";
        System.out.println(message);
    }

    // Method that uses local variables (stored in Stack)
    public static void addNumbers(int x, int y) {
        int sum = x + y;  // Local variable in method, stored in Stack
        System.out.println("Sum: " + sum);
    }
}

