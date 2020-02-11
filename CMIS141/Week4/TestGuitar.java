/**
* File: GuitarTest.java
* Author: Brian Miranda Perez
* Date: February 6, 2020
* This program will build instances of the class Guitar using 
* the constructors' insight the program Guitar.java. 
*/
import java.util.Scanner;


public class TestGuitar {

    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        // Prompt user to enter Guitar Cunstructor data

        System.out.print("Enter Guitar String amount: ");
        int strings = myScanner.nextInt();
        System.out.print("Enter Guitar size: ");
        Double size = myScanner.nextDouble();
        myScanner.nextLine();// Clear the Buffer
        System.out.print("Enter Manufacturer: ");
        String builder = myScanner.nextLine();
        System.out.print("Enter Color: ");
        String color = myScanner.nextLine();

        // Build Cunstructor that takes values Name guitarInput
        Guitar guitarInput = new Guitar(strings, size, builder,color);

        System.out.println("\n ************************************************************");
        System.out.println(guitarInput.toString());
        System.out.println("getString() = " + guitarInput.getString());
        System.out.println("getLength() = " + guitarInput.getLength());
        System.out.println("getManufacturer() = " + guitarInput.getManufacturer());
        System.out.println("getColor() = " + guitarInput.getColor());
        System.out.print("playGuitar() = ");
        guitarInput.playGuitar();
        System.out.println(" ");

        System.out.println("\n ********************************************************** \n");
        
        // Guitar Default output
        Guitar defaults = new Guitar();

        System.out.println(">>>>>>>>>>> Default Values <<<<<<<<<<<<");
        System.out.println(defaults.toString());
        System.out.println("getString() = " + defaults.getString());
        System.out.println("getLength() = " + defaults.getLength());
        System.out.println("getManufacturer() = " + defaults.getManufacturer());
        System.out.println("getColor() = " + defaults.getColor());

        // Close Scanner
        myScanner.close();

    }
}