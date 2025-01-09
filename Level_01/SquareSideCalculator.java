// Create a class SquareSideCalculator for finding the side of a square
// importing Scanner class for taking input
import java.util.Scanner;

public class SquareSideCalculator{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for perimeter and take user input
        System.out.println("Enter the perimeter of the square:");
        int perimeter = input.nextInt();

        // Calculate the side of the square using the formula side = perimeter / 4
        int side = perimeter/4;

        // Print the side of the square and its perimeter
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);

        
    }
}
