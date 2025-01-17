import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    // Method to handle array index access and demonstrate the exception
    public static void handleError(String[] names) {
        System.out.println("Attempting to access an index larger than the array length...");

        try {
            // Trying to access an invalid index
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the specific exception
            System.out.println("Error: Array index out of bounds! " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user input
        System.out.println("Enter 2 names:");

        // Define an array to store 2 names
        String[] names = new String[2];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Attempt to trigger ArrayIndexOutOfBoundsException
        handleError(names);

        sc.close();
    }
}
