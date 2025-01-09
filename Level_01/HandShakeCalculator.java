// Create a class HandshakeCalculator for calculating the maximum number of handshakes
// importing Scanner class for taking input
import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for the number of students and take user input
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents 
            + " students is " + maxHandshakes);

    }
}
