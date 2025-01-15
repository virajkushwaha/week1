import java.util.*;

public class TextToUpper {

    // Convert lowercase characters to uppercase
    public static String convertUpper(String s) {
        String temp = s;
        for (int i = 0; i < s.length(); i++) {
            int t = temp.charAt(i);
            if (t >= 97) {
                int r = t - 32;
                temp = temp.replace((char) t, (char) r);
            }
        }
        return temp;
    }

    // Compare two strings for equality
    public static boolean compare(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the complex text: ");
        String s = sc.nextLine();

        // Convert text to uppercase
        String t = convertUpper(s);
        System.out.println("The converted text is: " + t);

        // Check if original and converted text are equal
        System.out.println("The converted text is equal?: " + compare(s, t));

        // Convert text to lowercase using built-in method
        String temp = t.toLowerCase();
        System.out.println("The converted text using toLowerCase() method is: " + temp);
    }
}