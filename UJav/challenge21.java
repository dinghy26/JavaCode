import java.util.Scanner;

public class challenge21 {

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("Age?");
        int age = scanner.nextInt();

        int ageSum = age + age;
        int nameLength = userName.length();

        System.out.format("\n%s You've lived %d years.", userName, age);
        System.out.format("\nIn another %d you'll be %d years old.\n",age, ageSum);
        System.out.format("Your name length is %d \n", nameLength);

    }
}