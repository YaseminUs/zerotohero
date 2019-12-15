package IfStatements.HW;

import java.util.Scanner;

public class HWShoppingApplication {
    public static void main(String[] args){


        //Using scanner buy three different product and enter number of product.
        // for example (tomatoes , Cucumber, Carrot and Eggplants)
        //One tomatoes price is 1$.
        //One Cucumber price is 0.50 cent
        // One Carrot price is 0.25 cent
        // One Eggplant price is 2$
        // If total price for purchase is more than 10$ you need to apply 10 percent discount and I need to pay 9$.
        // If total price for purchase is less than 10$ don’t apply any discount.
        // EXAMPLE INPUT and OUTPUT -1
        // Please enter number of Tomatoes 5
        // Please enter number of Cucumber 6
        // Please enter number of Carrot 8
        // Please enter number of Eggplant 4
        // You need to pay = 16.2 $ (NOTE: 10 percent discount applied because price more than 10$)

           Scanner input=new Scanner(System.in);

        System.out.println("please enter number of tomato ");
        double tomato=input.nextDouble();
        System.out.println("please enter number of cucam ");
        double cucam=input.nextDouble();
        System.out.println("please enter number of carro ");
        double carro=input.nextDouble();
        System.out.println("please enter number of eggp ");
        double eggp=input.nextDouble();
        double totalP=(tomato*1)+(cucam*0.50)+(carro*0.25)+(eggp*2);
        System.out.println("total price" +totalP);









//
//        System.out.println("please provide number of Tomatoes");
//        double Tomatoes=input.nextDouble();
//        System.out.println("please provide number of Cucumber");
//        double Cucumber=input.nextDouble();
//        System.out.println("please provide number of Carrot");
//        double Carrot=input.nextDouble();
//        System.out.println("please provide number of Eggplant");
//        double Eggplant=input.nextDouble();
//        double totalprice=(Tomatoes * 1) +(Cucumber * 0.50) +(Carrot * 0.25) + (Eggplant * 2);
//        System.out.println(totalprice);
//        //double result=totalprice -(totalprice*0.10);
//        //System.out.println("What is my result after discount ? " + result );
//
//        if(totalprice >10 ){
//             totalprice = totalprice - totalprice*0.10;
//            System.out.println("I pay total price with discount " + totalprice );
//         }else{
//            System.out.println("I dont get any discount " + totalprice );

           
        }


        }












