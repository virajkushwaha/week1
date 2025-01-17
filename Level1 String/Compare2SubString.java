

//import the class Scanner 

import java.util.*;
//Creating class Compare2SubString for comparing two strings 
public class Compare2SubString {
	
	public static void main(String args[]){
		
		//Initiating Scanner class for taking user input 
		
		Scanner input = new Scanner(System.in);
		
		//Taking inputs from the user 
		
		System.out.println("Enter String: ");
		String str1 = input.next();
		
		System.out.println("Enter the starting index: ");
		int start = input.nextInt();
		
		
		System.out.println("Enter the ending index: ");
		int end = input.nextInt();
		
		//Comparing the results from both builtin and charAt() 
		String stringBybuiltIn = str1.substring(start , end);
		
		String stringByMethod = substringByMethod(str1,start,end);
		
		//printing both substring from method as well as builtin 
		
		System.out.println("substring from stringBybuiltIn: "+stringBybuiltIn);
		System.out.println("substring from stringByMethod: "+stringByMethod);
		
		if(stringBybuiltIn.equals(stringByMethod)){
			System.out.println("Substrings are same using both bulitin and using charAt method.");
		}
		else{
			System.out.println("Substring are different.");
		}
		
		
		
	}
	// Creating the stringByMethod method for impleting substring using method  
	public static String substringByMethod(String str1 , int start , int end){
		String sub = "";
		
		for (int i = start ; i < end ; i++ ){
			sub += str1.charAt(i);
		}
	
		return sub;
	}
	
}