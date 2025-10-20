package PizzaStore;

public class PizzaStore {
    String storeName = "Pizza Place";
    String m1 = "Pizza";
    String m2 = "Drinks";
    String m3 = "Dip";
    String gb = "Go back to main menu";
    String exit = "Exit";


    public void Menu(){
        System.out.println("1. " + m1);
        System.out.println("2. " + m2);
        System.out.println("3. " + m3);
        System.out.println("4. " + exit);
    }

    public String select(int choice){
        switch(choice){
            case 1:
                System.out.println("You have selected " + m1 + "\n" + "Going to Pizza menu...");
                return m1;
            case 2:
                System.out.println("You have selected " + m2 + "\n" + "Going to Drinks menu...");
                return m2;
            case 3:
                System.out.println("You have selected " + m3 + "\n" + "Going to Dip menu...");
                return m3;
            case 4:
                System.out.println("Thank you for visiting " + storeName + ". Goodbye!");
                return exit;
            default:
                System.out.println("Invalid choice. Please restart the program and select a valid option.");
        }
        return null;
    }


}
