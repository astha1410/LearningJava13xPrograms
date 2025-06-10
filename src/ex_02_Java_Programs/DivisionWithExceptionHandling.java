package ex_02_Java_Programs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (dividend): ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number (divisor): ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Division result: " + result);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only!");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }


            System.out.println("Program execution completed.");

    }
}
