/*
* File: My3DDemo.java
* Author: Dr. Robertson
* Date: January 1, 2015
* Purpose: This program demonstrates how to create
* and populate 3D arrays in Java
*/


public class My3DDemo {  
// Define constant array size
static final int INSTORE = 5;
static final int PRICE = 20;
static final int SOLD = 10;

   
     // Main method
    public static void main(String args[]){
      System.out.println("Welcome to the MultiDimensional Array Demo");

     
     // Create array of int 3D
      int[][][] precip3D = new int[INSTORE][PRICE][SOLD];
	// Assign random values 
       for (int a=0; a<INSTORE; a++) {
         for (int b=0; b<PRICE; b++) {
            for (int c=0; c<SOLD; c++) {
        precip3D[a][b][c] = (int) (Math.random() * 100)+1;  
            }
         }     
       }

     // Print results with Year upfront
     // Define BaseYear
	int baseYear = 2010;
	for (int k=0; k<INSTORE; k++) {
	   System.out.println("Year is " + (baseYear+k)); 
  
            for (int i=0; i<PRICE; i++) {  
		 for (int j=0; j<SOLD; j++) {                       
	      System.out.print(precip3D[k][i][j] + "\t");    
            }
              System.out.println(""); 
          }                        
        }

	

    }
   
    
   
}