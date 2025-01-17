// Import Scanner class
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void handleException(String input) {
        try {
            System.out.println("Creating IllegalArgumentException...");
            if (input.length() < 5) {
                throw new IllegalArgumentException("Input string is too short to extract substring.");
            }
            String result = input.substring(5, 2); // Start index > end index triggers StringIndexOutOfBoundsException
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Here we got an IllegalArgumentException: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Here we got a StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Here we got a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a string: ");
        String userInput = sc.nextLine();

        // Handling exception
        handleException(userInput);

        sc.close();
    }
}
