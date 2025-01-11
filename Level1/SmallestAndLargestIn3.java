import java.util.Scanner;

public class SmallestAndLargestIn3 {

    // Method to find the smallest and largest among three numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        // Array to store the smallest and largest values
        int[] result = new int[2];
        // Variables to store the largest and smallest numbers
        int largest = 0, smallest = 0;

        // Determine the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        // Determine the largest number
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Assign the smallest and largest values to the result array
        result[0] = smallest;
        result[1] = largest;

        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input to enter the numbers
        System.out.print("Enter the number1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the number2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the number3: ");
        int num3 = scanner.nextInt();

        // Create an array to store the smallest and largest numbers
        int[] smallestAndLargest = new int[2];

        // Call the method to find the smallest and largest numbers
        smallestAndLargest = findSmallestAndLargest(num1, num2, num3);

        // Print the result
        System.out.println("The smallest number is: " + smallestAndLargest[0] + " and the largest is: " + smallestAndLargest[1]);
    }
}
