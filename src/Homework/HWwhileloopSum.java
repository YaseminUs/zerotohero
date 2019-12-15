package Homework;

import java.util.Scanner;

public class HWwhileloopSum {
    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println(" please enter two numbers");
        int number1=input.nextInt();
        int number2=input.nextInt ();
        int sum =0;
        while (number1<= number2 ) {
            sum = sum+ number1 ;
            number1++;
        }
        System.out.println(sum);

    }
}






