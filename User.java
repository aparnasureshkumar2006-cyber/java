package Banking;

public class User extends BaseFunctionalitise implements UserInterface{
    private int depositAmount;
    private int withdrawAmount;
    private String accountType;
    public int getDepositAmount() {
        return depositAmount;
    }
    public int getWithdrawAmount() {
        return withdrawAmount;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }
    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
