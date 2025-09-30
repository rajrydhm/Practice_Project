package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Polymorphism = "POLY" = many
        //               "MORPH" = forms
        //               many forms
        //              Objects can identify as other objects.
        //              Objects can be treated as objects of their parent class.
        //              Methods can use objects of different types at different times.
        //             But you cannot access the child-specific methods or attributes.

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car, bike, boat};

        System.out.println("\nPolymorphism with an array of objects:");
        for  (Vehicle v : vehicles) {
            v.go();
        }

        System.out.println("\nDowncasting example:");
        // car.drift(); This will cause an error because the Vehicle class does not have a drift method
        // You can create a separate object for Car and call the drift method,but we can also do downcasting
        //downcasting = casting a parent object to a child object
        Car car1 = (Car) car; // Downcasting car object from Vehicle to Car
        // here car1 is redundant, but it is used to show the downcasting
        car1.drift(); // Now you can access the drift method
        // you can also do it in one line like this
        ((Car) car).drift(); // Downcasting and calling the drift method in one line


        // Using polymorphism with an array of anonymous Vehicle objects
        System.out.println("\nPolymorphism with an array of anonymous Vehicle objects:");
        Vehicle[] garage = {new Car(), new Bike(), new Boat()};
        for (Vehicle v : garage) {
            v.go();
        }

        //Runtime polymorphism
        System.out.println("\nRuntime polymorphism example:");

        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle; // Declare vehicle variable here to use it outside the if-else block

        do {
            System.out.print("Enter a vehicle (car, bike, boat): ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "car":
                    vehicle = new Car();
                    vehicle.go();
                    break;
                case "bike":
                    vehicle = new Bike();
                    vehicle.go();
                    break;
                case "boat":
                    vehicle = new Boat();
                    vehicle.go();
                    break;
                default:
                    System.out.println("Unknown vehicle type.");
                    scanner.close();
                    return;
            }
        }while (true) ;

    }

}
