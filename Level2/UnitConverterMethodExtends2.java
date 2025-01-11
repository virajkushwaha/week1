public class UnitConverterMethodExtends2 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9; // Conversion formula
        return fahrenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
        return celsiusToFahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilogramsFactor = 0.453592; // Conversion factor for pounds to kilograms
        return pounds * poundsToKilogramsFactor; // Return the converted value
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPoundsFactor = 2.20462; // Conversion factor for kilograms to pounds
        return kilograms * kilogramsToPoundsFactor; // Return the converted value
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLitersFactor = 3.78541; // Conversion factor for gallons to liters
        return gallons * gallonsToLitersFactor; // Return the converted value
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallonsFactor = 0.264172; // Conversion factor for liters to gallons
        return liters * litersToGallonsFactor; // Return the converted value
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter methods

        // Convert Fahrenheit to Celsius and display the result
        double fahrenheit = 100.0;
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusFromFahrenheit + " Celsius.");

        // Convert Celsius to Fahrenheit and display the result
        double celsius = 37.0;
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit.");

        // Convert pounds to kilograms and display the result
        double pounds = 150.0;
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");

        // Convert kilograms to pounds and display the result
        double kilograms = 70.0;
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");

        // Convert gallons to liters and display the result
        double gallons = 5.0;
        double litersFromGallons = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");

        // Convert liters to gallons and display the result
        double liters = 10.0;
        double gallonsFromLiters = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
