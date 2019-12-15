package ScannerPackage;

import java.util.Scanner;

public class StringScannerPractice {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please provide exam result");
        int exam1=input.nextInt();
        int exam2=input.nextInt();
        int exam3=input.nextInt();
        int averagescore=(exam1+exam2+exam3)/3;
        System.out.println("Average Score is" +averagescore);
        System.out.println("Student attended all the classes");
        boolean attended=input.nextBoolean();
        System.out.println("Completed assignment");
        int complitedAssignment=input.nextInt();
        //avaragescore>70 && attended=true  && completedAssigmnet>=
        boolean result=averagescore>=70&&attended==true && complitedAssignment>=6;
        System.out.println("Studnet take classes from next semester?" +result);


        // you need to enter 3 different exam result 70,45,90
        // if average is equals to 70 or more than 70
        // Student should attend all the classes
        //Student should complete at least 6 assignment
        //Student is able to go to next semester or not
//        System.out.println("How many exams the student attend?");
//        int exam1=input.nextInt();
//        int exam2=input.nextInt();
//        int exam3=input.nextInt();
//        System.out.println("Average result is");
//        int avarageresult=exam1+exam2+exam3%3;
//        System.out.println(avarageresult);
//        System.out.println("Student did attend all the classes" );
//
//        boolean attend=input.nextBoolean();




    }
}
