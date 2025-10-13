package PizzaStore;

public class Dip extends PizzaStore {
    String dip1 = "Garlic Sauce";
    String dip2 = "Barbecue Sauce";
    String dip3 = "Ranch Sauce";

    @Override
    public void Menu(){
        System.out.println("1. " + dip1);
        System.out.println("2. " + dip2);
        System.out.println("3. " + dip3);
        System.out.println("4. " + gb);
    }

    @Override
    public void select(int choice){
        switch(choice){
            case 1:
                System.out.println("You have selected " + dip1 + "\n" + "Going back to main menu...");
                break;
            case 2:
                System.out.println("You have selected " + dip2 + "\n" + "Going back to main menu...");
                break;
            case 3:
                System.out.println("You have selected " + dip3 + "\n" + "Going back to main menu...");
                break;
            default:
                System.out.println("Invalid choice" + "\n" + "Going back to main menu...");
        }

    }



}
