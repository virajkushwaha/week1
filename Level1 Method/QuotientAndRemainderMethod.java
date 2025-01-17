import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        // Array to return the quotient and remainder
        int[] result = new int[2];

        // Calculating quotient and remainder
        result[0] = dividend / divisor;
        result[1] = dividend % divisor;

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input to enter the dividend
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        // Take user input to enter the divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Create an array to store the quotient and remainder
        int[] quotientAndRemainder = new int[2];

        // Call the method to calculate quotient and remainder
        quotientAndRemainder = calculateQuotientAndRemainder(dividend, divisor);

        // Print the result
        System.out.println("The quotient is: " + quotientAndRemainder[0] + " and the remainder is: " + quotientAndRemainder[1]);
    }
}
