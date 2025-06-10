package ex_02_Java_Programs;
import java.util.Scanner;

public class StringToIntegerConverter {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (digits only): ");
            String userInput = scanner.nextLine();

            try {
                // Convert String to integer
                int number = Integer.parseInt(userInput);
                System.out.println("Converted integer value: " + number);
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter digits only!");
            }
            finally {
                scanner.close();
                System.out.println("Program completed.");
            }





    }
}
