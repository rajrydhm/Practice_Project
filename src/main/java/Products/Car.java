package Products;

import Vehicle.vehicle;

public class Car extends vehicle {
    public int Wheels = 2;
    public int Doors = 3;

    public Car(int Wheels, int Doors){
        this.Wheels = Wheels;
        this.Doors = Doors;
    }
public Car(){}

@Override
    public void start() {
        System.out.println("Car has now started!");
    }

    public void stop() {
        System.out.println("Car has now stopped!");
    }
}
