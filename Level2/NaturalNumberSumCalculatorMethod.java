import java.util.Scanner;

public class NaturalNumberSumCalculatorMethod {

    public static void main(String[] args) {
        // Creating a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Validating the input to ensure it is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return; // Exit if the input is invalid
        }

        // Calculating the sum using recursion
        int sumByRecursion = calculateSumRecursively(number);

        // Calculating the sum using the formula
        int sumByFormula = calculateSumUsingFormula(number);

        // Displaying the results
        System.out.println("Sum of the first " + number + " natural numbers (using recursion): " + sumByRecursion);
        System.out.println("Sum of the first " + number + " natural numbers (using formula): " + sumByFormula);

        // Validating if both methods yield the same result
        if (sumByRecursion == sumByFormula) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results do not match, something went wrong.");
        }
    }

    /**
     * Method to calculate the sum of the first n natural numbers using recursion.
     * 
     * @param number The natural number up to which the sum is calculated.
     * @return The sum of the first n natural numbers.
     */
    public static int calculateSumRecursively(int number) {
        if (number == 1) {
            return 1; // Base case
        } else {
            return number + calculateSumRecursively(number - 1); // Recursive step
        }
    }

    
    // Method to calculate the sum of the first n natural numbers using the formula.
     
    public static int calculateSumUsingFormula(int number) {
        return number * (number + 1) / 2; // Formula for the sum of first n natural numbers
    }
}
