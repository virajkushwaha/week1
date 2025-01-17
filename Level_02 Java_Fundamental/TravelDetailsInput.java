// Create a class TravelDetailsInput to take user inputs and print travel details
// importing Scanner class for taking input
import java.util.Scanner;

public class TravelDetailsInput {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for traveler details
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter the city you are traveling from:");
        String fromCity = input.nextLine();

        System.out.println("Enter the city you are traveling via:");
        String viaCity = input.nextLine();

        System.out.println("Enter the city you are traveling to:");
        String toCity = input.nextLine();

        // Taking user input for distances
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " (in miles):");
        double fromToVia = input.nextDouble();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " (in miles):");
        double viaToFinalCity = input.nextDouble();

        // Taking user input for travel time
        System.out.println("Enter the time taken for the journey from " + fromCity + " to " + viaCity + " (in hours):");
        double timeFromToVia = input.nextDouble();

        System.out.println("Enter the time taken for the journey from " + viaCity + " to " + toCity + " (in hours):");
        double timeViaToFinalCity = input.nextDouble();

        // Calculate total distance and time
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the result
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " hours");


    }
}
