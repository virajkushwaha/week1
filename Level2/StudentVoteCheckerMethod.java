import java.util.Scanner;

public class StudentVoteCheckerMethod {

    // Method to check if a student can vote based on their age
    public boolean isEligibleToVote(int age) {
        // Return false if the age is invalid (negative)
        if (age < 0) {
            return false;
        }
        // Return true if age is 18 or above, otherwise false
        return age >= 18;
    }

    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create instance of StudentVoteChecker

        // Loop to get age inputs for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt(); // Read the age of the student

            // Check if the student is eligible to vote
            if (voteChecker.isEligibleToVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
