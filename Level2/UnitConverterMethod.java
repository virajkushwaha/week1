public class UnitConverterMethod {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double kilometers) {
        double kmToMilesFactor = 0.621371; // Conversion factor for kilometers to miles
        return kilometers * kmToMilesFactor; // Return the converted value
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934; // Conversion factor for miles to kilometers
        return miles * milesToKmFactor; // Return the converted value
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084; // Conversion factor for meters to feet
        return meters * metersToFeetFactor; // Return the converted value
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048; // Conversion factor for feet to meters
        return feet * feetToMetersFactor; // Return the converted value
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods

        // Convert kilometers to miles and display the result
        double kilometers = 5.0;
        double miles = convertKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        // Convert miles to kilometers and display the result
        double miles2 = 3.0;
        double kilometers2 = convertMilesToKm(miles2);
        System.out.println(miles2 + " miles is equal to " + kilometers2 + " kilometers.");

        // Convert meters to feet and display the result
        double meters = 10.0;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Convert feet to meters and display the result
        double feet2 = 32.8;
        double meters2 = convertFeetToMeters(feet2);
        System.out.println(feet2 + " feet is equal to " + meters2 + " meters.");
    }
}
