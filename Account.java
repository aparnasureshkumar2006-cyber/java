package Banking;

public abstract class Account extends BaseFunctionalitise implements AccountInterface{
    public void deposit(int amount){
        int amt=this.getBalance()+amount;
        this.setBalance(amt);
    }
    public void withdraw(int amount){
        int amt=this.getBalance()-amount;
        this.setBalance(amt);
    }
}
