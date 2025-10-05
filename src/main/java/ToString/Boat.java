package ToString;

public class Boat {
     String make = "Yamaha";
     String model = "212X";
     int year = 2021;
     double price = 55999.99;

    public Boat(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String displayInfo(){
        return year + " " + make + " " + model;
    }

}
