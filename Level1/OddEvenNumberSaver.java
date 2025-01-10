// Import Scanner to read user input
import java.util.Scanner;

// Create OddEvenNumberSaver class to save odd and even numbers into separate arrays
public class OddEvenNumberSaver {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Check if the entered number is a natural number (positive integer)
        if (number <= 0) {
            // If the number is not natural, print an error and exit the program
            System.out.println("Please enter a valid natural number greater than 0.");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers with size = number / 2 + 1
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Create index variables for odd and even arrays and initialize them to zero
        int evenIndex = 0;
        int oddIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // Save the even number into the even array
                evenNumbers[evenIndex] = i;
                evenIndex++; // Increment the even index
            } else {
                // Save the odd number into the odd array
                oddNumbers[oddIndex] = i;
                oddIndex++; // Increment the odd index
            }
        }

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " "); // Print each odd number
        }

        // Print the even numbers array
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " "); // Print each even number
        }

       
    }
}
