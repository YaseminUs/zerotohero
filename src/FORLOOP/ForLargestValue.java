package FORLOOP;

import java.util.Scanner;

public class ForLargestValue {
    public static void main(String[] args) {
//         TASK
//
//        Using Scanner I will ask user to
//        6
//        6 times enter the number
//        Please enter number
//        5  --
//        10 -- First
//        8 --
//        4 --
//        23  -- first
//        20  -- Second
//
//
//        Find the largest number and print it.


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the total Number which you want to enter");
        int totalNumber=input.nextInt();// 6
        System.out.println("Please enter number " +totalNumber+ " times");
        int firstNumber=input.nextInt();
        for(int i=0;i<totalNumber-1;i++){
            // this loop needs to run 5 times
            int secondNumber=input.nextInt();
            if(secondNumber>firstNumber){
                firstNumber=secondNumber;
            }
        }
        System.out.println(firstNumber);

        System.out.println("How many number would you like the enter ");
        int tnumbers = input.nextInt();
        System.out.println("enter number " + tnumbers + "times ");
        int first = input.nextInt();
        for (int i = 0; i < tnumbers - 1; i++) {
            int second = input.nextInt();
            if (second > first) {
                first = second;

            }

        }System.out.println(first);


        System.out.println("enter your number");
        int totalnumber = input.nextInt();

        System.out.println(totalNumber);
        int firstnumber = input.nextInt();

        for(int i=0;i<=totalNumber-1;i++){
            int secondnumber = input.nextInt();
            if(secondnumber>firstNumber){
                firstNumber=secondnumber;
            }
        }

        System.out.println(firstNumber);

    }
}

