// Create a class TotalPriceCalculator for calculating the total purchase price
// importing Scanner class for taking input
import java.util.Scanner;

public class TotalPriceCalculator{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create the variable for unit price and take user input
        System.out.println("Enter the unit price of the item :");
        double unitPrice = input.nextDouble();

        // Create the variable for quantity and take user input
        System.out.println("Enter the quantity to be bought:");
        int quantity = input.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice*quantity;

        // Print the total price, unit price, and quantity
        System.out.println("The total purchase price is INR " + totalPrice 
            + " if the quantity "+quantity+" and unit price is INR "+unitPrice);

        
    }
}
