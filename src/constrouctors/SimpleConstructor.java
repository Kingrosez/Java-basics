package constrouctors;

class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Toyota";
        year = 2020;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    // 🔁 Copy constructor
    Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.year = otherCar.year;
        System.out.println("Copy constructor called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
    	// Defult constructor
        Car car = new Car();
        car.display();
        
        // Using parameterized constructor
        Car car1 = new Car("Honda", 2023);
        car1.display();

        // Using copy constructor
        Car car2 = new Car(car1);
        car2.display();
    }
}
