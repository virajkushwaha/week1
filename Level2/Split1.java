import java.util.*;

public class Split1 {

    // Helper function to split the string into words without using split()
    public static String[] helper(String s) {
        int spaces = 0;

        // Count the number of spaces to determine the size of the array
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spaces++;
        }

        String t[] = new String[spaces + 1];
        int j = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                t[j] = temp;
                temp = "";
                j++;
            }
        }

        // Add the last word to the array
        t[j] = temp;

        return t;
    }

    // Calculate the length of the string without using length() method
    public static int len(String s) {
        s += '0'; // Append '0' to mark the end of the string
        int count = 0;
        int i = 0;

        while (s.charAt(i) != '0') {
            count++;
            i++;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the text to convert it to words: ");
        String s = sc.nextLine();

        // Calculate and display string length using custom method
        System.out.println("The length of the string without using built-in method is: " + len(s));

        // Split the string into words using the custom helper function
        String ans[] = helper(s);

        // Validate the custom split method with the built-in split() method
        boolean isEqual = true;
        String sp[] = s.split("[\\s]");

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != null && sp[i] != null) {
                if (!sp[i].equals(ans[i])) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("Are the two String arrays equal?: " + isEqual);
    }
}
