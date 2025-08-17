package org.example;
import Vehicle.vehicle;
import Engine.Engine;
import Truck.Truck;

public class App {
    public static void main( String[] args ) {

        //Encapsulation Example
        System.out.println("vehicle model: " + vehicle.model); // Access static public attribute, no object needed.
        vehicle car = new vehicle(); // Create an instance of vehicle
        System.out.println("vehicle color: " + car.color); // Access non-static public attribute, object needed.

        car.color = "Red"; // Change the color of the vehicle but with object since it's non-static public.
        vehicle.model = "Automatic"; // Change the static model attribute without an object.
        System.out.println("Updated car color: " + car.color); // Display updated color
        //Calling static model attribute directly from the class, not recommended, hence the warning.
        System.out.println("Updated car model: " + car.model); //better practice is to use vehicle.model

        //System.out.println(Engine.type); Cannot call like this, since type is not static and private.
        Engine engine = new Engine(); // Create an instance of Engine
        System.out.println("Engine type: " + engine.getType()); // Access the type using the getter method
        engine.setType("V8"); // Change the type of the engine using the setter method
        System.out.println("Updated Engine type: " + engine.getType()); // Display updated engine

        //calling Engine from vehicle class
        //car.Engine = "V10"; // Assign the engine to the vehicle doesn't work since Engine is not a public attribute in vehicle.
       // car.setEngine("V10");  // Use the setter method to assign the engine to the vehicle doesn't work since setEngine expects an Engine object, not a String.
        //now lets create an Engine object and set it to the vehicle
        Engine mycarEngine = new Engine();// Create an instance of Engine
        mycarEngine.setType("V10");
        car.setEngine(mycarEngine);
        System.out.println("car's engine type: " + car.getEngine().getType()); // This will not work since Engine is not public in vehicle.

        //Inheritance Example
        Truck myTruck = new Truck(); // Create an instance of Truck which inherits from vehicle
        System.out.println("Truck model: " + Truck.model); // Access static public attribute from













    }
}

