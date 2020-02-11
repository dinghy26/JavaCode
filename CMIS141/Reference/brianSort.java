import java.util.Arrays;

public class brianSort {

    static final int MAX = 50;

        public static void selectionSort(float[] array) {

            for (int i = 0; i <(array.length - 1); i++) {
                int min = i;

                for (int j = 0; j < (array.length); j++) {
                    if (array[j] < array[min])
                    min = j;
                }

                float temp = array[min];
                array[min] = array[i];
                array[i] = temp;

            }
        }

        
        public static void main(String[] args) {

            float[] dobVal = new float[MAX];

            for (int i = 0; i < dobVal.length; i++) {
                dobVal[i] = (float) Math.random() * 100;
            }


            for (int i = 0; i < dobVal.length; i++) {
                System.out.println(dobVal[i]);
            }

            
            System.out.println(" ");
            Arrays.sort(dobVal);
            System.out.println(" ");

            for (int i = 0; i < dobVal.length; i++) {
                System.out.println(dobVal[i]);
            }

        }
}