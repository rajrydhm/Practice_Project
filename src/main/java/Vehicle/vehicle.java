package Vehicle;
import Engine.Engine;

public class vehicle {
    private int Wheels = 4;
    private int Doors = 4;
    public String color = "White";
    private Engine engine;
    public String model = "Manual";
    public static int numberOfVehicles = 0; // static attribute to count instances

    public vehicle (int Wheels, int Doors, String color){
        this.Wheels = Wheels;
        this.Doors = Doors;
        this.color = color;
        this.engine = new Engine(); // Default engine
    }

    //@overloading a constructor
    public vehicle (){
    }


    public Engine getEngine(){
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWheels(){
        return this.Wheels;
    }

    public int getDoors(){
        return this.Doors;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }
}
