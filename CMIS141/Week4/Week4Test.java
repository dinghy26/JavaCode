/**
* File: Week4Class.java
* Author: Brian Miranda Perez
* Date: february 3, 2020
* Purpose: This Code wiil call 
* the methods in the basic calculator program.   
*/

public class Week4Test {
    public static void main (String [] args) {

        // new constructor name test
        Week4Class test = new Week4Class();

        test.InitPrompt(); // initial prompt
        System.out.println("+++++++++++++++++");
        test.NumInput(); //users number input
        System.out.println("+++++++++++++++++");
        test.Calculator(); // calculations

    }
}