import java.util.*;

public class Split3 {

    // Method to find the longest and shortest word
    public static void helper(String[][] ans, String s) {
        String s1 = ""; // Longest word
        String s2 = s;  // Shortest word, initially set to the entire string

        // Loop through each word to compare lengths
        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] != null) {
                String temp = ans[i][0];
                if (s1.length() < temp.length()) {
                    s1 = temp; // Update longest word
                }
                if (s2.length() > temp.length()) {
                    s2 = temp; // Update shortest word
                }
            }
        }
        System.out.println("The longest word is: " + s1 + " Shortest word is: " + s2);
    }

    // Method to split string into words and store each word's length
    public static String[][] conversionArray(String s) {
        String temp = "";
        String ans[][] = new String[s.length() / 2][2]; // Array to store words and their lengths
        int a = 0;

        // Split the string into words
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (s.charAt(i) == ' ' || i == s.length() - 1) {
                ans[a][0] = temp;
                ans[a][1] = String.valueOf(temp.length());
                a++;
                temp = "";
            }
        }

        // Store last word
        ans[a][0] = temp;
        ans[a][1] = String.valueOf(temp.length());
        a++;

        return ans;
    }

    // Method to calculate the string length manually
    public static int len(String s) {
        s += '0'; // Mark the end of the string
        int count = 0;
        int i = 0;

        // Count characters until '0' is encountered
        while (s.charAt(i) != '0') {
            count++;
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take input text from the user
        System.out.println("Enter the text to convert it to words: ");
        String s = sc.nextLine();

        // Convert input string into words and lengths
        String ans[][] = conversionArray(s);

        // Display words and their lengths
        System.out.println("Word  Length");
        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] != null) {
                System.out.printf("%s \t %s \n", ans[i][0], ans[i][1]);
            }
        }

        // Display string length without using built-in method
        System.out.println("The length of the string without the built-in method is " + len(s));

        // Find and display the longest and shortest word
        helper(ans, s);
    }
}
