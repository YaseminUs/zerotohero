package Homework;

import java.util.Scanner;

public class HWStracturetree {
    public static void main(String[] args) {
           //Print following structure in java using loop.
           // *
           // ***
           // *****
           // ***
           // *


        Scanner input=new Scanner(System.in);

        int number=5;
        int i=0;
        String star="*" ;

         while(i==0 && i<number) {
             System.out.println(star);
             i++;
             System.out.println("*" + star);
             star=star+"*";



//
         }

    }
}
