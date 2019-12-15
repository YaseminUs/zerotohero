package IfStatements;

import java.util.Scanner;

public class ifBESTBUY {
    public static void main(System[]args){

//you go to bestbuy
//you wanna buy a phone
// to be able to buy this phone you need to pay 1000$
//if the user enter enough amount than user can buy the phone
//if not enter correct amount ask to user to rest of the  money amount
//BestBuy
//if user enters 1000 or more user can buy
// if user enters less than 1000 ask user for the rest of the money
//please enter 300 more
//the person can buy the phone

        Scanner input=new Scanner(System.in);
        System.out.println("please provide enter price of the phone ");
        int phonePrice=input.nextInt();
        System.out.println("please provide buyer budget");
        int budget=input.nextInt();
        if (budget>=1000) {
            System.out.println("user can buy the phone");
        }else if(budget<1000){
            int restofmoney=1000-budget;
            System.out.println("user pays rest of money" + restofmoney);
        }else{
            System.out.println("buyer do not buy phone");
        }
    }
}
