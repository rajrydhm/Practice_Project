package Polymorphism;

public abstract class Vehicle {

    // Since polymorphism is being used, we can make this class abstract.
    // Abstract class = a class that is meant to be inherited from, not instantiated
    // Abstract method = a method that is declared without an implementation
    // Polymorphism is better with abstract classes because it enforces the child classes to implement the abstract methods

    public abstract void go();
}
