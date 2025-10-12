package Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner = Scanner is used to store user input

        Scanner scanner = new Scanner(System.in);  //Creating Scanner object using Scanner util package

        System.out.print("Enter number of Food Items: ");
        int numberOfFoods = scanner.nextInt(); //User input would be a integer stored in numberOfFood object.

        scanner.nextLine(); // Discards the leftover newline character after nextInt()
        // If this line is omitted, the next nextLine() call will read the leftover '\n' (empty line)

        ArrayList<String> Foods = new ArrayList<>(); //Arraylist to store food items

        for (int i = 1; i <= numberOfFoods; i++) { //loop through no.of items entered at the beginning
            System.out.print("Enter the food you want : ");
            String Food = scanner.nextLine();
            Foods.add(Food); //add the food to the array list of Foods
        }

        scanner.close(); //Scanner is closed here since we don't need scanner anymore

        Collections.sort(Foods); //sort entered food items

        System.out.println("No.of Food Items entered = " + Foods.size()); //Size of the Arraylist

        System.out.println("Food items entered are : ");

        for (String foodItems : Foods) {
            System.out.println(foodItems);
        }
        //advanced for loop to break the Arraylist and display them as Strings
    }
}
