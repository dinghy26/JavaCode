import java.util.Scanner;

public class challenge22 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How mush was the total bill? ");
        double billTotal = scanner.nextDouble();

        System.out.println("How many people are going to be spliting the bill?");
        int splitNum = scanner.nextInt();

        double totalSplit = billTotal / splitNum;

        System.out.format("The bill is %.2f if you split it in %d \n", totalSplit, splitNum);

    }
}