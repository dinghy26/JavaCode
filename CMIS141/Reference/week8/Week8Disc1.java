/** File: Week8Disc1.java
* Author: Brian Miranda Perez
* Date: March 2, 2020
* This class will dysplay
* 12 int from the text file 
* disc8.txt. 
*/
import java.util.*;
import java.io.*;

public class Week8Disc1 {

    public static void main(String[] args) {
        
        String filepath = "disc8.txt";
        int cnt = 0;
        Scanner fileInput = null;

        try {
            fileInput = new Scanner(new BufferedReader(new FileReader(filepath)));
            
            while(fileInput.hasNextLine()) {
                System.out.println(fileInput.nextInt());
                cnt++;
            }
        } catch (FileNotFoundException fn) {
            System.out.println("Error = " + fn.getMessage());
        } finally {
            System.out.format("\n +++++++++++ %d data values read! +++++++++++++++",cnt);
        }
    }
}