
/** File: CrimeClass.java
* Author: Brian Miranda Perez
* Date: March 02, 2020
* This class parse the source data and store the calculations
* methods.
*/

import java.util.*;
import java.io.*;

public class CrimeData {

    private static ArrayList<CrimeClass> theList;

    // Method to init. the Data
    public void mainData(String sourcefile) {

        BufferedReader sourceReader = null;
        // String sourceFile = "Crime.csv";
        String fileRows;

        try {

            sourceReader = new BufferedReader(new FileReader(sourcefile));
            // filereader to skip the firs line
            sourceReader.readLine();

            // main store arraylist
            theList = new ArrayList<>();

            while ((fileRows = sourceReader.readLine()) != null) {

                // Constructor for the crime class an parseIn the data
                CrimeClass cl = new CrimeClass(fileRows);
                theList.add(cl);
            }

        } catch (IOException io) {
            System.out.println("Error = " + io.getMessage());
        }

    }

    // display the population growth between years.
    public void populationGrowth() {
        int year;
        int yearPlus;
        float cal;
        for (int i = 0; i < theList.size() - 1; i++) {
            cal = 100 * (float) (theList.get(i + 1).getPopulation() - theList.get(i).getPopulation())
                    / theList.get(i).getPopulation();

            // store the years
            year = theList.get(i).getYears();
            yearPlus = theList.get(i + 1).getYears();

            System.out.printf("From %d - %d the population growth was = %.4f%%\n", year, yearPlus, cal);
        }

    }

    // Min and Max Methods
    public int maxMurder() {

        int year = 1;
        float checkVar = 1;

        for (int i = 0; i < theList.size(); i++) {
            if (theList.get(i).getMurdersNonnegligentRates() > checkVar) {
                // replase the value in evrey iteration with the max val.
                checkVar = theList.get(i).getMurdersNonnegligentRates();
                // set year to the current iteration year
                year = theList.get(i).getYears();
            }
        }
        return year;
    }

    public int minMurder() {

        int year = 1;
        float checkVar = 9999;

        for (int i = 0; i < theList.size(); i++) {
            if (theList.get(i).getMurdersNonnegligentRates() < checkVar) {
                // replase the value in evrey iteration with the min. val.
                checkVar = theList.get(i).getMurdersNonnegligentRates();
                // set year to the current iteration year
                year = theList.get(i).getYears();
            }
        }
        return year;

    }

    public int maxRobbery() {

        int year = 1;
        float checkVar = 0;

        for (int i = 0; i < theList.size(); i++) {

            if (theList.get(i).getRobberyRate() > checkVar) {
                checkVar = theList.get(i).getRobberyRate();
                year = theList.get(i).getYears();
            }
        }
        return year;
    }

    public int minRobbery() {

        int year = 1;
        float checkVar = 99999;

        for (int i = 0; i < theList.size(); i++) {

            if (theList.get(i).getRobberyRate() < checkVar) {
                checkVar = theList.get(i).getRobberyRate();
                year = theList.get(i).getYears();
            }
        }
        return year;
    }

    // Average method
    public float vehicleTheftAverage() {

        int sum = 0;
        float avrg;

        for (int i = 0; i < theList.size(); i++) {
            sum += theList.get(i).getVehicleTheft();
        }
        avrg = sum / theList.size();

        return avrg;
    }

}
