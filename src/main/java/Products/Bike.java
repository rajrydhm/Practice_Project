package Products;
import Vehicle.vehicle;
import Engine.Engine;

public class Bike extends vehicle {
    public boolean hasGears = true;

    public Bike(int Wheels, int Doors, String color, boolean hasGears){
        super(Wheels, Doors, color);// Default engine
        this.hasGears = hasGears;
    }

    public Bike(){}

    @Override
    public void start() {
        System.out.println("Bike has now started!");
    }

    public void stop() {
        System.out.println("Bike has now stopped!");
    }


}
