import java.util.Scanner;

public class FriendsMethod {

    // Method to determine the youngest friend based on their ages
    public static String getYoungestFriend(int[] ages) {
        int minAge = ages[0]; // Initialize minimum age with the first friend's age
        String youngest = "Amar"; // Default youngest is Amar
        
        // Iterate through ages to find the minimum age
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i]; // Update minimum age
                // Update youngest friend's name based on the index
                if (i == 1) youngest = "Akbar";
                else if (i == 2) youngest = "Anthony";
            }
        }
        return youngest;
    }

    // Method to determine the tallest friend based on their heights
    public static String getTallestFriend(double[] heights) {
        double maxHeight = heights[0]; // Initialize maximum height with the first friend's height
        String tallest = "Amar"; // Default tallest is Amar
        
        // Iterate through heights to find the maximum height
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i]; // Update maximum height
                // Update tallest friend's name based on the index
                if (i == 1) tallest = "Akbar";
                else if (i == 2) tallest = "Anthony";
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the 3 friends
        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        // Collect user input for the ages and heights of the friends
        System.out.println("Enter the ages and heights for Amar, Akbar, and Anthony:");

        // Input ages
        System.out.print("Amar's age: ");
        friendAges[0] = scanner.nextInt();
        System.out.print("Akbar's age: ");
        friendAges[1] = scanner.nextInt();
        System.out.print("Anthony's age: ");
        friendAges[2] = scanner.nextInt();

        // Input heights
        System.out.print("Amar's height (in cm): ");
        friendHeights[0] = scanner.nextDouble();
        System.out.print("Akbar's height (in cm): ");
        friendHeights[1] = scanner.nextDouble();
        System.out.print("Anthony's height (in cm): ");
        friendHeights[2] = scanner.nextDouble();

        // Determine the youngest and tallest friends
        String youngestFriend = getYoungestFriend(friendAges);
        String tallestFriend = getTallestFriend(friendHeights);

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close(); // Close the scanner to release resources
    }
}
