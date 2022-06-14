package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    void init(){
        account = new Account("teste", "12221223412");
    }
    @Test
    void testDepositSuccess(){
        account.deposit(100.0);

        Assertions.assertEquals(100.0, account.getMoney());
    }
    @Test
    void testDepositError (){
        account.deposit(-100.0);

        Assertions.assertEquals(0.0, account.getMoney());
    }

}
