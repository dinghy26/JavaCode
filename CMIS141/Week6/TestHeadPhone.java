import java.awt.Color;
import java.util.Random;

public class TestHeadPhone {

    public static void main(String[] args) {
        
        // Random instance
        Random randit = new Random();

        // headphones Sony With default values
        HeadPhones sony = new HeadPhones();

        System.out.println("\n"+sony.testPluggedIn());
        System.out.println(sony.toString());
        int randomSony = randit.nextInt(6);
        System.out.format("The new Set volume is: %d \n", randomSony);
        System.out.println("***************************\n");

        HeadPhones airPods =  new HeadPhones(3, true, "Apple", Color.WHITE);

        System.out.println(airPods.testPluggedIn());
        System.out.println(airPods.toString());
        int randomAir = randit.nextInt(7);
        System.out.format("The new Set volume is: %d \n", randomAir);
        System.out.println("***************************\n");

        HeadPhones bose = new HeadPhones("Bose", Color.RED);

        System.out.println(bose.testPluggedIn());
        System.out.println(bose.toString());
        int randomBose = randit.nextInt(7);
        System.out.format("The new Set volume is: %d \n", randomBose);
        System.out.println("***************************\n");

    }
}