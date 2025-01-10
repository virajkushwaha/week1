
// importing the Scanner class for taking the input form the user 
import java.util.Scanner;
// Creating SumOfArray class for determining the sum until zero hit by the user 
public class SumOfArray {
	public static void main(String args[]){
		
		// creating the input object for using scanner class 
		Scanner input = new Scanner(System.in);
		
		// initializing the array of number size 10 
		double[] num = new double[10];
		
		//add counter for determinig the size of the array 
		int count = 0;
		
		//Take user input for the numbers until it hits zero   
		
		
		while (true){
			
				System.out.println("Enter the Element: ");
				
				double element = input.nextDouble();
				if (element <= 0){
					break;
				}
				else{
					if (count != 10){
						num[count] = element;
					}
				}
				
				count++;
		}
		
		//Intializing the sum 
		double sum = 0;
		
		for(int i = 0 ; i < count; i++){
				sum += num[i];
		}
		//Printing the sum
		System.out.println("The Sum of Array Elements: "+sum);
		
		
	}
}