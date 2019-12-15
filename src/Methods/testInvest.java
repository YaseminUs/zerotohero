package Methods;

import java.util.Scanner;

public class testInvest {
    public static void main(String[] args) {

        Investment Investment=new Investment();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an amount: ");
        Investment.amount=input.nextDouble();
        System.out.println("Please enter number of years you want to invest: ");
        Investment.years=input.nextDouble();
        System.out.println("Please eneter the rate: ");
        Investment.rate=input.nextDouble();
        System.out.println("Your total will be " +Investment.totalAmount()+" in " +Investment.years+" years");
    }
}