package Switch;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        //write codu to print out name of the day
        // 0 - Sunday
        // 1 - Monday
        // 3 - Tuesday
        // 4 - wednesday
        // 5 - Thursday
        // 6 - Friday
        // 7 - Saturday

        Scanner input = new Scanner(System.in);
//        int dayNumber=input.nextInt();
//        switch (dayNumber){
//
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
            //  deafult:
       // System.out.println("the value is not matching");
//
//
//        }


        String fruits = input.nextLine();
        switch (fruits) {

            case "Strawberry":
                System.out.println("Matching value a Strawberry");
                break;
            case "Cranberry":
                System.out.println("Matching value a Cranberry");
                break;
            case "Chocolate":
                System.out.println("Matching value a Chocolate");
                break;
            case "Banana":
                System.out.println("Matching value a Banana");
                break;
            default:
                System.out.println("Matching value is not matching");


        }
    }
}