import java.util.*;

public class LengthWithoutBuiltIn {

    // Calculating the length of the string without using length() method
    public static int len(String s) {
        int count = 0;
        int i = 0;

        while (i >= 0) {
            try {
                s.charAt(i); // Access character at position i
                count++;     // Increment count for each valid character
                i++;
            } catch (Exception e) {
                return count; // Return the count when an exception occurs
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the text to convert it to words: ");
        String s = sc.nextLine();

        // Calculate the string length using the custom function
        System.out.println("The length of the string without using built-in method is: " + len(s));
    }
}
