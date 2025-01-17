import java.util.*;

public class Split2 {

    // Method to split the string into words and store each word with its length
    public static String[][] conversionArray(String s) {
        String temp = "";
        String ans[][] = new String[s.length() / 2][2];
        int a = 0;

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

        ans[a][0] = temp;
        ans[a][1] = String.valueOf(temp.length());
        a++;
        temp = "";

        return ans;
    }

    // Method to calculate the length of a string manually
    public static int len(String s) {
        s += '0';
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

        System.out.println("Enter the text to convert it to words: ");
        String s = sc.nextLine();

        String ans[][] = conversionArray(s);
        System.out.println("Word  Length");

        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] != null) {
                System.out.printf("%s \t %s \n", ans[i][0], ans[i][1]);
            }
        }

        System.out.println("The length of the string without the built-in method is " + len(s));
    }
}
