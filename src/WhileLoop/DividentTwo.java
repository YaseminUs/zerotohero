package WhileLoop;

import java.util.Scanner;

public class DividentTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number ");
        int number=input.nextInt();
        int count =0;

        while(number>0){
            number=number/2;
            count=count+number;
        }
        System.out.println(count);


        //i have blueline card,35$
        //every ride is 2$
        //how many times use my blueline card
        //everytime print
        //1 card used
        //2 card used
        //3 card used

       int card=input.nextInt(); //30
       int ride= 1;
       while(card>=2){
        card=card-ride;
           System.out.println(count+ " times card use ");


       }















    }
}
