// Create a class IntOperation for performing integer operations with precedence
// importing Scanner class for taking input
import java.util.Scanner;

public class IntOperation {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables a, b, c of int data type and take user input
        System.out.println("Enter the value of a:");
        int a = input.nextInt();

        System.out.println("Enter the value of b:");
        int b = input.nextInt();

        System.out.println("Enter the value of c:");
        int c = input.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;  // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b;  // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;  // Modulus (%) has higher precedence than addition (+)

        // Print the results of the operations
        System.out.println("The results of Int Operations are:"+result1+","+result2+","+","+result3+" and "+result4);
        

    }
}
