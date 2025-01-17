import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];

        // Convert angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent of the angle
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);

        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for the angle
        System.out.print("Enter the angle (in degrees): ");
        double angle = scanner.nextDouble();

        // Call the method to calculate the trigonometric functions
        double[] trigonometricResults = calculateTrigonometricFunctions(angle);

        // Print the results
        System.out.printf("\nTrigonometric Functions for %.2f degrees:\n", angle);
        System.out.printf("Sine: %.4f\n", trigonometricResults[0]);
        System.out.printf("Cosine: %.4f\n", trigonometricResults[1]);

        // Handle undefined tangent for angles like 90° or 270°
        if (Double.isInfinite(trigonometricResults[2])) {
            System.out.println("Tangent: Undefined (infinite)");
        } else {
            System.out.printf("Tangent: %.4f\n", trigonometricResults[2]);
        }
    }
}
