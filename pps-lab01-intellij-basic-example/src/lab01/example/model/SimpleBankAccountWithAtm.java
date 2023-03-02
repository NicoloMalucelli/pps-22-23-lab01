package lab01.example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount {

    private static final double ATM_FEE = 1;

    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    public void depositWithATM(int userId, double amount){
        super.deposit(userId, amount-ATM_FEE);
    }

    public void withdrawWithATM(int userId, int amount) {
        super.withdraw(userId, amount+ATM_FEE);
    }
}
