package MyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CodeExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        //two number sum 3+5=8

        int number = 7;
        int number1 = 3;
        int sum = 0;
        sum += number + number1;
        System.out.println(sum);


        //int sayi1=1;
        //int sayi2=10;
        int toplam = 0;
        for (int i = 0; i <= 10; i++) {
            toplam += i;
        }
        System.out.println(toplam);


//        System.out.println("please enter two number");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int summ = 0;
//        summ = num1 + num2;
//
//        System.out.println(summ);

        int n;
        int summm = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                summm += i;
                System.out.print(summm +"-");
            }
        }
       //Factorial number
//        System.out.println("enter number ");
//        int num=input.nextInt();
//        int factnumber=1;
//        for(int i=num;i>=1;i--){
//            factnumber*=i;
//        }
//        System.out.println(factnumber);
        System.out.println();
        int numbr=4;
        int factorial=1;
        for(int i=4;i>=1;i--){
            factorial*=i;
        }
        System.out.println(factorial);

         int nu=4;
         factorial=1;
         for(int i=1;i<=4;i++){
             factorial*=i;
         }
        System.out.println(factorial);

         int nms=10;
         int fact=1;
         for(int i=nms;i>=1;i--){
             fact*=i;
         }
        System.out.println(fact);


        String name="yasemin";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);

        String isim=" Yunus Uslu";
        String rever="";
        for(int i=isim.length()-1;i>=0;i--){
            rever+=isim.charAt(i);
        }

        System.out.println(rever);

        int rakam=4;
        int fac=1;
        for(int i=rakam;i>=1;i--){
            fac*=i;
        }
        System.out.println(fac);

        String sname="Bera Erva Azra";
        String revr="";
        for(int i=sname.length()-1;i>=0;i--){
            revr+=sname.charAt(i);
        }

        System.out.println(revr);

        int a=23;
        int b=87;
        System.out.println(Math.max(a,b));

        int[]nums={6,-1,-2,-3,0,1,2,3,4,};
        Arrays.sort(nums);
        System.out.println("min number ="+nums[0]);
        System.out.println("max number="+nums[nums.length-1]);

        String upper="yasemin uslu";
        String result;
        result=upper.toUpperCase();
        System.out.println(result);
        result=upper.toLowerCase();
        System.out.println(result);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int first=input.nextInt();
        System.out.println("enter second number");
        int second=input.nextInt();
        for(int i=first;i<=second;i++){

        }
        System.out.println("list of prime number");






    }
}