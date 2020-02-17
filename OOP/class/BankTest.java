public class BankTest {

    public static void main(String[] args) {
        
       BankCl joe = new BankCl();//("1234", 200.0, "bMir", "ding@gmail.com", "787-914-1538");
       System.out.println(joe.GetActNum());
       System.out.println(joe.getBal());
       System.out.println(joe.getName());

       BankCl tim = new BankCl("tim", "tim@gmail.com", "999-999-9999");

       System.out.println(tim.GetActNum());
       System.out.println(tim.getEmail());
       System.out.println(tim.getPnum());

        //BankCl bank = new BankCl();


        //bank.deposit(200.0);

        //bank.witdr(50);

        //bank.witdr(152);

        VipCustomer test = new VipCustomer();
        System.out.println(test.GetNames());
        System.out.println(test.getCredit());
        System.out.println(test.getEmail());



    }
}