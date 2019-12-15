package Homework;

import java.util.Scanner;

public class HWDoWhileOilChange {
    public static void main(String[] args) {

        // Every three months, I am going to the oil change for my car.
        // Using Scanner Enter the number of years.
        // For example input is 3 year.
        // Considering 12 months in every year.
        // Print how many times I will go to the oil change
        //within three year.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of years ");
        int myyear=input.nextInt();
        int mounth=12*myyear/3;
        int count=1;

        do{

            System.out.println(count + " oil change ");
             count++;
        }while (count<=mounth);







    }
}
