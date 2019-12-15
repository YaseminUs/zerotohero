package FORLOOP;

import java.util.Scanner;

public class calisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Ya249756semi54655n45";
        for (int i = 0; i <= name.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name.charAt(i) == ch) {
                    System.out.print(ch + "-");
                }
            }
        }
        System.out.println();

        String name2 = "guwgqry87y4734vbh78";
        for (int i = 0; i <= name2.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name2.charAt(i) == ch) {
                    System.out.print(ch + "-");
                }
            }
        }

        System.out.println();
        String name3 = "yu76863459nu989047694s";
        for (int i = 0; i <= name3.length() - 1; i++) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name3.charAt(i) == ch) {
                    System.out.print(ch + "-");
                }

            }
        }
        System.out.println();
        String name4 = "Ya249756semi54655n45";
        for (int i = name4.length() - 1; i >= 0; i--) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name4.charAt(i) == ch) {
                    System.out.print(ch + "-");
                }
            }
        }
        System.out.println();
        String name5 = "guwgqry87y4734vbh78";
        for (int i = name5.length() - 1; i >= 0; i--) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name5.charAt(i) == ch) {
                    System.out.print(ch + "-");
                }
            }
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        int lenght = 3;
        int wide = 6;
        int sum = 0;
        for (int i = 3; i < 6; i++) {
            sum = (lenght + wide) * 2;
        }
        System.out.println(sum);
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println("yasemin");
        }

        String Name = "Yasemin";
        String reverse = "";
        for (int i = Name.length() - 1; i >= 0; i--) {
            reverse = reverse + Name.charAt(i);
        }

        System.out.println(reverse);

        String bane = "Yunus Uslu";
        String revers = "";
        for (int i = bane.length() - 1; i >= 0; i--) {
            revers += bane.charAt(i);

        }
        System.out.println(revers);

        String nemess = "Bera Erva Azra";
        String rever = "";
        for (int i = nemess.length() - 1; i >= 0; i--) {
            rever += nemess.charAt(i);
        }

        System.out.println(rever);
//
//        System.out.println("enter number");
//        int number=input.nextInt();
//        if(number<=40 && number>=10){
//            System.out.println("is range");
//        }else{
//            System.out.println("is not range");
//        }
//        System.out.println("please enter number");
//        int age=input.nextInt();
//        if(age<=55 && age>=18){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//        System.out.println("plese anter number");
//    for(int i=1;i<=28;i++){
//        if(28%i==0){
//            System.out.println(i);
//        }
//    }
//
//        System.out.println(" enter number");
//    for(int i=1;i<=38;i++){
//        if(38%i==0){
//            System.out.println(i);
//        }
//    }
        // int limit = 100;

        System.out.println("Prime numbers between 1 and 100");

        //loop through the numbers one by one
        for (int i = 1; i < 100; i++) {
            boolean isPrime = true;

            //check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // print the number
            if (isPrime)
                System.out.print(i + " ");
        }

        System.out.println("2");
        int count=0;
        for(int i=1;i<100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
        if(count>0){
            System.out.print(i+ "is not prime number ");
        }else{
            System.out.print(i+ "is prime number ");
        }
        count=0;
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+ " * " + j + " = "+ i*j);
            }
        }

         for(int hour=3;hour<=6;hour++){
             System.out.println(hour);
             for(int mint=1;mint<=60;mint++){
                 System.out.print(mint + " ");
             }
             System.out.println();
         }
//
//        System.out.println("please enter number");
//         int number=input.nextInt();
//        System.out.println("enter "+ number + " times");
//        int first=input.nextInt();
//        for(int i=0;i<number-1;i++){
//            int second=input.nextInt();
//            if(second>first){
//                first = second;
//            }
//        }
//        System.out.println(first);

//        System.out.println("enter number which you want");
//         int num=input.nextInt();
//        System.out.println("enter "+ num +"times ") ;
//        int birinci=input.nextInt();
//        for(int i=0;i<num-1;i++){
//            int ikinci=input.nextInt();
//            if(ikinci>birinci){
//                birinci=ikinci;
//            }
//        }
//        System.out.println(birinci);
//0 1 1 2 3 5 8 13 21 34 55 89 144 233

       int bir=0;
       int iki=1;
       int toplam=0;
        System.out.println(bir + " " + iki );
       for(int i=1;i<13;i++){
           toplam=bir+iki;
          bir=iki;
          iki=toplam;

           System.out.print(toplam +" ");
       }
        System.out.println("------");
//        int num = 0;
//        int num2 = 1;
//        int loop;
//        int fibonacci;
//        System.out.print(num2);
//        for (loop = 1; loop <= 10; loop ++) {
//            fibonacci = num + num2;
//            num = num2;
//            num2 = fibonacci;
//            System.out.print(" " + fibonacci);
//        }
            int num=0;
            int num1=1;
            int summ=0;
        System.out.println(num+ " " + num1);
        for(int i=1;i<13;i++){
            summ=num+num1;
                    num=num1;
                    num1=summ;
            System.out.print(" " + summ);
        }
//        System.out.println();
//        System.out.println("enter number");
//        int number=input.nextInt();
//        int fact=1;
//        for(int i=number;i>=1;i--){
//            fact=fact*i;
//
//        }
//
//        System.out.println(fact);


//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) System.out.print(i + ", ");
//
//        }
//        System.out.print(" ");

        for(int i=1;i<100;i++){
            if(i% 2 == 0 && i% 7 == 0){
                System.out.println(i + " ,");
            }

         }

        for(int i=1;i<100;i++){
            if(i%3==0 && i%6==0 ){
                System.out.println(i+ " ,");
            }
        }

        int cube=5;
        int cube1=9;
        for(int i=5;i<=9;i++){
            if(i*i*i==0){
            sum+=i;

            }
        }
        System.out.println(sum);


        System.out.println("plese enter number");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
        }



    }
        }








