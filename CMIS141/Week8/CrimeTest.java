
/** File: CrimeClass.java
* Author: Brian Miranda Perez
* Date: March 02, 2020
* Main Class
*/

public class CrimeTest {

    public static void main(String[] args) {
        // time fields
        long startTime;
        long stopTime;
        double time;

        // take arguments from the command line
        String initSourceData = args[0];
        startTime = System.currentTimeMillis();

        // cunstructor to init the data in the main class
        CrimeData initData = new CrimeData();
        // init the data
        initData.mainData(initSourceData);
        // interface
        CrimeUserIO IO = new CrimeUserIO();
        IO.header();
        IO.prompt();
        IO.promptInput();

        // end the time tracking
        stopTime = System.currentTimeMillis();
        time = (stopTime - startTime) / 1000.0;

        System.out.format("\nElapsed time in seconds was: %.0f", time);

    }
}