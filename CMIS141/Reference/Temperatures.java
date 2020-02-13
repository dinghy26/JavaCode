//Title: Temperatures 
//Class: CMIS 141
//Author: Rashaun Jackson
//Date: 11 Feb, 2020
/*This program creates an array to store the temperatures in a 30 day long month*/    

    //declare class
public class Temperatures {
	//Main method
	static final int MAX = 30;
	public static void main(String[] arg) {

		// For loop for random #
		int [] dailyT = new int [MAX];

		for (int i = 0; i < dailyT.length; i++ ) {
			dailyT [i] = (int) (Math.random() * 100);// temp from 0 to 100
		}
	//initialize new array with 00 to hold place in first element
	//int[] dailyTemps = { 00,55,64,65,63,56,64,56,59,60,58,62,66,63,59,57,55,62,58,67,65,62,58,57,54,60,58,57,55,60,62};
	
	//print advisory message
	System.out.println ("Please disregard Day 0. The first day of the month is Day 1");
	//for loop to print daily temperatures 
		for (int i = 0; i < dailyT.length; i++) {
        System.out.format ("The temperature for day %d is %d degrees fahrenheit. \n", i + 1, dailyT[i]); //change to .format to display the array fro 0 to 30
        
        }//end for loop
    }//end main method
}//end class