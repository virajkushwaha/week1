// Create a class UniversityFeeCalculatorInput for calculating the fees after applying the discount
// importing Scanner class for taking input
import java.util.Scanner;

public class UniversityFeeCalculatorInput{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for fee and take user input
        System.out.println("Enter the total fee:");
        int fee = input.nextInt();

        // Create the variable for discountPercent and take user input
        System.out.println("Enter the discount percentage:");
        int discountPercent = input.nextInt();

        // Create the variable for calculating the discount
        int discount = fee*discountPercent/100;

        // Create the variable for calculating the discounted fee
        int discountFee = fee-discount;

        // Print the discount amount and final discounted fee
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountFee);

        
    }
}
