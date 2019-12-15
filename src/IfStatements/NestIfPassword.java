package IfStatements;

import java.util.Scanner;

public class NestIfPassword {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have passport");
        boolean passport=input.nextBoolean();
        if (passport){
            System.out.println("Do you have a ticket?");
            boolean ticket=input.nextBoolean();
            if (ticket){
                System.out.println("You can come to the USA 1");
            }else{
                System.out.println("You can not come to the USA 2");
            }
        }else{
            System.out.println("You can not come to the USA 3");
        }
    }
}





