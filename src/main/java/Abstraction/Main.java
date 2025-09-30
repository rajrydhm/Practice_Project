package Abstraction;

public class Main {
    public static void main(String[] args) {

        //abstract = Used to define abstract classes and methods
        //           Abstraction is the process of hiding implementation details and showing only essential functionality
        //           Abstract classes cannot be instantiated, but they can have a subclass
        //           Abstract classes can have abstract methods (methods without a body),
        //           which must be implemented in the subclass
        //           Abstract classes can also have concrete methods (methods with a body),
        //           which can be used in the subclass
        //           Abstract classes can have attributes to support concrete methods
        //           Abstract methods cannot be static or final
        //           If a class has at least one abstract method, the class must be declared abstract


        //Shape shape = new Shape(); Error: Shape is abstract; cannot be instantiated
        Shape circle = new Circle(5);
        //circle.radius = 10;  Error: cannot assign a value to final variable radius
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Area of Shapes:");
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());

        System.out.println("\nDisplaying information about Shapes:");
        Shape.info();
         // Shape.display(); Error: non-static method display() cannot be referenced from a static context
        // Shape.color();  And Abstract methods cannot be static and abstract classes cannot be initialized

        // Abstract classes can have attributes to support concrete methods and can be used in the subclass
        System.out.println("\nAdding color to Shapes using Abstract Super class's attribute:");
        circle.color = "Red";
        rectangle.color = "Blue";
        triangle.color = "Green";
        System.out.println("Circle Color: " + circle.color);
        System.out.println("Rectangle Color: " + rectangle.color);
        System.out.println("Triangle Color: " + triangle.color);

        circle.color(); // Calls the overridden method in Circle class

    }
}
