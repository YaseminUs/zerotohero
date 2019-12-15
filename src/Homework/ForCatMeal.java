package Homework;

import java.util.Scanner;

public class ForCatMeal {
    public static void main(String[] args) {

        //my total number of cat meal 50kg.
        //i have total 3 cat. considiring every cat is eating 0.5kg in a day.
        //write the program to find how many days i can use this cat meal?

        int catmeal=50;
        int cat=3;
        double eat=0.5;
        int sum=0;
        for(int i = 50; i>3 ;i++){
        double total=cat*eat;
        double days=catmeal/total;
            System.out.println("they eating is " + days);
            break;
       }


//        Scanner input=new Scanner(System.in);
//        System.out.println("please enter number of 50 kg meal bag ");
//        double bag=input.nextDouble();
//        double total=bag*50;
//        System.out.println((int)(total/1.5) + "days you can feed them ");
//
//




    }

}
