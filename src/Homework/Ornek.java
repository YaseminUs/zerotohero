package Homework;

import java.util.Scanner;

public class Ornek {
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);

//        System.out.println("enter random word ");
//        String randomWord=input.nextLine();
//        System.out.println("input number of letter");
//        int number=input.nextInt();
//        boolean correctNumber=number==randomWord.length();
//        System.out.println("enter right number of letter " +correctNumber );
//        System.out.println("find index of");
//        String letter=input.next();
//        System.out.println("The index of letter you asked is " + randomWord.indexOf(letter));

//        System.out.println("please provide your enter word ");
//        String enterword=input.nextLine();
//        System.out.println("enter number of letter ");
//        int numLetter=input.nextInt();
//        boolean correctnum=numLetter==enterword.length();
//        System.out.println("enter right number of letter "+ correctnum);
//        System.out.println("find index of ");
//        String Letter=input.next();
//        System.out.println("the index of lettere you ask is " + enterword.indexOf(Letter));


        //System.out.println(patientInfo.substring(5,11));
        //String value=input.nextLine();
        //value=value.trim();
        //System.out.println(value.substring(7));
        //System.out.println(value.trim());
        //System.out.println(value.replace("Zero", "One"));
        //System.out.println(value.toUpperCase());
        //System.out.println(student.toLowerCase());
        //System.out.println(value.equalsIgnoreCase("zero to hero"));
        //String company="TransUnion";
        //System.out.println(company.equals("transUnion"));//false
        //System.out.println(company.equalsIgnoreCase("transunion"));//true
        // String city="Des Plaines ";
        //        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());
        //        System.out.println(city.indexOf("P"));
        //        System.out.println(city.contains("ines"));
        //        System.out.println(city.endsWith(" "));
        //        System.out.println(city.startsWith("De"));
        //        System.out.println(city.substring(4, 7));
        //        System.out.println(city.charAt(0));
        //        System.out.println(city.length());
        //        System.out.println(city.charAt(city.length()-1));
        //        System.out.println(city.toUpperCase());
        //        System.out.println(city.toLowerCase());
        //        System.out.println(city.trim());
        //        System.out.println(city.replace("Des" ,"One"));
        //        System.out.println(city.equalsIgnoreCase("des plaines"));

//        System.out.println("What is your favorite restaurant ? ");
//        String restaurant=input.nextLine();
//        System.out.println(restaurant.trim());
//        System.out.println(restaurant.substring(3,8));
//        System.out.println(restaurant.indexOf("e"));
//        System.out.println(restaurant.contains("era"));
//        System.out.println(restaurant.endsWith(" "));
//        System.out.println(restaurant.startsWith("pa"));
//        System.out.println(restaurant.length());
//        System.out.println(restaurant.charAt(5));
//        System.out.println(restaurant.charAt(restaurant.length()-1));
//        System.out.println(restaurant.toUpperCase());
//        System.out.println(restaurant.toLowerCase());
//        System.out.println(restaurant.trim());
//        System.out.println(restaurant.replace("Pan", "San"));
//        System.out.println(restaurant.equalsIgnoreCase("Panera Bread"));

        //Book from amazon (OSA)
        //using scanner you need input the star, review number, price book
        // equals 5 more than  5star , more 100 review , price should be less 20$
        //if your conditions is trus print I can buy the OSA Book
        //else print i can not buy the BOOK

//         System.out.println("please provide the star rate ");
//         int StarRate=input.nextInt();
//         System.out.println("please provide the review ");
//         int reviewNumber=input.nextInt();
//         System.out.println("please provide the book price ");
//         int BookPrice=input.nextInt();
//
//         if(StarRate >= 5 && reviewNumber >=100 && BookPrice < 20 ){
//             System.out.println(" I can buy OCA book ");
//         }else{
//             System.out.println("I can not buy Book ");
//         }


        //inputs are using scanner
        //Driver licence example
        //age more tahn or equal 16
        //exam score more than or equal 70
        //state id
        //driving practice should pass
        //this condition true you can get the driver licesce
        //this condition false you can get the driver licesce


//        System.out.println(" How old are you ");
//        int age=input.nextInt();
//        System.out.println("What is your exam score ");
//        int examscore=input.nextInt();
//        System.out.println("Do you have a state id ");
//        boolean StateId=input.nextBoolean();
//        System.out.println("Did you pas the diriving test ");
//        boolean DrivingTest=input.nextBoolean();
//        if(age>= 16 && examscore>=70 && StateId==true && DrivingTest == true ){
//            System.out.println("I can get the driver licence ");
//        }else{
//            System.out.println("I can not get the driver licence");
//
//        }


        //Please provide following values using Scanner.
        // Age, City, Average Score(double), citizenship
        // TO be able to attend the classes in the Schaumburg High school
        // •Person age should be more than 14 years old
        // •The family should be living in Schaumburg
        // •Average Elementary school score should be more than 75
        // •The student should be US citizen
        // .Print “student can attend the classes” if conditions are true
        // Print “student can not attend the classes” if condition are not true

        System.out.println("How old are you ? ");
        int age=input.nextInt();
        System.out.println("Are you living in Schaumburg ? ");
        boolean city=input.nextBoolean();
        System.out.println("What is average score is ? ");
        int averageScore=input.nextInt();
        System.out.println("are you an US citzen ? ");
        boolean citizen=input.nextBoolean();
        if(age >= 14 && city && averageScore >75 && citizen ){
            System.out.println("student can attend the classes ");
        }else{
            System.out.println("student can not attend the classes");

        }




        }

}
