public class BankTest {

    public static void main(String[] args) {
        
        BankCl bank = new BankCl();

        bank.deposit(200.0);
        System.out.println("your balance is " + bank.getBal());

        bank.witdr(50);
        System.out.println("your balance is " + bank.getBal());

    }
}