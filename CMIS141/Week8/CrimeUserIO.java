
/** File: CrimeUserIO.java
* Author: Brian Miranda Perez
* Date: March 02, 2020
* This class will display the prompts and options to the user
*/

import java.util.*;
//import java.io.*;

public class CrimeUserIO {

    // header method for display only once in the program
    public void header() {
        System.out.println("\n********** Welcome to the US Crime Statistical Application **************************");
    }

    // User menu
    public void prompt() {

        System.out.println("\n\nEnter the number of the question you want answered. Enter Q to quit the program :");
        System.out.println(
                "\n1. What were the percentages in population growth for each consecutive year from 1994 / 2013?");
        System.out.println("2. What year was the Murder rate the highest? \n"
                + "3. What year was the Murder rate the lowest?\n" + "4. What year was the Robbery rate the highest?\n"
                + "5. What year was the Robbery rate the lowest?\n" + "6. Average car theft from 1994 to 2013\n"
                + "Q. Quit the program");

    }

    // User input Scanner
    public void promptInput() {

        // Crime data instance to retrive the calculation methods
        CrimeData data = new CrimeData();

        // Scanner
        Scanner myScanner = new Scanner(System.in);

        // main field
        String pick;

        // while loop to continue the redisplay
        while (true) {

            System.out.print("\nEnter your selection: ");
            pick = myScanner.next();

            if (pick.equals("1")) {
                data.populationGrowth();
                prompt();

            } else if (pick.equals("2")) {
                System.out.println("\nThe Murder rate was highest in " + data.maxMurder());
                prompt();

            } else if (pick.equals("3")) {
                System.out.println("\nThe Murder rate was lowest in " + data.minMurder());
                prompt();

            } else if (pick.equals("4")) {
                System.out.println("\nThe Robbery rate was highest in " + data.maxRobbery());
                prompt();

            } else if (pick.equals("5")) {
                System.out.println("\nThe Robbery rate was lowest in " + data.minMurder());
                prompt();

            } else if (pick.equals("6")) {
                System.out.println("\n The average car theft from 1994 to 2013 is " + data.vehicleTheftAverage());

            } else if (pick.equals("q")) {
                System.out.println("\nThank you for trying the US Crimes Statistics Program.");
                break;
            } else {
                System.out.println("\n*************** Enter a valid menu selection ***************");
                prompt();

            }

        }
        myScanner.close();

    }
}