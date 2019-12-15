package Exception;

public class MyBankAccount {


    public void transaction(int amount)throws Exception{
        System.out.println("Your transaction is over the balance");
        throw new Exception("Your transaction is over the balance");
    }

    public void deposit(int amount)throws RuntimeException{
        System.out.println("Your deposit amount is less than $10");
        throw new RuntimeException("Your deposit amount is less than $10");
    }

    public void withDraw(int amount) throws RuntimeException {
        System.out.println("You are withdrawing more than your balance");


    }


}
