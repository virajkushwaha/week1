// Create a class DistributingPen for calculating  the remainingPens and pens per person

public class DistributingPen{
	
	public static void main(String args[]){
		
		//Create the variable for noOFPens
		int noOFPens = 14;
		
		//Create the variable for noOfStudents
		int noOfStudents = 3;
		
		//Create the variable for remainingPens
		int remainingPens = noOFPens % noOfStudents;
		
		//Create the variable for pensPerPerson
		int pensPerPerson = noOFPens / noOfStudents;
		
		
		
		
		//Print the remaining pen and pen per person
		System.out.println(" The Pen Per Student is "+ pensPerPerson+" and the remaining pen not distributed is "+ remainingPens);
		
		
	}
}