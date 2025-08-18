package Products;
import Vehicle.vehicle;
import Engine.Engine;

public class SUV extends vehicle {
    private int seatingCapacity;
    private String driveType;

    @Override
    public Engine getEngine() {
        System.out.println("Custom SUV engine getter!");
        return super.getEngine();  // Still uses parent's logic
    }
}
