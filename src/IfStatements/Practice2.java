package IfStatements;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[]args){

        //inputs are using scanner
        //Driver licence example
        //age more tahn or equal 16
        //exam score more than or equal 70
        //state id
        //driving practice should pass
        //this condition true you can get the driver licesce
        //this condition false you can get the driver licesce




        Scanner input=new Scanner(System.in);
        System.out.println("what is your age ? ");
        int age=input.nextInt();
        System.out.println("what is your exam score ?  ");
        int examscore=input.nextInt();
        System.out.println("do you have state id ? ");
        boolean StateId=input.nextBoolean();
        System.out.println("did you pass the driver licence practice ? ");
        boolean driverTest=input.nextBoolean();
        if( age >= 16 && examscore >= 70 && StateId && driverTest){
            System.out.println("I can get a lisence");

        }else{
            System.out.println("Ican not get a Lisence");
        }

//        System.out.println("What is your age");
//        int age = input.nextInt();
//        System.out.println("What is your exam score? ");
//        int examscore = input.nextInt();
//        System.out.println("Do you have state Id");
//        boolean StateId = input.nextBoolean();
//        System.out.println("Did you pass the driver test");
//        boolean driverTest = input.nextBoolean();
//        if (age >= 16 && examscore >= 70 && StateId && driverTest){
//            System.out.println("I can get a lisence");
//        }else {
//            System.out.println("Ican not get a Lisence");






    }
}
