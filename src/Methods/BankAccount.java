package Methods;

public class BankAccount {

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
    int accountNumber;
    double balance;
    int expirationYear;
    int cardcode;

    public void displayInfo(){//method displayinfo
        System.out.println(name);
        System.out.println(bankName);
        System.out.println(accountNumber);
        System.out.println(balance);
        System.out.println(expirationYear);
        System.out.println(cardcode);
    }
    public double deposit(int depositAmount){
        balance=balance+depositAmount;
        return balance;
    }
    public double withdraw(int withdrawAmount){
        if(balance>withdrawAmount) {
            balance = balance - withdrawAmount;
        }
        return balance;
    }



    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.name="Muammer";
        ba.accountNumber=1987665;
        ba.bankName="Chase";
        ba.expirationYear=2022;
        ba.balance=10;
        ba.cardcode=211;
        ba.displayInfo();
        ba.deposit(1000);
        ba.displayInfo();
        ba.withdraw(480);
        ba.displayInfo();
        ba.withdraw(1000);
        ba.displayInfo();
        ba.displayInfo();
    }
}



















