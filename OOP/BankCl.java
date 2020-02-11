
public class BankCl {

    private int actNum;
    private double actBalance;
    private String userName;
    private String userEmail;
    private String userPnumber;


    public void deposit(double founds) {
        this.actBalance += founds;
    }

    public void witdr (double removeFounds) {
        if (this.actBalance - removeFounds < 0){
            System.out.println(" The Balance is" + this.actBalance + "transaction cancel");
        } else {
            this.actBalance -= removeFounds;
        }
    }

    // get/set User ACT.
    public void setAct(int act) {
        this.actNum = act;  
    }

    public int GetActNum() {
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