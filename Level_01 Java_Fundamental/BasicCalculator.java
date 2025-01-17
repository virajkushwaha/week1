// Create a class BasicCalculator for performing arithmetic operations
// importing Scanner class for taking input
import java.util.Scanner;

public class BasicCalculator{

    public static void main(String args[]){

        //Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Create the variable for number1 and take user input
        System.out.println("Enter the first number:");
        float number1 = input.nextFloat();

        //Create the variable for number2 and take user input
        System.out.println("Enter the second number:");
        float number2 = input.nextFloat();

        //Perform addition and store the result
        float addition = number1+number2;

        //Perform subtraction and store the result
        float subtraction = number1-number2;

        //Perform multiplication and store the result
        float multiplication = number1*number2;

        //Perform division and store the result
        float division = number1/number2;

        //Print the results of all operations
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+", " + subtraction + ", " + multiplication + ", and " + division);

    }
}
