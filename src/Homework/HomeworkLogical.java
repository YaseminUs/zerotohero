package Homework;

import java.util.Scanner;

public class HomeworkLogical {
    private static Scanner input;
    public static void main(String[] args){

        //1-(!true)==>false
        //2-(5+4 < 3 && 7+3 <  ==> false
        //3-('a'!='b'-1)==>97=98 false
        //4-( ! (7 == 7 ))==>false
        //5-( 3 % 2 )==>1
        //6-( !1 || !0 )==>true
        //7-('a'==97)==>true
        //int lettera=97;
        //char ch=(char)lettera;
        //System.out.println(ch);
        //8-int x=4, int y=3==>true
        //int x=4;
        //int y=3;
        //boolean total=x>y;//true
        //boolean total1=x<y;//false
        //boolean total2=x==y;//false
        //System.out.println(total);
        //System.out.println(total1);
        //System.out.println(total2);

        //8- !(x<5 && y==3); false
        //8- !(x>=1||y!7); false

        //int x=4;
        //int y=3;

        //boolean summary=!(x<5&&y==3);//==>false
        //boolean summary1=!(x>=1||y!7);//==>compile error
        //System.out.println(summary);
        //System.out.println(summary1);

//Scanner input=new Scanner(System.in);
        //System.out.println("What is first number");
        //int number1=input.nextInt();
        // System.out.println("What is second number");
        // int number2=input.nextInt();
        // int sum=number1+number2;
        //System.out.println("The sum of 2 numbers are "+sum);


        //System.out.println("What is a Length of rectangle");
        // double length=input.nextDouble();
        //System.out.println("What is a width of rectangle");
        //double breadth=input.nextDouble();
        // int area=(int)(length*breadth);
        //System.out.println("The area of rectangle "+area);


        System.out.println("Are they equal ? ");


        System.out.println("first entery ");
        String fe= input.nextLine();

        System.out.println("second entery ");
        String se=input.nextLine();

        System.out.println("third entery ");
        String te=input.nextLine();

        boolean summary=fe.equals(se) && se.equals(fe) && fe.equals(te);
        System.out.println(summary);













    }
}
