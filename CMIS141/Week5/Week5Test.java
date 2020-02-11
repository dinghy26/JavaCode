/**
* File: Week5Test.java
* Author: Brian Miranda Perez
* Date: February 10, 2020
* This code will create
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Week5Test {

    public static void main(String[] args) {

        int arraySize = 0;

        // Scanner call pscanner
        Scanner pscanner = new Scanner(System.in);

        // prompt user to enter array size
        System.out.print("Please enter The length of the array: ");
        arraySize = pscanner.nextInt();

        //initialize the array
        int [] theArray = new int[arraySize];

        for (int i = 0; i < theArray.length; i++) {
            theArray [i] = (int) (Math.random() * 100);
            
            System.out.format("The Value of position [%d] = %d \n", i, theArray[i]);

        }

        // Print the size of the array
        System.out.format("\nThis Array have %d Values.\n", theArray.length);
        System.out.println("\nSort Values");

        // Sort the array
        Arrays.sort(theArray);

        for (int i = 0; i < theArray.length; i++) {
            System.out.format("The Value of position [%d] = %d \n", i, theArray[i]);
        }
        
        pscanner.close();

    }
}