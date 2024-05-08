public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    //array list
    private int MAX_TICKET;

    public void User(String email, String password, String fullName, double balance){

    }

    // public void addTicket()

    public void displayAllTicket(){

    }

    // public boolean isMatch(String email, String password) {
    //     return 
    // }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
