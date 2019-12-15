package Homework;

import java.util.Scanner;

public class HWSquareNumber {
    public static void main(String[] args) {

        //write the program to print square of the numbers from 1 to 10,
        //and output should be exacly like following(4*4=16)
        //for example:
        //1*1=1, 2*2=4, 3*3=9, 4*4=16
        //Scanner input=new Scanner(System.in);

        int number1=1;
        int number2=10;
        int sum=0;

        for (int i=1; i<=10; i++){
            sum=i*i;
            System.out.println(i +"*" + i + "=" + sum );
        }


    }
}



