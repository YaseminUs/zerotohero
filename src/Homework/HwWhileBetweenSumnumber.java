package Homework;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class HwWhileBetweenSumnumber {
    public static void main(String[] args) {
        //Write the program to find out sum of number between two input number.
        // For example: The user enter two number 10 and 15.
        // Using While loop find the sum of the number between 10 and 15.
        // Sum of this number is = 10 + 11 + 12 + 13 + 14 + 15 = 75

        Scanner input = new Scanner(System.in);
        //System.out.println("please enter the number ");

//        int number1=input.nextInt();
//        int number2=input.nextInt();
//        int sum=0;
//        while(number1<=number2){
//
//        sum=sum+number1;
//            number1++;
//
//
//
//        }System.out.println("sum "+sum );

        System.out.println("print number ");
        int firstnumber = 30;
        int secondnumber = 20;
        while (firstnumber >= secondnumber) {

            System.out.println(firstnumber);
            firstnumber--;


        }
    }
}