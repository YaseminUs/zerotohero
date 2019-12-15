package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoopPractice {


    public static void main(String[] args) {

        int totalnumber=4;
        do{
            System.out.println("Yasemin");
            totalnumber--;
        }while (totalnumber>0);



        //print number between giving two values.
        //scanner
        //30----45
        //30, 31,.....45
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you balance");
        int balance=input.nextInt(); // 30-2 = 28
        int count=1;
        while(balance>=2){
            balance=balance-2;
            System.out.println(count+" times Card used");
            count++;





        }
    }
}














