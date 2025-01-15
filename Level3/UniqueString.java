import java.util.Scanner;

public class UniqueString {

    // Method to find the length of the string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] tempResult = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already added to the result array
            for (int j = 0; j < uniqueCount; j++) {
                if (tempResult[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempResult[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter a string to find unique characters:");
        String input = scanner.nextLine();

        // Find and display unique characters
        char[] uniqueChars = findUniqueCharacters(input);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
