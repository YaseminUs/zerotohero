package IfStatements.HW;

import java.util.Scanner;

public class HWHighSchooolAcceptance {
    public static void main(String[] args) {

        //Please provide following values using Scanner.
        // Age, City, Average Score(double), citizenship
        // TO be able to attend the classes in the Schaumburg High school
        // •Person age should be more than 14 years old
        // •The family should be living in Schaumburg
        // •Average Elementary school score should be more than 75
        // •The student should be US citizen
        // .Print “student can attend the classes” if conditions are true
        // Print “student can not attend the classes” if condition are not true

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age ? ");
        int age = input.nextInt();
        System.out.println("Do you living Schaumburg ? ");
        boolean city = input.nextBoolean();
        System.out.println("What is your avarage score ? ");
        double avescor = input.nextDouble();
        System.out.println("are you an US citizenship ? ");
        boolean citizenship = input.nextBoolean();
        if (age >= 14 && city == true && avescor >= 75 && citizenship == true) {
            System.out.println("student can attend the classes ");
        } else {
            System.out.println("student can not attend the classes ");

        }
    }
}