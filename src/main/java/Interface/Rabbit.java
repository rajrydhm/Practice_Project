package Interface;

public class Rabbit implements Prey{

    // Implementing abstract methods from Prey interface
    @Override
    public void hide() {
        System.out.println("The rabbit is hiding.");
    }

    @Override
    public String name() {
        return "Rabbit";
    }

    @Override
    public int age() {
        return 2;
    }

    @Override
    public double weight() {
        return 1.5;
    }

    @Override
    public void scream() {
        System.out.println("The rabbit squeals!");
    }

    //@Override // Cannot override static method from interface
    // Static methods belong to the interface itself, not to instances of the interface
    // and cannot be overridden by implementing classes
    public void info() { // Providing a new method, not overriding
        System.out.println("Rabbits are small mammals known for their long ears and hopping movement.");
    }
}
