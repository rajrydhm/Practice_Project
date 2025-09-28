package Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Encapsulation package");

        Car car = new Car();
        System.out.println("Car color: " + car.color);
        System.out.println("Car model: " + car.model);
        // we cannot access private attributes directly, so we use getter methods if they are available
        // We can get the values of private attributes without setter methods, as long as they are available through getter methods.
        // However, we cannot modify the values of private attributes without setter methods.

        System.out.println("Car wheels: " + car.getWheels());// Access private attribute using getter
        System.out.println("Car doors: " + car.getDoors());// Access private attribute

        //let's try to set the wheels and doors using setter methods
        car.setWheels(6);
        car.setDoors(2);
        System.out.println("Updated Car wheels: " + car.getWheels());// Access private attribute using getter
        System.out.println("Updated Car doors: " + car.getDoors());// Access private

        // Now let's work with engine which is also a private attribute of Car class with Engine class as data type
        Engine carEngine = new Engine(); // Create an instance of Engine
        carEngine.setType("V8"); // Set the engine type using setter method
        System.out.println("Car engine type: " + carEngine.getType()); // Access engine type using getter method
        // Now let's set the engine to the car
        car.setEngine(carEngine);
        System.out.println("My Car engine type from Car class: " + car.getEngine().getType());// Access engine type from Car class using getter methods

        // Let's work with horsepower which is a private attribute of type Engine in Car class
        System.out.println("My Car engine type from Car class: " + car.getEngine().horsepower);



    }
}
