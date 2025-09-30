package Interface;

public class Hawk implements Predator {

    // Implementing abstract methods from Predator interface
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting.");
    }

    @Override
    public String name() {
        return "Hawk";
    }

    @Override
    public int age() {
        return 5;
    }

    @Override
    public double weight() {
        return 3.5;
    }

    @Override
    public void roar() {
        System.out.println("The hawk screeches loudly!");
    }

    //@Override // Cannot override static method from interface
    // Static methods belong to the interface itself, not to instances of the interface
    // and cannot be overridden by implementing classes
    public void description() {
        System.out.println("Hawks are birds of prey known for their keen eyesight and hunting skills.");
    }

}
