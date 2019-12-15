package Exception;

import java.util.Scanner;

public class RuntimeEx {
    public static void main(String[] args) {

        int []number = {5,3,4,};

        System.out.println(number[2]);//what is the index number 2 [4]

        try{
            System.out.println(number[3]);
        }catch(Exception e){  //Throwable
            System.out.println("This code throws exception");
        }
        System.out.println(number[1]);


        // Arithmetic Exception

        Scanner input  = new Scanner(System.in);
        System.out.println("Hey enter two number you want to divide");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try{
            System.out.println(num1/num2);
        }catch(ArithmeticException e){  //Exception super class
            System.out.println("you can not divide by zero");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
        System.out.println("you code is finished");

        String name = null;

        try{
           name.toUpperCase();
        }catch(NullPointerException e){
           System.out.println("It is exception");
        }

    }
}
