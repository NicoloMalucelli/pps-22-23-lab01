package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

    private final AccountHolder accountHolder;
    private final int balance;

    public SimpleBankAccountWithAtm(AccountHolder accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public AccountHolder getHolder() {
        return null;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void deposit(int userID, double amount) {

    }

    @Override
    public void withdraw(int userID, double amount) {

    }
}
