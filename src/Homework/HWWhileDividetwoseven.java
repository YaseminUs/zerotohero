package Homework;

import java.util.Scanner;

public class HWWhileDividetwoseven {
    public static void main(String[] args) {
        //Using scanner enter two number 1 - 100.
        // Print all the numbers between 1 to 100 which we can divide with 2 and 7 at the same time.
        // For example 14 is this kind number

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        //int count=0;
        while (number1 <= number2) {
            if (number1 % 2 == 0 && number1 % 7 == 0) {

                System.out.println("number divided by 2 and 7 " + number1);

            }number1++;
        }
    }
}
//number % number == 0 && number % 1 == 0