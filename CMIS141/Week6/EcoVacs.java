/** File: EcoVacs.java
* Author: Brian Miranda Perez
* Date: February 17, 2020
* This class stores all the values for a 
* smart Vacum. 
*/

public class EcoVacs {

    private int brush;
    private String vacName;
    private boolean onOff;

    // empty constructor with default values
    public EcoVacs(){
        this(0, "Serial Name", false);
    }

    // constructor that takes the values to set the fields
    public EcoVacs(int brush, String vacName, Boolean onOff) {

        this.brush = brush;
        this.vacName = vacName;
        this.onOff = onOff;

    }
    // Method for print the fild values in a string
    public String toString() {
        return "The Vac # of Brushes = " + getBrush() + "\n" + "The Vac serial name = " + getVacName()
        + "\n" + "The Vac is on? " + isOnOff();   
    }

    // method to display if the Vac is on or off using the boolean onOff
    public void onOff() {
        if (this.onOff == true) {
            System.out.println("The Vac Is ON.");
        } else {
            System.out.println("The Vac is OFF.");
        }
    }

    // Getters an Setters
    public int getBrush() {
        return this.brush;
    }

    public void setBrush(int brush) {
        this.brush = brush;
    }

    public String getVacName() {
        return this.vacName;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;

    }

    /**I set up an if statement initially in this getter
     * but then I decide to make a method with the if 
     * statement to have more control.
     */
    public boolean isOnOff() {
    //    if (onOff == true) {
    //        System.out.println("The Vac Is ON.");
    //    } else {
    //        System.out.println("The Vac is OFF.");
    //    }
        return this.onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
        
    }

    
}