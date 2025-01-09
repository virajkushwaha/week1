// Create a class QuotientAndRemainderCalculator for calculating the quotient and remainder
// importing Scanner class for taking input
import java.util.Scanner;

public class QuotientAndRemainderCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for the first number and take user input
        System.out.println("Enter the first number (dividend):");
        int number1 = input.nextInt();

        // Create the variable for the second number and take user input
        System.out.println("Enter the second number (divisor):");
        int number2 = input.nextInt();

        // Calculate the quotient using the division operator (/)
        int quotient = number1 / number2;

        // Calculate the remainder using the modulus operator (%)
        int remainder = number1 % number2;

        // Print the quotient and remainder along with the input numbers
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder 
            + " of two numbers " + number1 + " and " + number2);

    }
}
