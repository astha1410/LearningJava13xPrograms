package ex_02_Java_Programs;

public class Finally_Block {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            // This block always executes
            System.out.println("Finally block executed - cleanup done");
        }
    }

    // Method that throws ArithmeticException
    public static int divide(int a, int b) {
        return a / b;
    }
}