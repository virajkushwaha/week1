import java.util.Scanner;

public class BMI_Method {

    // Method to calculate BMI for each person and populate the BMI column in the personData array
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];  // Weight of the person
            double heightInCm = personData[i][1];  // Height in centimeters
            double heightInMeters = heightInCm / 100;  // Convert height from cm to meters
            double bmi = weight / (Math.pow(heightInMeters, 2));  // Calculate BMI using the formula
            personData[i][2] = bmi;  // Store the calculated BMI in the 3rd column
        }
    }

    // Method to determine the BMI status based on the BMI value
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];  // Array to store BMI status for each person
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];  // Retrieve the BMI for the person
            if (bmi <= 18.4) {
                status[i] = "Underweight";  // BMI value indicating underweight
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";  // BMI value indicating normal weight
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";  // BMI value indicating overweight
            } else {
                status[i] = "Obese";  // BMI value indicating obesity
            }
        }
        return status;  // Return the BMI status array
    }

    // Method to display the BMI data for each person (weight, height, BMI, and status)
    public static void displayBMIData(double[][] personData, String[] status) {
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\tStatus");  // Print the header
        for (int i = 0; i < personData.length; i++) {
            // Print the details for each person in a formatted manner
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for each person (10 persons, 3 columns)
        double[][] personData = new double[10][3];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            personData[i][0] = scanner.nextDouble();  // Input weight
            System.out.print("Enter height (in cm): ");
            personData[i][1] = scanner.nextDouble();  // Input height
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Determine BMI status for each person
        String[] status = determineBMIStatus(personData);

        // Display the results: weight, height, BMI, and status for each person
        displayBMIData(personData, status);

        scanner.close();  // Close the scanner to release resources
    }
}
