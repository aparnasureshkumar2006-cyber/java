package Banking;

public interface UserInterface extends BaseFunctionalitiseInterface{
    public int getDepositAmount();
    public int getWithdrawAmount();
    public String getAccountType();
    public void setDepositAmount(int depositAmount);
    public void setWithdrawAmount(int withdrawAmount);
    public void setAccountType(String accountType);
}
