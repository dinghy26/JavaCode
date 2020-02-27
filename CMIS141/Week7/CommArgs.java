/** File: CommArgs.java
* Author: Brian Miranda Perez
* Date: February 24, 2020
* This program will generate a random number between X and Y.
* Run the program from the command line or terminal. (java CommArgs X Y) 
*/

public class CommArgs {

    public static void main(String[] args) {

        // convert the first number to an integer
        int num1 = Integer.parseInt(args[0]);
        // convert the second number to an integer
        int num2 = Integer.parseInt(args[1]);

        //Store the random num between Num1 and Num2
        int randit = (int) ((Math.random() * (num2 - num1)) + num1);
            
        System.out.println(randit);

    }
}