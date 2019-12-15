package Exception;

import java.io.IOException;
import java.sql.SQLException;

public class CreditCartAccount extends MyBankAccount {

    @Override
    public void transaction(int amount) throws StringIndexOutOfBoundsException { //when owerriding method child class throws it can be same
        System.out.println("Your crossing credit cart limit");
        throw new IndexOutOfBoundsException("Your crossing credit cart limit");
    }
    @Override
    public void deposit(int amount) throws RuntimeException {
        System.out.println("Paying off my balance.");
    }
    @Override
    public void withDraw(int amount)throws java.lang.RuntimeException {
        System.out.println("You are withdrawing more than your balance");

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
