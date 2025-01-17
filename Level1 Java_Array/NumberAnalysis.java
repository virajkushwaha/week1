
// importing the Scanner class for taking the input form the user 
import java.util.Scanner;
// Creating NumberAnalysis class for determining the each condition given in the question
public class NumberAnalysis {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		// initializing the array of number size 5 
		int[] num = new int[5];
		
		//Take user input for the numbers  
		
		for (int i = 0 ; i<num.length; i++){
			int l = 1;
			
			System.out.println("Enter the Number"+l+" : ");
			
			//Storing the value in array 
			
			num[i] = input.nextInt();
			
			l++;
			
		}
		
		//Checking Number details 
		
		for (int i = 0 ; i < num.length ; i++) {
			if (num[i] < 0){
				System.out.println("The number "+ num[i]+" is negative.");
			}
			
			else if (num[i] == 0){
				System.out.println("The number "+ num[i]+" is zero.");
			}
			
			else{
				if (num[i]%2==0){
					System.out.println("The number " + num[i]+ " is even and positive.");
				}
				else{
					System.out.println("The number " + num[i] + " is odd and Positive.");
				}
			}
			
		}
		
		
		
	}
}