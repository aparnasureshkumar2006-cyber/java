package Banking;

public class CurrentAccount extends Account implements CurrentAccountInterface{
    public void enableOverdraft(){
        System.out.println("Overdraft Enabled");
    }
}
