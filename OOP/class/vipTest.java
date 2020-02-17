public class vipTest {

    public static void main(String[] args) {
        
        VipCustomer cust1 = new VipCustomer("Harold", 600.0);

        System.out.println(cust1.GetNames());
        System.out.println(cust1.getEmail());
        System.out.println("\n*****************\n");

        VipCustomer cust2 = new VipCustomer();

        System.out.println(cust2.GetNames());
        System.out.println(cust2.getCredit());
        System.out.println(cust2.getEmail());
    
    
    }
}