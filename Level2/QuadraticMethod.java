import java.util.Scanner;

public class QuadraticMethod {

    // Method to calculate the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Check the value of the discriminant to determine the number of real roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[] { root1, root2 };  // Return both roots
        } else if (discriminant == 0) {
            // One real root (repeated root)
            double root = -b / (2 * a);
            return new double[] { root };  // Return the single root
        } else {
            // No real roots (discriminant is negative)
            return new double[0];  // Return an empty array for no real roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the coefficients of the quadratic equation
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();

        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the roots based on the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();  // Close the scanner to release resources
    }
}
