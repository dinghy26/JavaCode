import java.util.Random;

public class MyArrayDemo {

    static final int ARRAYMAX = 20;

    public static void main(String[] args) {

        int [] randomArray = new int [ARRAYMAX];

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = (int) (Math.random() * 100) -50;
        }

        boolean [] randBool = new boolean [ARRAYMAX];
        Random randit = new Random();

        for (int i = 0; i < randBool.length; i++) {
            randBool[i] = randit.nextBoolean();
        }

        for (int z = 0; z < randomArray.length; z++) {
            System.out.format(" Int in position [%d] = %d \n", z, randomArray[z]);
        }

        for (int i = 0; i < randBool.length; i++) {
            System.out.println(randBool[i]);
        }


    }
}