// Create a class DistanceConverterFeetToYardAndMiles for converting distance from feet to yards and miles
// importing Scanner class for taking input
import java.util.Scanner;

public class DistanceConverterFeetToYardAndMiles{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for distance in feet and take user input
        System.out.println("Enter the distance in feet:");
        double distanceInFeet = input.nextDouble();

        // Convert the distance to yards using the formula 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance to miles using the formula 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760;

        // Print the distance in yards and miles
        System.out.println("The distance in yards is "+distanceInYards+" and in miles is "+distanceInMiles);

    }
}
