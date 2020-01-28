/**
* File: Week3UMUC.java
* Author: Brian Miranda Perez
* Date: January 27, 2020
* Purpose: This program will calculate the average
* of a giving amount of students  and a giving amount of 
* scores and also display the students name with ther average
*/

// import statements
import java.util.Scanner;

public class Week3Loop {

    public static void main(String[] args) {
        // variable init.
        String stdName = null;
        int studentAmount = 0;
        int testAmount = 0;
        double sum = 0.0;
        double avrg = 0.0;
        double grade = 0.0;

        // Scanner class name myScanner
        Scanner myScanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Please enter the number of students:");
        studentAmount = myScanner.nextInt();

        // Prompt the user to enter the number of scores graded
        System.out.print("How many scores are you going to enter:");
        testAmount = myScanner.nextInt();

        // First for loop that will control the loop for the number of students
        // This loop will run until the value of "i" is equal to studentAmount
        for (int i = 0; i < studentAmount; i++) {
            myScanner.nextLine(); // clear the buffer so we can use nextLine() in stdName
            System.out.format("\nPlease enter the student name and the %d scores:\n", testAmount);
            System.out.print("Student name: ");
            stdName = myScanner.nextLine();
            sum = 0; // reset the sum to 0 after the first student

            // Nested for loop for taking the scores of the students
            for (int k = 0; k < testAmount; k++) {
                System.out.format("Please enter score #%d:", k + 1);
                grade = myScanner.nextDouble();
                // add every student score and save the final addition in "sum"
                sum += grade;
            }

            // Perform the average calculation
            avrg = sum / testAmount;

            // if statement added by Sebastian Zawadzki
            if (avrg >= 70.0)
                System.out.println("Passed.");
            else
                System.out.println("Failed.");

            // prompt the user with the name of the student and the average
            System.out.format("%s average is: %.1f\n", stdName, avrg);
        }

        System.out.println("\nThank you for using this program");

        // close scanner class name Myscanner
        myScanner.close();
    }

}