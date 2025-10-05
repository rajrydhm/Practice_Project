package Composition;

public class Main {
    public static void main(String[] args) {
        //Composition = Instance of one class is dependent on other class
        //              in short, one Class A object is created simultaneously while Class B object is create.

        Car car = new Car("Toyota","RAV4",2024,"V8");
        System.out.println(car);
    }
}
