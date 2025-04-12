package javaVariables;

public class NonPrimitvieType {
	    public static void main(String[] args) {
	        String name = "Fairoz";           // String (non-primitive)
	        int[] numbers = {1, 2, 3};        // Array
	        Student student = new Student(); // Custom Class

	        System.out.println("Name: " + name);
	        System.out.println("First number: " + numbers[0]);
	        student.sayHello();
	    }
	}

	class Student {
	    void sayHello() {
	        System.out.println("Hello from Student class!");
	    }
	}



