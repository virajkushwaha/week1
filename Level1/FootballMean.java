
// importing the Scanner class for taking the input form the user 
import java.util.Scanner;
// Creating FootBall class for determining mean of the football team   
public class FootBall {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		
		 
		// initializing the array of age size 11 
		int[] heightValue = new int[11];
		
		//Storing the sum of the height 
		
		int sum = 0 ;
		
		//Storing value of the height   
		
		for (int i = 0 ; i<heightValue.length; i++){
			
			System.out.println("Enter the height of the player"+(i+1)+": ");
			
			//taking the height from user 
			int height = input.nextInt();
			 
			
			heightValue[i] = height;
			
			sum += heightValue[i];			
			
			
		}
		
		//Printing Mean height of the football player 
		
		System.out.println("Mean Height: "+(sum/11));
	}
}