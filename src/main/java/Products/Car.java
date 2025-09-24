package Products;

import Vehicle.vehicle;

public class Car extends vehicle {

    public Car(int Wheels, int Doors){
        super(Wheels,Doors, "Black"); // Call the parent constructor to set wheels, doors, and color
    }
public Car(){}

@Override
    public void start() {
        System.out.println("Car has now started!");
    }

    public void stop() {
        System.out.println("Car has now stopped!");
    }

    public void openTrunk() {
        System.out.println("Trunk is now open.");
    }
}
