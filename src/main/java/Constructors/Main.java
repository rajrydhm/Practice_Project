package Constructors;

public class Main {
    public static void main(String[] args) {
        // Creating a Student object using the Constructor

        Customer customer1 = new Customer("Alice", 20, 1000.0);
        Customer customer2 = new Customer ("Bob", 22, 5000.0);

        System.out.println("customer1\nName: " + customer1.name
                + "\nAge: " + customer1.age
                + "\nBalance: " + customer1.balance);

        System.out.println("\ncustomer2\nName: " + customer2.name
                + "\nAge: " + customer2.age
                + "\nBalance: " + customer2.balance);

        // Constructor sets the object's initial attribute values.
        // Object is created from a class; constructor runs on creation.
        // If no constructor is written, Java adds a default one: Customer() { }
        // Default (no-argument) constructors let you write: Customer c = new Customer();
        // Writing any constructor removes the automatic default constructor.
        // Add your own no-arg constructor if you want both default and custom constructors.


    }
}
