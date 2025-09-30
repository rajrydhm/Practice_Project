package Interface;

public interface Predator {

    //Interface abstract methods cannot have a body
    void hunt(); // by default this method is public and abstract
    String name();
    int age();
    double weight();

    // Interface default methods can have a body and can be overridden or inherited as is by implementing classes
    default void roar() {
        System.out.println("ROAR!");
    }

    // Interface static methods can have a body and belong to the interface itself, not to instances of the interface
    // Cannot be overridden or inherited by implementing classes
    static void description() {
        System.out.println("Predators are animals that hunt other animals for food.");
    }
}
