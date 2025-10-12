package FileReaderWriter;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\Java\\output.txt";
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            System.out.println("Enter text to write to the file:");

            while(true) {
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                fileWriter.write(userInput + "\n");
            }
            System.out.println("Successfully wrote to the file.");
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        scanner.close();

        System.out.println("-----------------------------");
        System.out.println("Here's whats been written to the file");

       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

           String line;
           while ((line= reader.readLine())!=null){
               System.out.println(line);
           }

       }

        catch(IOException e){
            System.out.println("Something went wrong. File has been not found" + e.getMessage());
        }
    }

}
