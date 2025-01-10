
// importing the Scanner class for taking the input form the user 
import java.util.Scanner;
// Creating NumberTable class for determining the table of the given number  
public class NumberTable {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		//taking the number from user 
		 int number = input.nextInt();
		 
		// initializing the array of age size 10 
		int[] tableValue = new int[10];
		
		//Storing value and also printing the table  
		
		for (int i = 0 ; i<tableValue.length; i++){
			
			// initializing the naturalNumber because table starts form 1 
			int naturalNumber = i+1 ;
			
			tableValue[i] = number * naturalNumber;
			
			System.out.println(number+" * "+naturalNumber+" = " +tableValue[i]);
			
			
			
		}
	}
}