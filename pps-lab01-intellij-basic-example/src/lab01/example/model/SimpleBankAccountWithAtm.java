package lab01.example.model;

public class SimpleBankAccountWithAtm implements BankAccount {

    private final AccountHolder holder;
    private int balance;

    public SimpleBankAccountWithAtm(AccountHolder holder, int balance) {
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public AccountHolder getHolder() {
        return null;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int userID, double amount) {
        if (checkUser(userID)) {
            this.balance -= 1;
            this.balance += amount;
        }
    }

    @Override
    public void withdraw(int userID, double amount) {

    }
    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
