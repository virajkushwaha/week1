// Create a class TemperatureConversion for converting Celsius to Fahrenheit
// importing Scanner class for taking input
import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable for Celsius and take user input
        System.out.println("Enter the temperature in Celsius:");
        double celsius = input.nextDouble();

        // Perform the conversion from Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    }
}
