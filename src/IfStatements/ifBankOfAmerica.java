package IfStatements;

import java.util.Scanner;


public class ifBankOfAmerica {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the username ");
        String username=input.next();
        if(username.equals("yasemin")){
            System.out.println("Please enter the Pasword ");
            String Password=input.next();
         if(Password.equals("DesPLaines21")) {
             System.out.println("Please enter the Captcha ");
             String captcha=input.next();
         if (captcha.equals("bean")){
             System.out.println("Welcome the the bank of America ");
         }else{
             System.out.println("Captca is wrong");
         }
         } else{
             System.out.println("Password is wrong");
         }
         }else{
            System.out.println("Username is wrong");
        }
        }
        }


