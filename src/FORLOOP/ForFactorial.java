package FORLOOP;

import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //using scanner i will enter the number;6!
        //6*5*4*3*2*1
        //find the factorial value of the number

        int numberr=input.nextInt();//6    //geri sayim
        for (int i = 6; i>=1; i--) {
            System.out.println(i);
        }

        System.out.println("PLease enter a number");
        int number=input.nextInt();
        int factorial=1;
        for (int i=number;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);

        int num=5;
        int fact = 1;
        for(int i=1;i<=5;i++){
            fact*=i;
        }
        System.out.println(fact);




    }

    }

