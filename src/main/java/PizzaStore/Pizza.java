package PizzaStore;

public class Pizza extends PizzaStore {
    String p1 = "Margherita";
    String p2 = "Pepperoni";
    String p3 = "BBQ Chicken";
    String p4 = "Veggie";
    String p5 = "Hawaiian";


    @Override
    public void Menu(){
        System.out.println("1. " + p1);
        System.out.println("2. " + p2);
        System.out.println("3. " + p3);
        System.out.println("4. " + p4);
        System.out.println("5. " + p5);
        System.out.println("6. " + gb);
    }

    @Override
    public String select(int choice){
        switch(choice){
            case 1:
                System.out.println("You have selected " + p1 + "\n" + "Going back to main menu...");
                return p1;
            case 2:
                System.out.println("You have selected " + p2 + "\n" + "Going back to main menu...");
                return p2;
            case 3:
                System.out.println("You have selected " + p3 + "\n" + "Going back to main menu...");
                return p3;
            case 4:
                System.out.println("You have selected " + p4 + "\n" + "Going back to main menu..." ) ;
                return p4;
            case 5:
                System.out.println("You have selected " + p5 + "\n" + "Going back to main menu...");
                return p5;
            default:
                System.out.println("Invalid choice" + "\n" + "Going back to main menu...");
        }

        return null;

    }


}
