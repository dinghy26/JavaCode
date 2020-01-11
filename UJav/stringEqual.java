import java.util.Scanner;

public class stringEqual {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge");
        
        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        System.out.print("Do you have a VIP Pass?");
        String vipPassReply = scanner.next();

         // vipPassReplay.equals Verf. that the input match the req. word
        if (userAge >= 70 || (userAge >= 18 && vipPassReply.equals("yes"))) {
            System.out.println("Thanks, go on in");
        }

        else {
            System.out.println("Sorry, no can do.");
        }

    }
}