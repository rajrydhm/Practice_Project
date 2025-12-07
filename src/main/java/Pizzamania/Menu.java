package Pizzamania;

import java.util.ArrayList;

public class Menu {
    private final ArrayList<Pizza> pizzas;
    private final ArrayList<Drinks> drinks;
    private final ArrayList<Dip> dip;
    private final String[] menuOptions;

    public Menu() {
        pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Margherita", 8.99));
        pizzas.add(new Pizza("Pepperoni", 9.99));
        pizzas.add(new Pizza("Hawaiian", 10.99));
        pizzas.add(new Pizza("Veggie", 9.49));

        drinks = new ArrayList<>();
        drinks.add(new Drinks("Coke", 1.99));
        drinks.add(new Drinks("Sprite", 1.99));
        drinks.add(new Drinks("Water", 0.99));

        dip = new ArrayList<>();
        dip.add(new Dip("Garlic Sauce", 0.99));
        dip.add(new Dip("Barbecue Sauce", 0.99));
        dip.add(new Dip("Ranch Sauce", 0.99));

        menuOptions = new String[] { "Pizza", "Drinks", "Dip", "Exit" };
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public ArrayList<Drinks> getDrinks() {
        return drinks;
    }

    public ArrayList<Dip> getDip() {
        return dip;
    }

    public void displayMenu() {
        System.out.println("Main Menu");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }
        System.out.print("Please select an option from the menu to order -> ");
    }
}
