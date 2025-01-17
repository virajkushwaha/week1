// Create a class UniversityFeeCalculator for calculating  the fees after applying the discount

public class UniversityFeeCalculator{
	
	public static void main(String args[]){
		
		//Create the variable for fee 
		int fee = 125000;
		
		//Create the variable for discountPercent
		int discountPercent = 10;
		
		//Create the variable for calculating the  dicount
		int discount = fee*discountPercent/100;
		
		//Create the variable for calculating the  dicountFee 
		int discountFee = fee - discount ;
		
		
		
		
		//Print the remaining pen and pen per person
		System.out.println(" The discount amount is INR " + discount + " and final discounted fee is INR "+discountFee);
		
		
	}
}