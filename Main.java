package Banking;

public class Main {
    public static void main(String[] args) {
        UserInterface user = new User();
        user.setDepositAmount(10000);
        user.setWithdrawAmount(1000);
        user.setAccountType("Savings");
        user.setName("USER 1:SAVINGS");
        user.setBalance(10000);

        SavingsAccountInterface savings=new SavingsAccount();
        if (user.getAccountType()=="Savings"){
            savings.setName(user.getName());
            System.out.println(savings.getName());
            savings.setAccountNumber(user.getAccountNumber());
            System.out.println("Deposited:");
            System.out.println(user.getDepositAmount());
            savings.deposit(10000);
            System.out.println("Balance:");
            System.out.println(savings.getBalance());
            savings.createFixedDeposit();
        }

        UserInterface user2 = new User();
        user2.setDepositAmount(10000);
        user2.setWithdrawAmount(1000);
        user2.setAccountType("Current");
        user2.setName("USER 2:CURRENT");
        user2.setBalance(10000);

        CurrentAccountInterface current=new CurrentAccount();
        if (user2.getAccountType()=="Current"){
            current.setName(user2.getName());
            System.out.println(current.getName());
            current.setAccountNumber(user2.getAccountNumber());
            System.out.println("Deposited:");
            System.out.println(user2.getDepositAmount());
            current.deposit(10000);
            System.out.println("Balance:");
            System.out.println(current.getBalance());
            current.enableOverdraft();
        }
    }
}
