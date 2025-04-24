/*
 What is a POJO Class?
A POJO (Plain Old Java Object) is a simple Java class used to hold data.
It does not extend any class or implement any interfaces.
It typically contains:
Private variables
Public getters and setters
A default constructor (and optionally parameterized constructors)
A toString() method (optional, but helpful)
 */

package classs;

public class PojoClass {

    // Private variables
    private String name;
    private int age;

    // Default constructor
    public PojoClass() {
    }

    // Parameterized constructor
    public PojoClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // toString method for displaying info
    @Override
    public String toString() {
        return "PojoClass [name=" + name + ", age=" + age + "]";
    }

    // main method to test the POJO
    public static void main(String[] args) {
        PojoClass person = new PojoClass();
        person.setName("Fairoz");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person);  // calls toString()
    }
}
