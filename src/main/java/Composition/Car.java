package Composition;

public class Car {
    String name;
    String model;
    int year;
    Engine engine;
    //we created object engine with datatype Engine Class here and linked to anonymous object of Engine class
    //on line 18 while passing engineType string to the Engine Constructor to initialize String type in the Engine Class
    //If you notice engineType is not initialized here in Car class since it never used here.

    public Car(){
    }

    public Car(String name, String model, int year, String engineType){
        this.name = name;
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); //here we are creating an a new Engine object with engineType argument
    }

    @Override
    public String toString() {
        return "Car is " + name + " " + model + " " + year + " " + engine.type;
    }
    //try using toString() method more often to practice method override and simplifying code.
}
