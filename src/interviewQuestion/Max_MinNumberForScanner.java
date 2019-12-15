package interviewQuestion;

import java.util.Scanner;

public class Max_MinNumberForScanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//        System.out.println("How many number would you like the enter");
//        int totalnumber = sc.nextInt();
//        System.out.println("enter number "+ totalnumber+ " times ");
//        int firstnumber = sc.nextInt();
//
//        for(int i=0;i<totalnumber-1;i++){
//            int secondnumber = sc.nextInt();
//            if(secondnumber>firstnumber){
//                firstnumber=secondnumber;
//            }
//        }
//        System.out.println(firstnumber);//max number
//
//
//          System.out.println("How many number would you like the enter ");
//        int tnumbers = sc.nextInt();
//        System.out.println("enter number " + tnumbers + "times ");
//        int first = sc.nextInt();
//        for (int i = 0; i < tnumbers - 1; i++) {
//            int second = sc.nextInt();
//            if (second < first) {
//                first = second;
//
//            }
//
//        }System.out.println(first);//min number

        System.out.println("How many number do you want enter ? ");
        int totalnum = sc.nextInt();
        System.out.println("enter number "+ totalnum + " times");
        int firstnum = sc.nextInt();
        for(int i=0;i<totalnum-1;i++){
            int secondnum = sc.nextInt();
            if(secondnum>firstnum){  //====>more than--max number
                firstnum=secondnum;
            }
        }
        System.out.println(firstnum+ " max number");

        System.out.println("toplam sayi : ");
        int toplam = sc.nextInt();
        System.out.println("kere "+ toplam);
        int birinci = sc.nextInt();
        for(int i=0;i<toplam-1;i++){
            int ikinci = sc.nextInt();
            if(ikinci<birinci){  //===>less than min number
                birinci=ikinci;
            }
        }
        System.out.println(birinci+ " min number");



    }
}
