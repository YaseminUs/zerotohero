package DoWhileLoop;

import java.util.Scanner;

public class DoWhileBetwenNumber {

    public static void main (String [] args){


        // print 10 number between giving two values. Giving values differences should more than 10
            // scanner   30-45
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter two numbers");
            int number1=input.nextInt();
            int number2=input.nextInt();
            do{
                System.out.println(number1);
                number1++;
            }while (number1<=number2);
        }
    }




