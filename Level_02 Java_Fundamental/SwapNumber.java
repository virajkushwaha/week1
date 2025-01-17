// Create a class SwapNumbers to swap two numbers
// importing Scanner class for taking input
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable number1 and take user input
        System.out.println("Enter the first number (number1):");
        int number1 = input.nextInt();

        // Create a variable number2 and take user input
        System.out.println("Enter the second number (number2):");
        int number2 = input.nextInt();

        // Print the numbers before swapping
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);

       
    }
}
