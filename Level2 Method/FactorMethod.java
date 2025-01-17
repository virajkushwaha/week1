import java.util.Scanner;

public class FactorAnalysis {

    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding factors of the number and storing them in an array
        int[] factors = calculateFactors(number);

        // Finding and displaying the sum of the factors
        int factorSum = calculateFactorSum(factors);
        System.out.println("Sum of factors: " + factorSum);

        // Finding and displaying the sum of squares of the factors
        double factorSumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + factorSumOfSquares);

        // Finding and displaying the product of the factors
        long factorProduct = calculateFactorProduct(factors);
        System.out.println("Product of factors: " + factorProduct);
    }

    // Method to calculate factors of a number and store them in an array
    public static int[] calculateFactors(int number) {
        // Counting the number of factors
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }

        // Storing the factors in an array
        int[] factors = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate the sum of the factors
    public static int calculateFactorSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the sum of squares of the factors
    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to calculate the product of the factors
    public static long calculateFactorProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
