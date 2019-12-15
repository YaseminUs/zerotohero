package Methods;

import java.util.Scanner;

public class testEvenOdd {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("please enter your number ");
        int number=input.nextInt();
        EvenOdd evenOdd=new EvenOdd();
        System.out.println("your number is Even: "+ evenOdd.isEven(number));
        System.out.println("your number is Odd: "+ evenOdd.isOdd(number));


    }
}
