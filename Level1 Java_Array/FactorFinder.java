// Import Scanner to read user input
import java.util.Scanner;

// Create FactorFinder class to find factors and store them in an array
public class FactorFinder {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number to find the factors
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Create an integer variable maxFactor and initialize it to 10
        int maxFactor = 10;

        // Create a factors array with size maxFactor
        int[] factors = new int[maxFactor];

        // Create an index variable to reflect the index of the array and initialize it to 0
        int index = 0;

        // Loop through numbers from 1 to the entered number to find the factors
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by i (i is a factor)
            if (number % i == 0) {
                // If index reaches maxFactor, resize the factors array
                if (index == maxFactor) {
                    // Double the size of the maxFactor to store more elements
                    maxFactor *= 2;

                    // Create a temporary array to store the current factors
                    int[] temp = new int[maxFactor];

                    // Copy the elements from the factors array to the temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign the factors array to the temp array
                    factors = temp;
                }

                // Add the factor to the factors array and increment the index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " "); // Print each factor
        }

       
    }
}
