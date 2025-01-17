// Create a class VolumeOfEarth for calculating  the fees after applying the discount

public class VolumeOfEarth{
	
	public static void main(String args[]){
		
		//Create the variable for radius of earth  
		float earthRadius = 6378f;
		
		//Create the variable for volume of earth in kilometer 
		double volumeOfEarthKM = (4f/3f)* Math.PI * Math.pow(earthRadius,3);
		
		//Create the variable for volume of earth in Miles
		double volumeOfEarthMiles = volumeOfEarthKM / Math.pow(1.6,3);
		
		
		
		
		
		
		//Print the volume of earth in miles and in km 
		System.out.println("The volume of earth in cubic kilometers is "+ volumeOfEarthKM +" and cubic miles is "+volumeOfEarthMiles);
		
		
	}
}