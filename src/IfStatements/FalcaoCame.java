package IfStatements;

import java.util.Scanner;

public class FalcaoCame {

    public  static void main(String [] args){

        Scanner input=new Scanner(System.in);



        //int galBudget=2000000;
        //int playerSal=5000000;


        // first Galatasaray should pay 3mil to the Club
        // Gal should pay 5 mil to Falcao


//        System.out.println("Please enter the Galatasaray Budget");
//
//        int galBudget=input.nextInt();
//
//        System.out.println("Please enter Player Salary");
//
//        int playerSal=input.nextInt();
//
//        if(galBudget==3000000 && playerSal==5000000){
//            System.out.println("Falcao can come to the Galatasaray");
//
//        }else{
//            System.out.println("Falcao can not come to the Galatasaray");
//        }

        //Microphone from amazon (toner Dynamic Karaoke)
        //using scanner you need input the star, review number, price mic
        // equals 4 more than  4star , more 100 review , price should be less 20$
        //if your conditions is trus print I can buy the TONOR MIC
        //else print i can not buy the TONOR.




        System.out.println("enter product stars rate : ");
        int starRate=input.nextInt();
        System.out.println("enter product review number : ");
        int review=input.nextInt();
        System.out.println("enter product price : ");
        int price=input.nextInt();
        if(starRate>=4 && review>=100 && price<=20){
            System.out.println("I can buy the product : ");
        } else {

        }





    }
}
