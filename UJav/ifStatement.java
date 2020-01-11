import java.util.Scanner;

public class ifStatement {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kids you have:");
        int kidsNum = scanner.nextInt();

        if (kidsNum <= 5) {
            System.out.println("Proced with the next step.");

        }
        
        else
        System.out.println("You need the second form to proced.");
        
    }
}