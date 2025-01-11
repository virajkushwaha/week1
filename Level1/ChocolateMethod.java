import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate the chocolates each child gets and the remaining chocolates
    public static int[] calculateChocolatesDistribution(int totalChocolates, int totalChildren) {
        // Calculate chocolates each child gets
        int chocolatesPerChild = totalChocolates / totalChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = totalChocolates % totalChildren;

        // Return the result in an array
        int[] result = new int[2];
        result[0] = chocolatesPerChild;
        result[1] = remainingChocolates;

        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for the total number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int totalChocolates = scanner.nextInt();

        // Take user input for the total number of children
        System.out.print("Enter the number of children: ");
        int totalChildren = scanner.nextInt();

        // Create an array to store the result (chocolates per child and remaining chocolates)
        int[] chocolatesInfo = new int[2];

        // Call the method to calculate the chocolates distribution
        chocolatesInfo = calculateChocolatesDistribution(totalChocolates, totalChildren);

        // Print the result
        System.out.println("The number of chocolates each child gets is: " + chocolatesInfo[0]);
        System.out.println("The number of remaining chocolates is: " + chocolatesInfo[1]);
    }
}
