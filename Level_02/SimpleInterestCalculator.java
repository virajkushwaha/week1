// Create a class SimpleInterestCalculator to calculate Simple Interest
// importing Scanner class for taking input
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user inputs for Principal, Rate, and Time
        System.out.println("Enter the Principal amount:");
        double principal = input.nextDouble();

        System.out.println("Enter the Rate of Interest (in percentage):");
        double rate = input.nextDouble();

        System.out.println("Enter the Time (in years):");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the results
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time + ".");

    }
}
