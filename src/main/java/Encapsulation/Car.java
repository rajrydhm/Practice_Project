package Encapsulation;

public class Car {
    private int Wheels = 4;
    private int Doors = 4;
    private Engine engine; //engine data type is Engine class, a class can also be a data type
    public String color = "White";
    public String model = "Manual";
    private Engine horsepower; // Private attribute of type Engine


    // Getter and Setter methods
    public int getWheels() {
        return Wheels;
    }

    public void setWheels(int wheels) {
        Wheels = wheels;
    }
    public int getDoors() {
        return Doors;
    }
    public void setDoors(int doors) {
        Doors = doors;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Engine horsepower) {
        this.horsepower = horsepower;
    }
}

