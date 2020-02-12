/**
* File: Week5Test.java
* Author: Brian Miranda Perez
* Date: February 10, 2020
* This code will create an array using the user's size input
* and use that to create a random list of numbers from o to 100.
* It will print the position and the random number in that position
* and will notify the user of how many values are in the array.
* To Finish, it will sort the array and place the random values in a new position.
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
            theArray [i] = (int) (Math.random() * 101);
            System.out.println(theArray[i]);

            if (i > 0) {
                for(int z = 0; z < i; z++) {

                    //check for duplications
                    if (theArray[z] == theArray[i]) {
                        System.out.format("theArray[z] = %d and thArray[i] = %d in the position [%d] \n",theArray[z] ,theArray[i], z);
                        System.out.println("The values of i is " + i + " before i-- ");
                        i--; // will set i to the prior iteration and run the math.random again to replace the num. 
                        System.out.println("The values of i is " + i + " before i-- ");
                }
            }
        }


            //System.out.format("The Value of position [%d] = %d \n", i, theArray[i]);
        }

        for (int a = 0; a < theArray.length; a++) {
            System.out.format("The Value of position [%d] = %d \n", a, theArray[a]);

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