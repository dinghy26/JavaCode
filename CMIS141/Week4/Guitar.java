
import java.lang.reflect.Field;
import java.util.Random;

public class Guitar {
    private int numStrings;
    private double guitarLength;
    private String guitarManufacturer;
    private String guitarColor;

    public Guitar() {
         numStrings = 6;
         guitarLength = 28.2;
         guitarManufacturer = "Gibson";
         guitarColor = "red";

    }

    public Guitar(
        int strings,
        double size,
        String builder,
        String color
    ) {
        this.numStrings = strings;
        this.guitarLength = size;
        this.guitarManufacturer = builder;
        this.guitarColor = color;
    }

    public int getString () {
        return this.numStrings;
    }

    public double getLength () {
        return this.guitarLength;
    }

    public String getManufacture () {
        return this.guitarManufacturer;
    }

    public String getColor () {
        return this.guitarColor;
    }

    public String toString() {
        return "ToString(): " + "(Strings =" + numStrings + ", Length =" + guitarLength + 
        ", Manufacture =" + guitarManufacturer + ", color =" + guitarColor + ")";

    }

    public void playGuitar() {
        Random notesRand = new Random();

        char[] notesLet = {'A','B','C','D','E','F','G'};
        String [] notesNum = {".25", ".5", "1", "2", "3", "4"};

        for (int i = 0; i < 16; i++) {
            
            int let = notesRand.nextInt(7);
            int num = notesRand.nextInt(5);

            System.out.print(notesLet[let]);
            System.out.format("(%s)", notesNum[num]);

            if (i < 15) {
            System.out.print(", ");

            } else {
                System.out.print(".");
            }
        }

    }

}