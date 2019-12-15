package IfStatements;

import java.util.Scanner;

public class NestStatementAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //phone price 1000
        //user entered 700
        //please enter the rest of money
        //you go to bestbuy
//you wanna buy a phone
// to be able to buy this phone you need to pay 1000$
//if the user enter enough amount than user can buy the phone
//if not enter correct amount ask to user to rest of the  money amount
//BestBuy
//if user enters 1000 or more user can buy
// if user enters less than 1000 ask user for the rest of the money
//please enter 300 more

        double phonePrice = 1000;
        System.out.println("Please make the payment " + phonePrice);
        double paymentAmount = input.nextDouble();
        if (paymentAmount >= phonePrice) {
            System.out.println("You can buy the phone");
        } else if (paymentAmount < phonePrice) {
            double restAmount = phonePrice - paymentAmount;
            System.out.println("Please enter rest of the money " + restAmount);
            double restPayment = input.nextDouble();
            if (restPayment >= restAmount) {
                System.out.println("you can buy the phone");
            } else {
                System.out.println("you can not buy the phone");

            }
        }
    }
}

