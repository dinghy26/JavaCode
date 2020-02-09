/**
* File: Week4Class.java
* Author: Brian Miranda Perez
* Date: february 3, 2020
* Purpose: This Program is a basic calculator that 
* lets you pic wich Math you want to perform. Is a single class with 3 Methods. 
*/

import java.util.Scanner;

public class Week4Class {
    private String name;
    private int num1;
    private int num2;
    private int options;
    private double total;

    // global sanner class name myScaner
    Scanner myScanner = new Scanner(System.in);

    // Initial Prompt
    public void InitPrompt() {
        System.out.print("Please Enter Your Name: ");
        name = myScanner.nextLine();
        System.out.format("Hello %s which math are you going to perform? \n", name);
        System.out.println(" #1 Addition\n #2 Subtraction");
        System.out.println(" #3 Multiplication\n #4 Division"); 
        options = myScanner.nextInt();
    }

    // Numbers input
    public void NumInput() {
        System.out.print("Enter Num1: ");
        num1 = myScanner.nextInt();
        System.out.print("Enter Num2: ");
        num2 = myScanner.nextInt();
    }

    // Perform the calculation of 2 num
    public void Calculator () {
        if (options == 1) {
            total = num1 + num2;
    
        } else if (options == 2) {
            total = num1 - num2;

        } else if (options == 3) {
            total = num1 * num2;

        } else if (options == 4) {
            total = num1 / num2;

        } else {
            System.out.println("Wrong option!");
            
        }

        // Total Output
        System.out.println("The total is: " + total);
    }        
        

}

