package Banking;

public class SavingsAccount extends Account implements SavingsAccountInterface{
    public void createFixedDeposit(){
        System.out.println("Fixed Deposit Created");
    }
}
