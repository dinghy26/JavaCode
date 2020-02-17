public class VipCustomer {

    private String names;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 0.00, "Defaul Email");
        System.out.println("Empty cunstructor");
    }

    public VipCustomer(String name, Double credit) {
        this(name, credit, "Your Email");
    }

    public VipCustomer (String NameU, Double creditS, String email) {
        this.names = NameU;
        this.creditLimit= creditS;
        this.emailAddress = email;
    }

    public String GetNames () {
        return this.names;
    }

    public double getCredit() {
        return this.creditLimit;
    }

    public String getEmail () {
        return this.emailAddress;
    }
}