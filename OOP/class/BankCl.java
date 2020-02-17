
public class BankCl {

    private String actNum;
    private double actBalance;
    private String userName;
    private String userEmail;
    private String userPnumber;

    public BankCl() {
        this("12345678", 2.0, "user name", "@gmail.com", "555-555-5555");
        System.out.println("Empty constructor Called");
    }

    public BankCl(String number, double balance, String names, String email, String pnum) {

        System.out.println("Account constructor with parameters called");
        this.actNum = number;
        this.actBalance = balance;
        this.userName = names;
        this.userEmail = email;
        this.userPnumber = pnum;
    }

    public BankCl(String userName, String userEmail, String userPnumber) {
        this("99999", 100.55, userName, userEmail,  userPnumber);
    }


    public void deposit(double founds) {
        this.actBalance += founds;
        System.out.println("Deposit of " + founds + " made. New Balance is " + this.actBalance);
    }

    public void witdr(double removeFounds) {
        if (this.actBalance - removeFounds < 0) {
            System.out.println(" The Balance is " + this.actBalance + " transaction cancel");
        } else {
            this.actBalance -= removeFounds;
            System.out.println("withdrawal of " + removeFounds + " Prosessed. Remaining Balance = " + this.actBalance);
        }
    }

    // get/set User ACT.
    public void setAct(String act) {
        this.actNum = act;
    }

    public String GetActNum() {
        return actNum;
    }

    // get/set users Balance
    public void setBal(double bal) {
        this.actBalance = bal;
    }

    public double getBal() {
        return actBalance;
    }

    // get/set users Name
    public void setName(String name) {
        this.userName = name;
    }

    public String getName() {
        return userName;
    }

    // get/set users Email
    public void setEmail(String email) {
        this.userEmail = email;
    }

    public String getEmail() {
        return userEmail;
    }

    // get/set users P. Number
    public void setPnum(String pNum) {
        this.userPnumber = pNum;
    }

    public String getPnum() {
        return userPnumber;
    }


}