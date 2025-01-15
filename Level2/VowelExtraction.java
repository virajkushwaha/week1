import java.util.*;

public class VowelsExtraction {

    // Method to count vowels and consonants and modify the string
    public static void string(String s) {
        int v = 0; // Count of vowels
        int c = 0; // Count of consonants
        String upper = ""; // Modified string to store the result

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a vowel (both uppercase and lowercase)
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || 
                (s.charAt(i) == 'o') || (s.charAt(i) == 'u') || (s.charAt(i) == 'A') || 
                (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O') || 
                (s.charAt(i) == 'U')) {

                v++; // Increment vowel count

                // Convert uppercase vowels to lowercase
                if ((int) s.charAt(i) < 97 && s.charAt(i) != ' ') {
                    int t = (int) s.charAt(i) + 32;
                    upper += (char) (t);
                }

                // Convert lowercase vowels to uppercase
                if ((int) s.charAt(i) >= 97 && s.charAt(i) != ' ') {
                    int t = (int) s.charAt(i) - 32;
                    upper += (char) (t);
                }
            } else {
                c++; // Increment consonant count

                // Convert lowercase consonants to uppercase
                if ((int) s.charAt(i) >= 97 && s.charAt(i) != ' ') {
                    int t = (int) s.charAt(i) - 32;
                    upper += (char) (t);
                }

                // Convert uppercase consonants to lowercase
                if ((int) s.charAt(i) < 97 && s.charAt(i) != ' ') {
                    int t = (int) s.charAt(i) + 32;
                    upper += (char) (t);
                }
            }
        }

        // Print the vowel and consonant counts and the modified string
        System.out.println("The vowels in the given string is: " + v + " Consonants: " + c);
        System.out.println("The modified string is: " + upper);
    }

    // Main function to take input and call the string method
    public static void main(String args[]) {
        System.out.println("Enter the text: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // Read the input string
        string(s); // Call the string method
    }
}
