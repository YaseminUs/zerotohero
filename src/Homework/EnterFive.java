package Homework;

import java.util.Scanner;

public class EnterFive {
    public static void main(String[] args) {

   //  Using scanner user will enter the number of times. Write the program to print following
   //  starts as users input. For Example using scanner user entered number 5.
   //  if the user enter the another number like 7 then example output should be seven rows of starts
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your number ");
        int repeatNUmber=input.nextInt();
        int currentNumber=1;
        while (currentNumber<=repeatNUmber){
            System.out.println(" times");
            currentNumber++;
        }


        }
}

