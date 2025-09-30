package Interface;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Hawk and Rabbit
        Predator hawk = new Hawk();
        Prey rabbit = new Rabbit();

        // Demonstrating Predator methods
        System.out.println("Predator Details:");
        System.out.println("Name: " + hawk.name());
        System.out.println("Age: " + hawk.age() + " years");
        System.out.println("Weight: " + hawk.weight() + " kg");
        hawk.hunt();
        hawk.roar(); // Calling default method from Predator interface
        Predator.description(); // Calling static method from Predator interface

        System.out.println();

        // Demonstrating Prey methods
        System.out.println("Prey Details:");
        System.out.println("Name: " + rabbit.name());
        System.out.println("Age: " + rabbit.age() + " years");
        System.out.println("Weight: " + rabbit.weight() + " kg");
        rabbit.hide();
        rabbit.scream(); // Calling default method from Prey interface
        Prey.info(); // Calling static method from Prey interface

        Fish fish = new Fish();
        System.out.println();
        System.out.println("Fish Details:");
        System.out.println("Name: " + fish.name());
        System.out.println("Age: " + fish.age() + " years");
        System.out.println("Weight: " + fish.weight() + " kg");
        fish.hunt();
        fish.hide();
        fish.roar(); // Calling default method from Predator interface
        fish.scream(); // Calling default method from Prey interface
        fish.description();


    }
}
