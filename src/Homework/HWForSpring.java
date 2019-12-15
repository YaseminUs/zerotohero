package Homework;

import java.util.Scanner;

public class HWForSpring {
    public static void main(String[] args) {
        //the user enter the number of year from console
        //considering one sprint in 2 week in the company
        //write the program to find total sprint with in entered year
        //and print number of sprint at the end

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your year");
        int year = input.nextInt();
        int sprint = (year * 52) / 2;

        for (int i = 2; i <= sprint; i++) {
            System.out.println(i + " sprint at the end ");
        }

        System.out.println("total sprinti : " + sprint );

            }
        }


