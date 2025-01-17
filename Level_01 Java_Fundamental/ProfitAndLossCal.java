// Create a class ProfitAndLossCal for calculating  the profit and loss based on cost price

public class ProfitAndLossCal{
	
	public static void main(String args[]){
		
		//Create the variable for costPrice
		int costPrice = 129;
		
		//Create the variable for sellingPrice
		int sellingPrice = 191;
		
		//Create the variable for profit
		float profit = sellingPrice - costPrice;
		
		//Create the variable for profitPercentage
		float profitPercentage = (float)(profit/costPrice)*100.0f;
		
		
		
		
		//Print the profit and loss detail along with the profit and profitPercentage
		System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR "+sellingPrice +"\nThe Profit is INR "+profit+" and the Profit Percentage is "+ profitPercentage);
		
		
	}
}