package Abstraction;

public abstract class Shape {
    String color;
    public abstract double area();
  //  public static abstract void color(); // Abstract methods cannot be static

    void display() {
        System.out.println("This is a shape.");
    }

    static void info() {
        System.out.println("Shapes can be 2D or 3D.");
    }

    void color(){
        System.out.println("Shapes can have different colors.");
    }


}
