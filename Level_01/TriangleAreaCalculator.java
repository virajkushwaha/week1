// Create a class TriangleAreaCalculator for calculating the area of a triangle
// importing Scanner class for taking input
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for base and take user input
        System.out.println("Enter the base of the triangle in centimeters:");
        double base = input.nextDouble();

        // Create the variable for height and take user input
        System.out.println("Enter the height of the triangle in centimeters:");
        double height = input.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaCm = 0.5*base*height;

        // Convert the area to square inches 
        double areaInches = areaCm/(2.54*2.54);

        // Print the area of the triangle in square centimeters and square inches
        System.out.println("The area of the triangle is "+areaCm+" square centimeters and "+areaInches+" square inches.");

        // Close the Scanner object
        input.close();
    }
}
