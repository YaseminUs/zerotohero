package IfStatements;

import java.util.Scanner;

public class TASKSalesPerson {
    public static void main(String [] args) {
        //salesPerson
        //Base Salary = 400$

        //using scanner ask the how much they earne on the week
        //please enter for Monday 50
        //please enter for Tuesday 150
        //please enter for Wendsday 200
        //please enter for Thursday 250
        //please enter for Friday 300

        //you need to find how much they earn a week
        //total product price is more than 800$ they will get %5 comission
        //40$ +400$=450$  they will get paid.

        //if total sale is more than 800 apply 5% comission
        //if total sale is less than 800 do not apply comission and give the base salary

        //if total price for product is more 800
        //weeklyPayment=baseSalary+800*0.05
        // else
        //baseSalary
        // if total sale is more than = 800 and less 1000 commission 5
        // total sale is more than or equals to 1000 less than 1200 commission 7
        //  total sale is more than or equals to 1200 less than 1400 commission 9
        //  total sale is more than 1400 commission 11

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide what did you sell on Monday ");
        int firstday = input.nextInt();
        System.out.println("Please provide what did you sell on Tuesday ");
        int secondday = input.nextInt();
        System.out.println("Please provide what did you sell on Wednesday ");
        int Thirsday = input.nextInt();
        System.out.println("Please provide what did you sell on Thursday ");
        int Forthday = input.nextInt();
        System.out.println("Please provide what did you sell on Friday ");
        int Fifthday = input.nextInt();
        double totalprice = firstday + secondday + Thirsday + Forthday + Fifthday;
        double baseSalary = 400;
        double weeklypaymnet;
        if (totalprice > 800 && totalprice <1000) {
            weeklypaymnet = baseSalary + totalprice * 5 / 100;
            System.out.println(" Firtst payment is " + weeklypaymnet);
        } else if (totalprice >= 1000 && totalprice < 1200) {
            weeklypaymnet = baseSalary + totalprice * 7 / 100;
            System.out.println("Second payment is " +weeklypaymnet);
        } else if (totalprice >= 1200 && totalprice < 1400) {
            weeklypaymnet = baseSalary + totalprice * 9 / 100;
            System.out.println("Thirt Payment is " + weeklypaymnet);
        } else if (totalprice > 1400) {
            weeklypaymnet = baseSalary + totalprice * 11 / 100;
            System.out.println("Fourth payment is " + weeklypaymnet );

        } else{

            System.out.println("Total weekly payment is   "+ baseSalary);
        }


    }




    }



