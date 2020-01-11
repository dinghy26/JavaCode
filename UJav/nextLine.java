import java.util.Scanner;

public class nextLine {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = scanner.nextLine(); // "nextLine" read the complete line insted of just one word.
        System.out.format("%s is your name.\n", userName);
    }
}