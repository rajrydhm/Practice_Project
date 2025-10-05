package ToString;

public class Car {
     String make = "Toyota";
     String model = "Corolla";
     int year = 2020;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(){}

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
