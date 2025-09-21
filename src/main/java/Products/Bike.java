package Products;
import Vehicle.vehicle;
import Engine.Engine;

public class Bike extends vehicle {

    @Override
    public void start() {
        System.out.println("Bike has now started!");
    }

    public void stop() {
        System.out.println("Bike has now stopped!");
    }
}
