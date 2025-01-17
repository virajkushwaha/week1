// Create a class WeightConverter to convert weight from pounds to kilograms
// importing Scanner class for taking input
import java.util.Scanner;

public class WeightConverter {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for weight in pounds
        System.out.println("Enter the weight in pounds:");
        double weightInPounds = input.nextDouble();

        // Convert weight to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms + ".");

       
    }
}
