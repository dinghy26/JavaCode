// nested if statemt
import java.util.Scanner;

public class stringEqual2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge.");
        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        if (userAge >= 18) {
            System.out.print("Do you have a VIP Pass? ");
            String vipPassCheck = scanner.next();

            if (vipPassCheck.equals("yes") || userAge >= 70) {
                System.out.println("Thanks, go on in.");
            }
            else{
                System.out.println("Sorry, you must either be over 70 or have a VIP Pass.");
            }
            
        }
        else {
            System.out.println("Sorry You must be over 18.");
        }
    }
}     

        