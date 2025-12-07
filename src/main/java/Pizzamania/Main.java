package Pizzamania;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Pizzamania!");
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<String> PizzaOrder = new ArrayList<>();
        ArrayList<String> DrinksOrder = new ArrayList<>();
        ArrayList<String> DipOrder = new ArrayList<>();
        boolean isOrdering = true;

        while (isOrdering) {
            menu.displayMenu();
            int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (Pizza pizza : menu.getPizzas()) {
                    System.out.printf(pizza.getName() + ": " + "$" + pizza.getPrice() + "\n");
                }
                    System.out.print("Please select your choice of pizza -> ");
                    int pizzaChoice = scanner.nextInt();
                    Pizza pizza = menu.getPizzas().get(pizzaChoice - 1);
                    System.out.println(" You have selected " + pizza.getName() + ": $"+ pizza.getPrice() + "\n" + "Going back to main menu...");
                    PizzaOrder.add(pizza.getName());
                    break;
            case 2:
                for (Drinks drink : menu.getDrinks()) {
                    System.out.printf(drink.getName() + ": " + "$" + drink.getPrice() + "\n");
                }
                System.out.print("Please select your choice of drink -> ");
                int drinkChoice = scanner.nextInt();
                Drinks drink = menu.getDrinks().get(drinkChoice - 1);
                System.out.println(" You have selected " + drink.getName() + ": $"+ drink.getPrice() + "\n" + "Going back to main menu...");
                DrinksOrder.add(drink.getName());
                break;
            case 3:
                for (Dip dip : menu.getDip()) {
                    System.out.printf(dip.getName() + ": " + "$" + dip.getPrice() + "\n");
                }
                System.out.print("Please select your choice of dip -> ");
                int dipChoice = scanner.nextInt();
                Dip dip = menu.getDip().get(dipChoice - 1);
                System.out.println(" You have selected " + dip.getName() + ": $"+ dip.getPrice() + "\n" + "Going back to main menu...");
                DipOrder.add(dip.getName());
                break;
            case 4:
                System.out.println("Thank you for visiting Pizzamania! Goodbye!");
                isOrdering = false;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
        
    }

    scanner.close();
    System.out.println("Your Pizza Order: " + PizzaOrder);
    System.out.println("Your Drinks Order: " + DrinksOrder);
    System.out.println("Your Dip Order: " + DipOrder);
    
}
}
