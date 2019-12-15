package IfStatements;

import java.util.Scanner;

public class ChaseBankPhoneApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the password for phone ");
        String passPhone = input.next();
        if (passPhone.equals("Tech2019")) {
            System.out.println("Please enter the password for Chase Bank ");
            String passChase = input.next();
            if (passChase.equals("Panda2400")) {
                System.out.println("Welcome to Chase Application ");
            } else {
                System.out.println("Please try again");
            }
         }else{
            System.out.println("please enter phone password");
        }

    }
}