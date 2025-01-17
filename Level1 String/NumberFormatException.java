import java.util.Scanner;

public class NumberFormatExceptionDemo { // Renamed the class to avoid conflict with built-in exception

    // Method to demonstrate NumberFormatException
    public static int generate(String s) {
        int k = 0; // Initialize k to 0

        try {
            // Attempt to parse the string into an integer
            k = Integer.parseInt(s);
            System.out.println("The integer value is: " + k);
        } catch (NumberFormatException e) {
            // Catch and handle NumberFormatException
            System.out.println("Here is a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch and handle other runtime exceptions
            System.out.println("Here is another RuntimeException: " + e.getMessage());
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println();

        // Call the generate method
        generate(input);

        sc.close(); // Close the scanner
    }
}
