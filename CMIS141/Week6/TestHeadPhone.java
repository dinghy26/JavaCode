import java.awt.Color;

public class TestHeadPhone {

    public static void main(String[] args) {
        
        HeadPhones [] musicH = new HeadPhones [2];

        musicH [0] = new HeadPhones();
        musicH [1] = new HeadPhones(3,true, "sony",Color.GREEN);

        for (int i = 0; i < musicH.length; i++) {
            System.out.format("the volume is %d \n", musicH[i].getVolume());

            if (musicH[i].isPluggedIn()== true) {
                System.out.println(" the head phones are Pluged-in");
            } else {
                System.out.println(" the head phones are NOT Pluged-in");
            }

            System.out.format("The Head Phones Brand is %s\n", musicH[i].getManufacture());
            System.out.format("The Head Phones color is %s\n", musicH[i].getHeadPhoneColor());
            System.out.println(musicH[i].toString()+"\n");
            //int randit = (int)(Math.random() * 5);
            musicH[i].changeVolume((int)(Math.random() * 10));
            System.out.println(musicH[i].toString());
            System.out.println("\n************************************\n");

        }

    }
}