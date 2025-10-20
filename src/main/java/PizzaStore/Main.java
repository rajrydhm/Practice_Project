package PizzaStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our Pizza Store!");

        PizzaStore store = new PizzaStore();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        ArrayList<String> PizzaOrder = new ArrayList<>();
        ArrayList<String> DrinksOrder = new ArrayList<>();
        ArrayList<String> DipOrder = new ArrayList<>();

        while (running) {
            store.Menu();

            System.out.print("Please select an option from the menu -> ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    store.select(choice);
                    Pizza pizza = new Pizza();
                    pizza.Menu();
                    System.out.print("Please select a pizza -> ");
                    int pizzaChoice = scanner.nextInt();
                    pizza.select(pizzaChoice);
                    PizzaOrder.add(pizza.select(pizzaChoice));
                    break;
                case 2:
                    Drinks drinks = new Drinks();
                    drinks.Menu();
                    System.out.print("Please select a drink -> ");
                    int drinkChoice = scanner.nextInt();
                    drinks.select(choice);
                    DrinksOrder.add(drinks.select(drinkChoice));
                    break;
                case 3:
                    Dip dip = new Dip();
                    dip.Menu();
                    System.out.print("Please select a dip -> ");
                    int dipChoice = scanner.nextInt();
                    dip.select(dipChoice);
                    DipOrder.add(dip.select(dipChoice));
                    break;
                case 4:
                    store.select(choice);
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please restart the program and select a valid option.");
            }
        }

        scanner.close();

        System.out.println("Your Pizza Order: " + PizzaOrder);
        System.out.println("Your Drinks Order: " + DrinksOrder);
        System.out.println("Your Dip Order: " + DipOrder);
    }


}
