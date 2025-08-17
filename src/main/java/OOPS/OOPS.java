/*
package OOPS;

public class OOPS {

    // --- 1. Abstraction: Define what a Vehicle should be able to do,
// without saying exactly how it works
    abstract class Vehicle {
        // Abstract methods - subclasses MUST implement these
        public abstract void start();
        public abstract void stop();
        public abstract void honk();
    }

    // --- 2. Encapsulation: DefaultCar hides its internals (private variables),
// and exposes public getters/setters to safely access or modify data
    class DefaultCar extends Vehicle {
        // Private fields (encapsulated)
        private int doors;
        private int wheels;
        private String engine;
        private String color;

        // Constructor to set up the default car
        public DefaultCar(int doors, int wheels, String engine, String color) {
            this.doors = doors;
            this.wheels = wheels;
            this.engine = engine;
            this.color = color;
        }

        // Public getters and setters to safely access private data
        public int getDoors() {
            return doors;
        }
        public void setDoors(int doors) {
            this.doors = doors;
        }

        public int getWheels() {
            return wheels;
        }
        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public String getEngine() {
            return engine;
        }
        public void setEngine(String engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        // Implement abstract methods from Vehicle
        @Override
        public void start() {
            System.out.println("Starting the default car engine: " + engine);
        }

        @Override
        public void stop() {
            System.out.println("Stopping the default car.");
        }

        @Override
        public void honk() {
            System.out.println("Default car horn: Beep beep!");
        }
    }

    // --- 3. Inheritance: PickupTruck inherits DefaultCar, adding extra features
    class PickupTruck extends DefaultCar {
        private boolean hasCargoBed;

        public PickupTruck(int doors, int wheels, String engine, String color, boolean hasCargoBed) {
            super(doors, wheels, engine, color); // Inherit DefaultCar constructor
            this.hasCargoBed = hasCargoBed;
        }

        // New method specific to PickupTruck
        public void loadCargo() {
            if (hasCargoBed) {
                System.out.println("Loading cargo into the truck bed.");
            } else {
                System.out.println("No cargo bed available.");
            }
        }

        // Override start() to add custom behavior
        @Override
        public void start() {
            System.out.println("Starting the pickup truck engine: " + getEngine());
            System.out.println("Pickup truck rumbles to life!");
        }

        // You can override other methods or add more features here
    }

    // --- 4. Polymorphism: Using superclass reference to hold subclass objects,
// calling methods that behave differently depending on the actual object type
    public class Main {
        public static void main(String[] args) {
            // Create a DefaultCar object
            DefaultCar bmw = new DefaultCar(4, 4, "V8", "Black");
            bmw.start();    // Uses DefaultCar start()
            bmw.honk();     // Uses DefaultCar honk()
            System.out.println("BMW color is: " + bmw.getColor());  // Encapsulation getter example

            System.out.println();

            // Create a PickupTruck object but store it in DefaultCar reference (polymorphism)
            DefaultCar fordTruck = new PickupTruck(2, 4, "V10 Diesel", "Red", true);
            fordTruck.start();    // Calls PickupTruck's overridden start()
            fordTruck.honk();     // Calls DefaultCar's honk() (inherited)
            // fordTruck.loadCargo(); // ERROR: loadCargo() not visible from DefaultCar reference

            System.out.println();

            // To access PickupTruck-specific methods, cast the reference
            if (fordTruck instanceof PickupTruck) {
                ((PickupTruck) fordTruck).loadCargo();
            }

            // Demonstrating encapsulation: safely changing engine type
            bmw.setEngine("V12");
            System.out.println("BMW new engine: " + bmw.getEngine());
        }
    }

}
*/
// testing the main branch