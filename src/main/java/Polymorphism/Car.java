package Polymorphism;

public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("You drive the car...");
    }

    public void drift() {
        System.out.println("You drift the car...");
    }
}
