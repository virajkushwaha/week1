import java.util.*;

public class Marks {

    // Method to assign grades based on marks
    public static void grade(int arr[][]) {
        System.out.println("Grade \t \t Remarks \t \t \t \t \t \t   \t \t \tmarks");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] >= 80) {
                System.out.println("A \t above agency normalised standards \t \t \t \t \t80% and above");
            } else if (arr[i][2] > 70 && arr[i][2] < 80) {
                System.out.println("B \t at agency normalised standards \t \t \t \t70% and 79%");
            } else if (arr[i][2] > 60 && arr[i][2] < 70) {
                System.out.println("C \t below but approaching agency normalised standards \t \t \t60% and 69%");
            } else if (arr[i][2] > 50 && arr[i][2] < 60) {
                System.out.println("D \t well below agency normalised standards \t \t \t50% and 59%");
            } else if (arr[i][2] > 40 && arr[i][2] < 50) {
                System.out.println("E \t too below agency normalised standards \t \t \t40% and 49%");
            } else if (arr[i][2] < 40) {
                System.out.println("R \t Remedial needed \t \t \t39% and below");
            }
        }
    }

    // Method to calculate average and percentage, then assign grades
    public static void mathy(int arr[]) {
        int ans[][] = new int[arr.length][3];  // 0-> total marks, 1->average, 2->percentage

        for (int i = 0; i < arr.length; i++) {
            ans[i][0] = arr[i];
            ans[i][1] = arr[i] / 3;  // Calculate average
            ans[i][2] = (arr[i] * 100) / 300;  // Calculate percentage
        }

        grade(ans);  // Call grade method to display grades
    }

    // Method to generate random marks for students
    public static void helper(int n) {
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int m = 10 + (int) (Math.random() * (99 - 10 + 1));
            int p = 10 + (int) (Math.random() * (99 - 10 + 1));
            int c = 10 + (int) (Math.random() * (99 - 10 + 1));
            arr[i] = m + p + c;  // Total marks from 3 subjects
        }

        mathy(arr);  // Call mathy method to calculate average and percentage
    }

    // Main function to take input and execute program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        helper(n);  // Generate marks and assign grades
    }
}
