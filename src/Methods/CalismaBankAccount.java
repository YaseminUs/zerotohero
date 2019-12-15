package Methods;

public class CalismaBankAccount {
    //    TASK
    // Create one class called BankAccount
    // there are three instance variable = name, accountNumber, bankName, balance(double), expirationDate
    // 1- create the method to display all the card information
    // 2- Create the method to deposit the amount to your bank account
    //    This method will take the int parameter as an amount. Return type double
    // 3- Create the method to withdraw the money from your account
    //    it will take one parameter as an withdraw amount.
    //    it will return the double.

    String name;
    String bankName;
    int expirationDate;
    int accountNumber;
    int code;
    double balance;

    public void cardinfo() {
        System.out.println("name is: " + name);
        System.out.println("bank name is: " + bankName);
        System.out.println("expiration date is: " + expirationDate);
        System.out.println("account number is: " + accountNumber);
        System.out.println("card code is: " + code);
        System.out.println("balance is " + balance);
    }

    public double deposit(int depositAmount) {
        balance = balance + depositAmount;
        return balance;

    }

    public double withdraw(int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
    }
        return balance;
    }

    public static void main(String[]args){
        CalismaBankAccount CBA=new CalismaBankAccount();
        CBA.name="yasemin";
        CBA.bankName="Chase";
        CBA.expirationDate=2021;
        CBA.code=432;
        CBA.accountNumber=12345;
        CBA.balance=1000;
        CBA.cardinfo();
        CBA.deposit(480);
        CBA.cardinfo();
        CBA.withdraw(285);
        CBA.cardinfo();

}



}