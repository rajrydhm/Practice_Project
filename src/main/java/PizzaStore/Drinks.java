package PizzaStore;

public class Drinks extends PizzaStore {
    String d1 = "Coke";
    String d2 = "Pepsi";
    String d3 = "Sprite";

    @Override
    public void Menu(){
        System.out.println("1. " + d1);
        System.out.println("2. " + d2);
        System.out.println("3. " + d3);
        System.out.println("4. " + gb);
    }

    @Override
    public void select(int choice){
        switch(choice){
            case 1:
                System.out.println("You have selected " + d1 + "\n" + "Going back to main menu...");
                break;
            case 2:
                System.out.println("You have selected " + d2 + "\n" + "Going back to main menu...");
                break;
            case 3:
                System.out.println("You have selected " + d3 + "\n" + "Going back to main menu...");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}
