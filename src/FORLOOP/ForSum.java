package FORLOOP;

import java.util.Scanner;

public class ForSum {
    public static void main(String[] args) {
        Scanner input=new Scanner((System.in));
//        System.out.println("please enter the number");
//        int number1=input.nextInt();
//
//        int sum=0;
//        for(int i=0;i<=5;i++){
//            sum=sum+number1;
//        }
//            System.out.println(sum);
//
//
//        int[] numbers = {1,2,3,4};//------sum
//        int summm = 0;
//        for( int i : numbers) {
//            summm += i;
//        }
//
//        System.out.println(sum);
//
//        System.out.println("please enter your number ? ");
//        int number=input.nextInt();
//        int summ=0;
//        for(int i=0;i<=5;i++){
//            summ+=number;
//        }
//        System.out.println(summ);


        System.out.println("please enter two digit number");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int toplam=0;
        toplam=sayi1+sayi2;
        System.out.println(toplam);

        int min= 3;
        int max=6;
        int total=0;
        for(int i=3;i<=6;i++){
            total+=i;
        }
        System.out.println(total);
    }
}
