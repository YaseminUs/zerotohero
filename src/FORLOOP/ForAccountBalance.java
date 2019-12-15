package FORLOOP;

import java.util.Scanner;

public class ForAccountBalance {
    public static void main(String[] args) {

        //input:
        //AccountBalance
        //transaction
        //AccountBalance-transaction
        //transaction
        //AccountBalance-transaction
        //AccountBalance=0
        //your balance is 0
        //if your balance less than transaction "you dont have enough balance"


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your balance ");
        int balance=input.nextInt();

        while (balance>0){
            System.out.println("Please enter your transaction ");
        int transaction=input.nextInt();
        if(balance<transaction){
            System.out.println("Hey you dont have enough balance to make this transaction . " +balance);
        }else{
            balance=balance-transaction;
            System.out.println("Your new balance is "+ balance);
        }


        }









    }

}
