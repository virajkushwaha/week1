public class UnitConverterMethodExtends1 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeetFactor = 3; // Conversion factor for yards to feet
        return yards * yardsToFeetFactor; // Return the converted value
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYardsFactor = 0.333333; // Conversion factor for feet to yards
        return feet * feetToYardsFactor; // Return the converted value
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInchesFactor = 39.3701; // Conversion factor for meters to inches
        return meters * metersToInchesFactor; // Return the converted value
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMetersFactor = 0.0254; // Conversion factor for inches to meters
        return inches * inchesToMetersFactor; // Return the converted value
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inchesToCmFactor = 2.54; // Conversion factor for inches to centimeters
        return inches * inchesToCmFactor; // Return the converted value
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods

        // Convert yards to feet and display the result
        double yards = 5.0;
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        // Convert feet to yards and display the result
        double feet = 10.0;
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        // Convert meters to inches and display the result
        double meters = 2.0;
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");

        // Convert inches to meters and display the result
        double inches = 20.0;
        double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");

        // Convert inches to centimeters and display the result
        double inches2 = 15.0;
        double cmFromInches = convertInchesToCm(inches2);
        System.out.println(inches2 + " inches is equal to " + cmFromInches + " centimeters.");
    }
}
