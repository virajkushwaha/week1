// Create a class TotalIncomeCalculator to compute the total income
// importing Scanner class for taking input
import java.util.Scanner;

public class TotalIncomeCalculator {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable for salary and take user input
        System.out.println("Enter your salary (INR):");
        double salary = input.nextDouble();

        // Create a variable for bonus and take user input
        System.out.println("Enter your bonus (INR):");
        double bonus = input.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome + ".");

    }
}
