package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input once

        while (true) {
            try {
                System.out.print("Enter the number to divide 100 by: ");
                double number = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Result: " + (100 / number));
                break; //exit the loop if no exception

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero. Please enter a non-zero number.");
            }
        }
        scanner.close();  // Close the scanner
    }

}