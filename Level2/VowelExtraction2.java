import java.util.*;

public class VowelExtraction2 {

    // Method to display vowels and consonants in a 2D array
    public static void array2d(String v, String c) {
        String ans[][] = new String[1][2];
        ans[0][0] = v;
        ans[0][1] = c;
        System.out.println("Vowels \t Consonants");
        System.out.println(ans[0][0] + "\t" + ans[0][1]);
    }

    // Method to count vowels, consonants, and modify the string
    public static void string(String s) {
        String vowels = "", conso = "", upper = "";
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                vowels += s.charAt(i);
                v++;
                upper += (Character.isUpperCase(s.charAt(i))) 
                        ? Character.toLowerCase(s.charAt(i)) 
                        : Character.toUpperCase(s.charAt(i));
            } else {
                c++;
                conso += s.charAt(i);
                upper += (Character.isLowerCase(s.charAt(i))) 
                        ? Character.toUpperCase(s.charAt(i)) 
                        : Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println("The vowels in the given string is: " + v + " Consonants: " + c);
        System.out.println("The modified string is: " + upper);
        array2d(vowels, conso);
    }

    // Main function to take input and call string method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s = sc.nextLine();
        string(s);
    }
}
