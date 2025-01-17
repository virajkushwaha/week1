import java.util.*;

// Class to perform various text operations
public class TextToLower {

    // Helper function to convert each character to lowercase
    public static String convertLower(String s) {
        String temp = s;

        for (int i = 0; i < s.length(); i++) {
            int t = temp.charAt(i);

            if (t >= 97) {
                int r = t - 32;
                temp = temp.replace((char) t, (char) r);
            }
        }

        System.out.println("Changed lower case to Uppercase: " + temp);

        return temp;
    }

    // Function to compare two strings for equality
    public static boolean compare(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) return false;
        }

        return true;
    }

    // Method to store words and their lengths in a 2D array
    public static String[][] conversionArray(String s) {
        String temp = "";
        String ans[][] = new String[s.length() / 2][2];
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                ans[a][0] = temp;
                ans[a][1] = String.valueOf(temp.length());
                a++;
                temp = "";
            }
        }

        ans[a][0] = temp;
        ans[a][1] = String.valueOf(temp.length());

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String s = sc.nextLine();

        String temp = convertLower(s);

        System.out.println("Enter the 1st string to compare: ");
        String t1 = sc.nextLine();
        System.out.println("Enter the 2nd string to compare: ");
        String t2 = sc.nextLine();

        System.out.println("Are the two strings equal?: " + compare(t1, t2));

        String ans[][] = conversionArray(s);

        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] != null) {
                System.out.println("Word is: " + ans[i][0] + " Length is: " + ans[i][1]);
            }
        }
    }
}
