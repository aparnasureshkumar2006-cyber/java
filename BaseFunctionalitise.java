package Banking;

public class BaseFunctionalitise implements BaseFunctionalitiseInterface{
    private int accountNumber;
    private int balance;
    private String name;
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
}
