
import java.util.Scanner;

public class TestState {

    public static void main(String[] args) {

        // String ver = null;

        Scanner myScanner = new Scanner(System.in);

        StateData string = new StateData();
        String ver = null;

        while (true) {
            System.out.println("***********************\n");
            System.out.print("Enter a State or None to exit: ");
            ver = myScanner.nextLine().trim().toUpperCase();
            string.getStates(ver);

            // System.out.println(string.toString());

            if ("NONE".equals(ver)) {
                System.out.println("You entered " + ver);
                System.out.println("*************** THANK YOU ****************");
                System.out.println("\nA summary report for each State, Bird, and Flower is:");
                // string.getArg();
                string.getset();
                // System.out.println(string.toString());
                break;

            }
            // myScanner.close();

        }

        StateData states1 = new StateData();

        // Scanner scState1 = new Scanner(System.in);
        String state1Var = null;
        System.out.println("\nState1 Instance:");

        while (true) {
            System.out.println("***********************\n");
            System.out.print("Enter a State or None to exit: ");
            state1Var = myScanner.nextLine().trim().toUpperCase();
            states1.getStates(state1Var);

            // System.out.println(string.toString());

            if ("NONE".equals(state1Var)) {
                System.out.println("You entered " + state1Var);
                System.out.println("*************** THANK YOU ****************");
                System.out.println("\nA summary report for each State, Bird, and Flower is:");
                // string.getArg();
                states1.getset();
                // System.out.println(string.toString());
                break;

            }

        }

        myScanner.close();

    }
}