package MyPractice;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println(("please enter your number"));
        int number=input.nextInt();
        int count=1;
        while (number>=1){

            count=count*number; //count*5
            System.out.println("my last number " + count);
            number--;
        }










    }
}
