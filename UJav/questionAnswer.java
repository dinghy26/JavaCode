import java.util.Scanner;// using the scanner Pack.

public class questionAnswer {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nWhat is your age?");
        int userAge = scanner.nextInt();// user input int "nextInt"
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old");

        System.out.println("\n How tall are you in metres?");
        double userHeigh = scanner.nextDouble();// user input double "nextDouble"
        System.out.println(userName + " You are " + userHeigh + " metres tall");

        double averageMaleHeight = userHeigh - 1.75;
        double averageFemaleHeight = userHeigh - 1.62;

        System.out.println("\n The difference between your height and the average is:");
        System.out.format("%.2f m if you are a Male.\n", averageMaleHeight);// using the format
        System.out.format("%.2f m if you are a Female.\n", averageFemaleHeight);

    }
}