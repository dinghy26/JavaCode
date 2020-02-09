/**
* File: Week2UMUC.java
* Author: Brian Miranda Perez
* Date: January 20, 2020
* Purpose: This program will calculate the average
* of 3 Quizzes and convert age in Months to years 
* and to finalize it will convert Celsius to Fahr.
*/

// Import required Java class
import java.util.Scanner;

public class week2UMUC {
    public static void main(String[] args) {

        // Initialization of variables
        int userID = 0;
        int ageMonths = 0;
        int monthsToYears = 0;
        double tempCelsius = 0.0;
        double celsiusToFahr = 0.0;
        double userQ1 = 0.0;
        double userQ2 = 0.0;
        double userQ3 = 0.0;
        double quizzAvrg = 0.0;
        final char DEGREE = '\u00B0'; // Degrees Symbol unicode character

        // Scanner class name myScaner to receive users input
        Scanner myScaner = new Scanner(System.in);

        // User id #.
        System.out.print("Please enter you'r User ID (0 - 999999):");
        userID = myScaner.nextInt();

        // Promt the user to enter score for 3 Quizzes
        System.out.println("Please enter Quiz 1 to 3 scores (0.0 - 100.0):");
        System.out.print("Quiz 1: ");
        userQ1 = myScaner.nextDouble();
        System.out.print("Quiz 2: ");
        userQ2 = myScaner.nextDouble();
        System.out.print("Quiz 3: ");
        userQ3 = myScaner.nextDouble();

        // Promt user to enter age in Months
        System.out.print("Enter your age in months (0 - 1440):");
        ageMonths = myScaner.nextInt();

        // Prompt user to enter temp. ins Celsius
        System.out.print("Enter the current Temperature in Celsius: ");
        tempCelsius = myScaner.nextDouble();

        // This is the calculations for the final output
        quizzAvrg = (userQ1 + userQ2 + userQ3) / 3; // calculate avrg. of 3 quizzes
        monthsToYears = ageMonths / 12; // convert age from months to years
        celsiusToFahr = (tempCelsius * 9 / 5) + 32; // convertion from celcius to Fahrenheit

        // Final output prompt
        System.out.println("\n*** Thank You ***");
        System.out.format("Student EMPLYID: %d\n", userID);
        System.out.format("Quiz 1 score: %.1f\n", userQ1);
        System.out.format("Quiz 2 score: %.1f\n", userQ2);
        System.out.format("Quiz 3 score: %.1f\n", userQ3);
        System.out.format("Average Quiz score: %.1f\n", quizzAvrg);
        System.out.format("Age in Months: %d\n", ageMonths);
        System.out.format("Age in years: %d\n", monthsToYears);
        System.out.format("Temperature in Celsius: %.1f%c\n", tempCelsius, DEGREE);
        System.out.format("Temperature in Fahrenheit: %.1f%c\n", celsiusToFahr, DEGREE);

        // Close the Scanner class
        myScaner.close();

    }
}