import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBankAccountWithAtmTest {

    private AccountHolder accountHolder;
    private SimpleBankAccountWithAtm bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }


    @Test
    void testDepositWithATM() {
        bankAccount.depositWithATM(accountHolder.getId(), 100);
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWithDrawWithATM() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdrawWithATM(accountHolder.getId(), 10);
        assertEquals(89, bankAccount.getBalance());
    }
}
