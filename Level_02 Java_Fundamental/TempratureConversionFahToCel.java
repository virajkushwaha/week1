// Create a class TemperatureConversion for converting Fahrenheit to Celsius
// importing Scanner class for taking input
import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable for Fahrenheit and take user input
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble();

        // Perform the conversion from Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
