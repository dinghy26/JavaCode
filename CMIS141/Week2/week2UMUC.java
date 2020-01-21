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
        int userID = 0;
        int ageMonths = 0;
        int montsToYears = 0;
        double tempCelsius = 0.0;
        double celsiusToFahr = 0.0;
        double userQ1 = 0.0;
        double userQ2 = 0.0;
        double userQ3 = 0.0;
        double quissAvrg = 0.0;
        final char DEGREE = '\u00B0';

        // scanner class name myscaner to resive user input
        Scanner myScaner = new Scanner(System.in);

        System.out.print("Please enter you'r User ID (0 - 999999):");
        userID = myScaner.nextInt();

        System.out.println("Please enter Quizz 1 to 3 (0.0 - 100.0):");
        System.out.print("Quizz 1: ");
        userQ1 = myScaner.nextDouble();
        System.out.print("Quizz 2: ");
        userQ2 = myScaner.nextDouble();
        System.out.print("Quizz 3: ");
        userQ3 = myScaner.nextDouble();

        System.out.print("Enter your age in monts (0 - 1440):");
        ageMonths = myScaner.nextInt();

        System.out.print("Enter the current Temperature in Celsius: ");
        tempCelsius = myScaner.nextDouble();

        // this is the calculations for the final output
        quissAvrg = (userQ1 + userQ2 + userQ3) / 3;
        montsToYears = ageMonths / 12;
        celsiusToFahr = (tempCelsius * 9 / 5) + 32;

        // Final output prompt
        System.out.println("\n*** Thank You ***");
        System.out.format("Student EMPLYID: %d\n", userID);
        System.out.format("Quizz 1 score: %.2f\n", userQ1);
        System.out.format("Quizz 2 score: %.2f\n", userQ2);
        System.out.format("Quizz 3 score: %.2f\n", userQ3);
        System.out.format("Average Quizz score: %.2f\n", quissAvrg);
        System.out.format("Age in Months: %d\n", ageMonths);
        System.out.format("Age in years: %d\n", montsToYears);
        System.out.format("Temperature in Celsius: %.2f%c\n", tempCelsius, DEGREE);
        System.out.format("Temperature in Fahrenheit: %.2f%c\n", celsiusToFahr, DEGREE);

        // close the Scanner
        myScaner.close();

    }
}