package Car;
import Engine.Engine;

public class Car {
    private final int Wheels = 4;
    private int Doors = 4;
    public String color = "White";
    private Engine engine;
    public static String model = "Manual";

    public Engine getEngine(){
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
