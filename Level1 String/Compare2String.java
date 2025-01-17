//import the class Scanner 

import java.util.*;
//Creating class Compare2String for comparing two strings 
public class Compare2String {
	
	public static void main(String args[]){
		
		//Initiating Scanner class for taking user input 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First String: ");
		String str1 = input.next();
		
		System.out.println("Enter Second String: ");
		String str2 = input.next();
		
		
		//Comparing the results from both builtin and charAt() 
		boolean isEqual = str1.equals(str2);
		
		boolean isEqualByChar = isEqualByChar(str1,str2);
		
		
		if(isEqual == isEqualByChar){
			System.out.println("Results are same using both bulitin and using charAt method.");
		}
		else{
			System.out.println("Results are different.");
		}
		
		
		
	}
	// Creating the isEqualByChar method for implementing comparison using 
	public static boolean isEqualByChar(String str1 , String str2){
		int lengthOfString = str1.length();
		boolean result = true;
		if (lengthOfString != str2.length()){
			result = false ;
		}
		else{
			for (int i = 0 ; i < lengthOfString ; i++ ){
				if (str1.charAt(i) != str2.charAt(i)){
					result = false;
					break;
				}
			}
		}
		return result;
	}
	
}