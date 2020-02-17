/** File: TestEcoVacs.java
* Author: Brian Miranda Perez
* Date: February 17, 2020
* This Main class creates instances and
* Call all the values for a 
* smart Vacum. 
*/

public class TestEcoVacs {

    public static void main(String[] args) {
        //ecovacs instance named E59
        EcoVacs e59 = new EcoVacs(2, "E59", true);

        e59.onOff();
        System.out.println("**********\n");
        System.out.println(e59.toString());
        System.out.println("\n ***************************** \n");

        //Ecovacs instance named b48 calling the default constructor
        EcoVacs b48 = new EcoVacs();

        b48.onOff();
        System.out.println("**********\n");
        System.out.println(b48.toString());
        System.out.println("\n ***************************** \n");

        //Ecovacs instance named c34 Setting each value individually
        EcoVacs c34 = new EcoVacs();

        c34.setBrush(4);
        c34.setVacName("C34");
        c34.setOnOff(false);

        c34.onOff();
        System.out.println("**********\n");
        System.out.println("The Vac # of Brushes = " + c34.getBrush());
        System.out.println("The Vac serial name = " + c34.getVacName());
        System.out.println("The Vac is on? " + c34.isOnOff());
        System.out.println("\n ***************************** \n");

    }
}