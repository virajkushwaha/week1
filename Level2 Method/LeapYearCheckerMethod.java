// Import Scanner class to take user input
import java.util.Scanner;

// Define the LeapYearChecker class
public class LeapYearCheckerMethod {

    // Method to determine if a given year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is valid for leap year determination (year >= 1582)
        if (year >= 1582) {
            // A leap year is divisible by 4 but not by 100, unless also divisible by 400
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            // Return false for years before 1582
            return false;
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year (1582 or later): ");
        int inputYear = scanner.nextInt();

        // Check if the year is valid for leap year determination
        if (inputYear < 1582) {
            System.out.println("Leap year determination is only valid for years from 1582 onward.");
        } else {
            // Call isLeapYear method to determine if the year is a leap year
            boolean isLeap = isLeapYear(inputYear);

            // Display the result
            if (isLeap) {
                System.out.println(inputYear + " is a Leap Year.");
            } else {
                System.out.println(inputYear + " is not a Leap Year.");
            }
        }
    }
}
