/**
* File: Guitar.java
* Author: Brian Miranda Perez
* Date: February 6, 2020
* This Code will create a class call Guitar With 2 constructors and 
* multiple methods for creating objects inside a required program.
*/
import java.util.Random;

//Private data fields
public class Guitar {
    private int numStrings;
    private double guitarLength;
    private String guitarManufacturer;
    private String guitarColor;

    //no arguments constructor 
    public Guitar() {
         this.numStrings = 6;
         this.guitarLength = 28.2;
         this.guitarManufacturer = "Gibson";
         this.guitarColor = "red";

    }

    // arguments constructor
    public Guitar(
        int strings,
        double size,
        String builder,
        String color
    ) {
        this.numStrings = strings;
        this.guitarLength = size;
        this.guitarManufacturer = builder;
        this.guitarColor = color;

    }

    // Getter Methods
    public int getString () {
        return this.numStrings;
    }

    public double getLength () {
        return this.guitarLength;
    }

    public String getManufacturer () {
        return this.guitarManufacturer;
    }

    public String getColor () {
        return this.guitarColor;
    }

    // toString method to output the results in string format
    public String toString() {
        return "ToString(): " + "(Strings =" + numStrings + ", Length =" + guitarLength + 
        ", Manufacture =" + guitarManufacturer + ", color =" + guitarColor + ")";

    }

    // method that returns s a string representation of 16 random musical notes 
    public void playGuitar() {
        
        // Random class name notesRand
        Random notesRand = new Random();

        // Arrays For the creation of the Musical Notes
        char[] notesLet = {'A','B','C','D','E','F','G'};
        String [] notesNum = {".25", ".5", "1", "2", "3", "4"};

        // for loop to iterate inside of the arrays
        for (int i = 0; i < 16; i++) {
            
            int let = notesRand.nextInt(7);
            int num = notesRand.nextInt(5);

            System.out.print(notesLet[let]);
            System.out.format("(%s)", notesNum[num]);

            // if statement for punctuation
            if (i < 15) {
            System.out.print(", ");

            } else {
                System.out.print(".");
            }
        }

    }

}