package org.example;
import Car.Car;
import Engine.Engine;

public class App {
    public static void main( String[] args ) {
        //Encapsulation Example
        System.out.println("Car model: " + Car.model); // Access static public attribute, no object needed.
        Car bmw = new Car(); // Create an instance of Car
        System.out.println("Car color: " + bmw.color); // Access non-static public attribute, object needed.

        bmw.color = "Red"; // Change the color of the car but with object since it's non-static public.
        Car.model = "Automatic"; // Change the static model attribute without an object.
        System.out.println("Updated bmw color: " + bmw.color); // Display updated color
        //Calling static model attribute directly from the class, not recommended, hence the warning.
        System.out.println("Updated bmw model: " + bmw.model);

        //System.out.println(Engine.type); Cannot call like this, since type is not static and private.
        Engine engine = new Engine(); // Create an instance of Engine
        System.out.println("Engine type: " + engine.getType()); // Access the type using the getter method
        engine.setType("V8"); // Change the type of the engine using the setter method
        System.out.println("Updated Engine type: " + engine.getType()); // Display updated engine

        //calling Engine from Car class
        //bmw.Engine = "V10"; // Assign the engine to the car doesn't work since Engine is not a public attribute in Car.
       // bmw.setEngine("V10");  // Use the setter method to assign the engine to the car doesn't work since setEngine expects an Engine object, not a String.
        //now lets create an Engine object and set it to the car
        Engine mybmwEngine = new Engine();// Create an instance of Engine
        mybmwEngine.setType("V10");
        bmw.setEngine(mybmwEngine);
        System.out.println("BMW's engine type: " + bmw.getEngine().getType()); // This will not work since Engine is not public in Car.












    }
}

