package Interface;

public interface Prey {

    //Interface abstract methods cannot have a body
    void hide(); // by default this method is public and abstract
    String name();
    int age();
    double weight();

    // Interface default methods can have a body and can be overridden or inherited as is by implementing classes
    default void scream() {
        System.out.println("Help!");
    }

    // Interface static methods can have a body and belong to the interface itself, not to instances of the interface
    // Cannot be overridden or inherited by implementing classes
    static void info() {
        System.out.println("Prey are animals that are hunted by other animals for food.");
    }

}
