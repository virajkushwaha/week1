// Create a class FactorCalculator for finding the factors of a number
// importing Scanner class for taking input
import java.util.Scanner;

public class FactorCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for number and take user input
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Loop through numbers from 1 to number-1 to find factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // Print the factor
                System.out.println(i);
            }
        }

        // Close the scanner
        input.close();
    }
}
