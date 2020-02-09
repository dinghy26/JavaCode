
/**
* File: bugCode.java
* Author: Brian Miranda Perez
* Date: January 20, 2020
* Purpose: if else practice
*/
// Import java class
import java.util.Scanner;

public class bugCode {
    public static void main(String[] args) {
        int userAge = 0;

        // scanner for users input
        Scanner bugScanner = new Scanner(System.in);

        // prompt users to enter they age.
        System.out.println("Welcome the online Bar!");
        System.out.println("How old are you?");
        userAge = bugScanner.nextInt();

        // if else statement to ver. the users age.
        if (userAge >= 21) {
            System.out.println("You are allowed to buy in this online store!");
            // nested if statement for a senior discount
            if (userAge >= 65) {
                System.out.println("Would you like to use the senior discount?");
            }
        }
        // prompt the user if they are less then 21
        else {
            System.out.println("Sorry, you can't buy alcohol beverages.");
        }
        // Close scanner
        bugScanner.close();
    }
}