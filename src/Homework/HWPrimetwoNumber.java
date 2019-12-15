package Homework;

import java.util.Scanner;

public class HWPrimetwoNumber {
    public static void main(String[] args) {
        //Using scanner enter two number 1 - 100.
        // Print all prime number between 1 to 100.
        // Prime number is the number which can be divided only with 1 and with itself.
        // For example 7 is prime number because, it is only only divide with 1 and 7.
        Scanner input = new Scanner(System.in);
        //if (number % number == 0 && number % 1 == 0) --> bu prime numbers verir
//        System.out.println(" Prime Numbers from 1 to 100 are : " + " enter two number");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        //int count = 0;

        System.out.println(" Prime Numbers from 1 to 100 are : ");

        if (number1 % 1 == 0 && number1 % number1 == 0) {
            while (number1 <= number2) {
                System.out.println("number divided  " + number1);

            }
            number1++;
        }

    }
}





















        //
//            while (number1 <= number2/2)}

//            if ( number1 % number1 == 0 && number1 % 1 == 0) ;
//                        count++;
//
//                System.out.println(number1 );
//
//                while (number1 <= number2) {
//
//
//
//                }
//                    System.out.println(count );


//            int i, number = 1, count;
//
//            System.out.println(" Prime Numbers from 1 to 100 are : ");
//            while(number <= 100) {
//                count = 0;
//                i = 2;
//                while (i <= number / 2) {
//                    if (number % i == 0) {
//                        count++;
//                        break;
//                    }
//                    i++;
//                }
//                if (count == 0 && number != 1) {
//                    System.out.print(number + " ");
//                }
//                number++;
//
//
//            }


//                  while(a <= number / 2)
//                    {
//                    if(number%a==0)
//                    /int num1=10;
//                    int num2=15;
//                    while(num1<=num2){
//
//                    if(num1%2==0){
//                    System.out.println(num1);
//                    }
//                    num1++;
//
//                    int count=0;
//                    while(number>2){
//                    number=number/2;
//                    count=count+number;
//                    }
//                    System.out.println(count);
//





