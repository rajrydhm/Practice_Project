package org.example;
import Products.Bike;
import Vehicle.vehicle;
import Engine.Engine;
import Products.Car;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {

        //Encapsulation Example
        System.out.println("Default vehicles created: " + vehicle.numberOfVehicles); // To access static public attribute, no object needed.
        vehicle car = new vehicle(); // Create an instance of vehicle
        System.out.println("Default vehicle non-static color is: " + car.color); // Access non-static public attribute, object needed.

        car.color = "Red"; // Change the color of the vehicle but with object since it's non-static public.
        vehicle.numberOfVehicles = 1; // Change the static model attribute without an object.
        System.out.println("Updated car color: " + car.color); // Display updated color
        //Calling static model attribute directly from the class, not recommended, hence the warning.
        System.out.println("Latest Number of vehicles: " + car.numberOfVehicles); //better practice is to use vehicle.model

        //System.out.println(Engine.type); Cannot call like this, since type is not static and private.
        Engine engine = new Engine(); // Create an instance of Engine
        System.out.println("Default Engine type: " + engine.getType()); // Access the type using the getter method
        engine.setType("V8"); // Change the type of the engine using the setter method
        System.out.println("Updated Engine type: " + engine.getType()); // Display updated engine

        //calling Engine from vehicle class
        //car.Engine = "V10"; // Assign the engine to the vehicle doesn't work since Engine is not a public attribute in vehicle.
        // car.setEngine("V10");  // Use the setter method to assign the engine to the vehicle doesn't work since setEngine expects an Engine object, not a String.
        //now let's create an Engine object and set it to the vehicle
        Engine mycarEngine = new Engine();// Create an instance of Engine
        mycarEngine.setType("V10");
        car.setEngine(mycarEngine);
        System.out.println("New car's engine type: " + car.getEngine().getType()); // car.getEngine() will not work since Engine is not public in vehicle.

        System.out.println("Constructor Example");
        vehicle bike = new vehicle(2, 0, "grey");// Create an instance of vehicle using the constructor
        Engine bikeEngine = new Engine();
        bikeEngine.setType("Electric");
        bike.setEngine(bikeEngine);
        System.out.println(
                "Bike color:" + bike.color +
                        " Doors:" + bike.getDoors() +
                        " Wheels:" + bike.getWheels() +
                        " Engine:" + bike.getEngine().getType() +
                        " Number of vehicles: " + vehicle.numberOfVehicles
        ); // Access non-static public attribute, object needed.

        System.out.println("-------------------");
        System.out.println("So far we saw that through instances of vehicle we can create a new car or bike," +
                "now let's look at their actions");

        car.start(); // Call the start method on the car instance
        car.stop(); // Call the stop method on the car instance
        bike.start(); // Call the start method on the bike instance
        bike.stop(); // Call the stop method on the bike instance

        System.out.println("-------------------");
        System.out.println("As you can see above Car and bike objects cannot override the start and stop methods of vehicle class. \n" +
                "Now let's create a new class called Car and Bike" +
                "that inherits from vehicle,\nand will be able overrides the constructors/methods" +
                "called \nInheritance \n");

        Car myCar = new Car();
        Bike myBike = new Bike();
        myCar.start(); // Calls overridden method in Car class
        myCar.stop();  // Calls overridden method in Car class
        myBike.start(); // Calls overridden method in Bike class
        myBike.stop(); // Calls overridden method in Bike class

        System.out.println("-------------------");
        System.out.println("Now we will override the constructors of vehicle class in Car and Bike classes using Super keyword");

        Car myCar2 = new Car(4, 2); // Create an instance of Car using the overridden constructor
        System.out.println("My new car has " + myCar2.getWheels() + " wheels and " + myCar2.getDoors() + " doors.");

        Bike myBike2 = new Bike(2,0, "Red", false); // Create an instance of Bike using the default constructor
        System.out.println("My new bike has " + myBike2.getWheels() + " wheels and " + myBike2.getDoors() + " doors" + " and color " + myBike2.color + " and hasGears: " + myBike2.hasGears);
    }
}
