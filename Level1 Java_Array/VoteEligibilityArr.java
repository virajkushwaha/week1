
// importing the Scanner class for taking the input form the user 
import java.util.Scanner;
// Creating VoteEligibilityArr class for determining the eligibility to vote for each student 
public class VoteEligibilityArr {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		// initializing the array of age size 10 
		int[] ages = new int[10];
		
		//Take user input for the ages of 10 students 
		
		for (int i = 0 ; i<ages.length; i++){
			
			System.out.println("Enter the age Student"+i+": ");
			
			//Storing the value in array 
			
			ages[i] = input.nextInt();
			
			
			
		}
		
		//Checking Eligibility of the student according to age 
		
		for (int i = 0 ; i < ages.length ; i++) {
			
			if (ages[i] <= 0 ) {
				System.out.println("Invalid Age");
			}
			else{
				if (ages[i] >= 18){
					System.out.println("The student with the age "+ ages[i] + " can vote.");
				}
				else{
					System.out.println("The student with the age" + ages[i] + " cannot vote.");
				}
			}
		}
		
		
		
	}
}