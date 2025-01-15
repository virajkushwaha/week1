// Import the class Scanner
import java.util.*;
// Import Arrays for array comparison
import java.util.Arrays;

// Creating class Compare2charArray for comparing two strings
public class Compare2charArray {

    public static void main(String[] args) {

        // Initiating Scanner class for taking user input
        Scanner input = new Scanner(System.in);

        // Taking inputs from the user
        System.out.println("Enter String: ");
        String str1 = input.next();

        // Converting string to char array using built-in method
        char[] arrayBybuiltIn = str1.toCharArray();

        // Converting string to char array using custom method
        char[] arrayByMethod = arrayByMethod(str1);

        // Printing both arrays for comparison
        System.out.println("Array using built-in method: " + Arrays.toString(arrayBybuiltIn));
        System.out.println("Array using charAt() method: " + Arrays.toString(arrayByMethod));

        // Comparing arrays
        if (Arrays.equals(arrayBybuiltIn, arrayByMethod)) {
            System.out.println("Arrays are the same using both built-in and charAt method.");
        } else {
            System.out.println("Arrays are different.");
        }
    }

    // Creating the arrayByMethod method for implementing conversion using charAt()
    public static char[] arrayByMethod(String str1) {
        char[] array = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            array[i] = str1.charAt(i);
        }

        return array;
    }
}
