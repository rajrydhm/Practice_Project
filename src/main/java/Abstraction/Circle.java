package Abstraction;

public class Circle extends Shape {
    private final double radius; // final prevents reassignment after initialization

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("This is a circle.");
    }

    @Override
    void color(){
        color = "white";
        System.out.println("Color of the circle is " + color);
    }
}
