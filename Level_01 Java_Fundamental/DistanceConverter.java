// Create a class DistanceConverter for converting the distance into kilometers to miles
import java.util.Scanner;
public class DistanceConverter {

    public static void main(String args[]) {

        // Create a variable for kilometers
        double km;

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for kilometers
        System.out.println("Enter the distance in kilometers:");
        km = input.nextDouble();

        // Create the variable for miles
        double miles = km / 1.6;

        // Print the miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

    }
}
