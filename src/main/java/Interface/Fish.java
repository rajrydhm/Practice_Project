package Interface;

public class Fish implements Predator, Prey {

    // Implementing abstract methods from Predator interface
    @Override
    public void hunt() {
        System.out.println("The fish is hunting smaller fish.");
    }

    @Override
    public String name() {
        return "Fish";
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
    public void roar() {
        System.out.println("The fish makes a bubbling sound!");
    }

    // Implementing abstract methods from Prey interface
    @Override
    public void hide() {
        System.out.println("The fish is hiding among the coral.");
    }

    @Override
    public void scream() {
        System.out.println("The fish flaps its fins frantically!");
    }

    //@Override // Cannot override static method from interface
    // Static methods belong to the interface itself, not to instances of the interface
    // and cannot be overridden by implementing classes
    public void description() { // Providing a new method, not overriding
        System.out.println("Fish can be both predators and prey in the aquatic food chain.");
    }
}
