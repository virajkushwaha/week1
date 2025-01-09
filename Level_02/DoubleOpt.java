// Create a class DoubleOpt for performing double operations with precedence
// importing Scanner class for taking input
import java.util.Scanner;

public class DoubleOpt {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables a, b, c of double data type and take user input
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c:");
        double c = input.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;  // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b;  // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;  // Modulus (%) has higher precedence than addition (+)

        // Print the results of the operations
        System.out.println("The results of Int Operations are:"+result1+","+result2+","+","+result3+" and "+result4);

      
    }
}
