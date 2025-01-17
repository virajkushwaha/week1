import java.util.*;

public class Vote {

    // Method to determine voting eligibility based on age
    public static void vote(int arr[]) {
        String ans[][] = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            ans[i][0] = String.valueOf(arr[i]);
            if (arr[i] >= 18) {
                ans[i][1] = "Vote";
            } else if (arr[i] <= 0) {
                ans[i][1] = "invalid age";
            } else {
                ans[i][1] = "can't vote";
            }
        }

        // Displaying results
        System.out.println("Age \t Vote Status");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i][0] + "\t  " + ans[i][1]);
        }
    }

    // Helper method to generate random ages for students
    public static void helper(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 10 + (int) (Math.random() * (99 - 10 + 1));  // Generate random age between 10 and 99
        }

        // Call the vote method with the generated ages
        vote(arr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages and determine voting eligibility
        helper(n);
    }
}
