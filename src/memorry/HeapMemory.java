/*
 What is Heap Memory in Java?
Heap memory is used for storing objects (both class instances and arrays).
It's managed by the JVM's garbage collector to automatically reclaim memory that is no longer in use (i.e., when there are no more references to an object).
The heap is shared among all threads, meaning objects stored in it are accessible from different parts of the program (i.e., all threads can access them).

Key Points About Heap Memory:
Heap storage: Used to store objects and arrays.
Garbage Collection: The garbage collector in the JVM will automatically free heap memory when objects are no longer referenced.
Thread Safety: Objects in the heap can be accessed by multiple threads, making heap memory shared.

📌 Understanding Memory Layout:
Stack stores references to objects.
Heap stores the actual objects themselves.
When an object is created (like new Person(...)), its memory is allocated in the heap, and the reference (like person1) is stored in the stack.
 */

package memorry;

public class HeapMemory {

    public static void main(String[] args) {

        // Creating an object (stored in Heap memory)
        Person person1 = new Person("Fairoz", 30);
        Person person2 = new Person("John", 25);

        // Calling methods on person objects
        person1.display();
        person2.display();
        
        // Creating another object, heap memory used again
        Person person3 = new Person("Jane", 28);
        person3.display();

        // Person objects are stored in Heap, but references are in Stack
        person1 = null; // person1 is now eligible for garbage collection
    }
}

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
