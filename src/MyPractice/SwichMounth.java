package MyPractice;

import java.util.Scanner;

public class SwichMounth {
    public static void main(String[] args) {
        //Specifying month number  7
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of mounth ");
        int mounth=input.nextInt();
       // mounth=7;
       //String allmounth=" ";
        switch (mounth){
            case 1:
                System.out.println("1- January");
                break;
            case 2:
                System.out.println("2 - February");
                break;
            case 3:
                System.out.println("3 - March");
                break;
            case 4:
                System.out.println("4- April");
                break;
            case 5:
                System.out.println("5 - May");
                break;
            case 6:
                System.out.println("6 - June");
                break;
            case 7:
                System.out.println("7 - July");
                break;
            case 8:
                System.out.println("8 - August");
                break;
            case 9:
                System.out.println("9 - Septembe");
                break;
            case 10:
                System.out.println("10 - October");
                break;
            case 11:
                System.out.println("11 - November");
                break;
            case 12:
                System.out.println("12 - December");
                break;
            default:System.out.println("Invalid Month");
                System.out.println(mounth);


        }
        System.out.println("please enter day");
        int daynumber=input.nextInt();
        switch (daynumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid number");
        }





    }
}
