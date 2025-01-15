//Import Scanner to take user inputs 
import java.util.Scanner;

//Creating the StringIndexOutOfBound to demonstrate the null pointer exception 
public class StringIndexOutOfBound{

	public static void demostrateException(String str){
		// Generate a StringIndexOutOfBound
        try {
            System.out.println("The index of the string is: " + getIndex(str));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error:Enter the valid index in the range " + e.getMessage());
        }
		
	}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
		String str = input.next(); // A string variable is declared but not initialized
        
		demostrateException(str); 
    }

    // Method to get the length of a string
    public static int getIndex(String str){
        // This will throw NullPointerException if str is null
		int index = 84654;
        return str.charAt(index);
    }
}