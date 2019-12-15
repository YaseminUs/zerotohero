package IfStatements;

import java.util.Scanner;

public class TASKStudentGrade {
    public static void main(String [] args){

        //grade A
        //Using scanner enter average score
        //once you enter average score you need to print the grade for average score
        //>=80 - 100 Grade A
        //>=60 - 80 Grade B
        //>=40 - 60 Grade C
        //>=20 - 40 Grade D
        //>=0 - 20 Grade F

        Scanner input=new Scanner(System.in);
        System.out.println("please enter average score is : ");
        int averageScore=input.nextInt();
        if(averageScore>=80 && averageScore <=100) {
            System.out.println("your score is A ");
        }else if (averageScore>=60 && averageScore <=80) {
            System.out.println("your score is B ");
        }else if (averageScore >= 40 && averageScore <= 60) {
            System.out.println("your score is C ");
        }else if (averageScore >= 20 && averageScore <= 40) {
            System.out.println("your score is D ");
        }else if (averageScore >= 0 && averageScore <= 20) {
            System.out.println("your score is F ");

         } else {
            System.out.println("Score is not defined");

                        }
                    }
                }

