import java.util.*;

public class TrailSpaces {

    // Method to toggle the case of characters and manage spaces
    public static void helper(String s) {
        StringBuilder t = new StringBuilder(); // StringBuilder for efficient string modification

        for (int i = 0; i < s.length(); i++) {  // Loop through each character
            char c = s.charAt(i);
            if (c != ' ') {  // If it's not a space, toggle the case
                if (Character.isUpperCase(c)) {
                    t.append(Character.toLowerCase(c));
                } else {
                    t.append(Character.toUpperCase(c));
                }
            } else if (i < s.length() - 1 && s.charAt(i + 1) != ' ') {  // Handle space logic
                t.append(c);
            }
        }

        // Print the modified string
        System.out.println("The modified string is: " + t);
    }

    // Main method to take user input and process it
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s = sc.nextLine();

        // Call the helper method to toggle the case
        helper(s);
    }
}
