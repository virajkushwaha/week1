import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill using temperature and wind speed
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        return (35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * (Math.pow(windSpeed, 0.16))));
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Take user input for wind speed
        System.out.print("Enter the wind speed: ");
        double windSpeed = scanner.nextDouble();

        // Call the method to calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Print the wind chill result
        System.out.println("The wind chill temperature is: " + windChill);
    }
}
