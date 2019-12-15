package IfStatements.HW;

import java.util.Scanner;

public class HWLeapYear {

    public static void main (String[] args){
       // Homework 1-LEAP
        // YEARCheck that giving year is leap year or not.
        // If the year is leap year print leap year
        // if it is not leap year print not leap year.
        // How do you find giving year leap year or not?
        // •Once you divide the year with 4 remainder should be 0.
        // •Once you divide with 100 remainder should not be 0.
        // •Or once you divide with 400 remainder of the value is equals to 0 it is also leap year.


        Scanner input=new Scanner(System.in);
        int year;
        System.out.println("Enter a year ");
        year=input.nextInt();
        if((year % 4==0) && (year %100!=0) ||(year %400 ==0)) {
            System.out.println("Check that giving year is leap year ");
        } else{
            System.out.println("Check that giving year is not leap year ");
        }









    }
}
