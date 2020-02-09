/**
* File: GuitarTest.java
* Author: Brian Miranda Perez
* Date: February 6, 2020
* This program will build instances of the class Guitar using 
* the constructors' insight the program Guitar.java. 
*/
import java.util.Scanner;


public class GuitarTest {

    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        // Prompt user to enter Guitar Cunstructor data

        System.out.print("Enter Guitar String amount: ");
        int strings = myScanner.nextInt();
        System.out.print("Enter Guitar size: ");
        Double size = myScanner.nextDouble();
        myScanner.nextLine();// Clear the Buffer
        System.out.print("Enter Manufacture: ");
        String builder = myScanner.nextLine();
        System.out.print("Enter Color: ");
        String color = myScanner.nextLine();

        // Build Cunstructor that takes values Name fender
        Guitar fender = new Guitar(strings, size, builder,color);

        System.out.println("\n ************************************************************");
        System.out.println(fender.toString());
        System.out.println("getString() = " + fender.getString());
        System.out.println("getLength() = " + fender.getLength());
        System.out.println("getManufacture() = " + fender.getManufacture());
        System.out.println("getColor() = " + fender.getColor());
        System.out.print("playGuitar() = ");
        fender.playGuitar();
        System.out.println(" ");

        System.out.println("\n ********************************************************** \n");
        
        // Guitar Default output
        Guitar defaults = new Guitar();

        System.out.println(">>>>>>>>>>> Default Values <<<<<<<<<<<<");
        System.out.println(defaults.toString());
        System.out.println("getString() = " + defaults.getString());
        System.out.println("getLength() = " + defaults.getLength());
        System.out.println("getManufacture() = " + defaults.getManufacture());
        System.out.println("getColor() = " + defaults.getColor());

        // Close Scanner
        myScanner.close();

    }
}