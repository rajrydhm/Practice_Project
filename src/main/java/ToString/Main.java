package ToString;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class
        //               Used to return a string representation of an object
        //               By default, it returns a hash code as unique identifier.
        //               which can be overridden to provide meaningful details.

        Boat boat = new Boat("SeaRay", "SLX400", 2023, 104999.99);
        System.out.println(boat); // It will print the hash code unless toString() is overridden in Boat class
        System.out.println(boat.year + " " + boat.make + " " + boat.model); // Manual way to print details
        System.out.println(boat.displayInfo()); // Using a method to display details
        //toString() method is similar to displayInfo() method but it's already available in every class
        //it's an easier way to print object details without creating a new method


        System.out.println("---------------------");
        System.out.println("toString() example using Car class:");

        Car car = new Car("Honda", "Civic", 2022);
        System.out.println(car); // Implicit call to toString()

        Car car2 = new Car();
        System.out.println(car2);
    }
}
