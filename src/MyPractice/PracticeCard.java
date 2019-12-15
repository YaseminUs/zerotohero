package MyPractice;

import java.util.Scanner;

public class PracticeCard {
    public static void main(String[] args) {


        //you have one plate of meal
        //if you take 10 spoon, you finished your meal
        //Print every spoon of meal you take

        int spoonNumber=1;
        while(spoonNumber<=10){
            System.out.println(spoonNumber + "spoon ");
            spoonNumber++;
        }

        int mealnumber=1;
        while (mealnumber<=10){
            System.out.println(mealnumber + "meal");
            mealnumber++;
        }
        //40$ in my phone account
        //every call 5$ how many i can call
        //i can call

        int totalAmount=40;
        int call=5;
        while (totalAmount>=0){
            totalAmount=totalAmount-5;
            System.out.println("i can call " + totalAmount);
        }

        //I wanna print my name 5 times

        int repeatnumber=5;
        int currentnumber=1;
        while(currentnumber<=5){
            System.out.println("yasemin ");
            currentnumber++;
        }

        int phoneAccount=55;
        int pay=5;
        while (phoneAccount>=0){
            phoneAccount=phoneAccount-5;
            System.out.println("I can call "+phoneAccount+ "times ");
            phoneAccount++;
        }

        int tekrarsayi=3;
        int baslamasayisi=0;
        while (baslamasayisi<3){
            System.out.println("Yasemin");
            baslamasayisi++;
        }

        int i=10;
        while (i<=10){
            System.out.println("times"+i);
            i++;
        }
        int e=1;
        do{
            System.out.println(e);
            e++;
        }while(e<=10);{

        }





    }
}
