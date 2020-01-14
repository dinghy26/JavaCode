import java.util.Scanner;

public class challenge3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of x: ");
        int valueX = scanner.nextInt();

        System.out.print("Please enter the value of y: ");
        int valueY = scanner.nextInt();

        if (valueX < valueY) {
            System.out.println("X is smaller than Y by " + (valueY - valueX));
        }

        else if (valueX == valueY) {
            System.out.println("X and Y are the same.");
        }

        else {
            System.out.println("x is bigger Than Y by " + (valueX - valueY));
        }

    }
}