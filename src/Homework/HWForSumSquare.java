package Homework;

import java.util.Scanner;

public class HWForSumSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to determine term range");
        int t=input.nextInt();
        int sum=0;
        int sq =1;
        //System.out.print("Terms are = ");
        for (int i=1; i<=t;i++){
            sq=i*i;
            System.out.println("The square of "+i+ " is "+sq);
            sum+=sq;
        }
        System.out.println();
        System.out.println("The sum of squares of terms is "+sum);


    }
}