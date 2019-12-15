package ProjectDay;

import java.util.Scanner;

public class ProjectThreeQ1 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

       // System.out.println("How old are you");
        System.out.println("What is your name ? ");
        String fullName =input.nextLine();
        System.out.println("What is your state code ? ");
        String state= input.nextLine();
        System.out.println("What is your city ? ");
        String city=input.nextLine();
        System.out.println("What is your gender ? ");
        String gender=input.nextLine();
        System.out.println("How old are you");
        int age=input.nextInt();

        boolean checkAge = age >= 18;
        boolean checkName1= fullName.charAt(0)=='A';
        boolean checkName2= fullName.charAt(fullName.length()-1)=='V';
        boolean checkstate1= state.charAt(0)=='I';
        boolean checkstate2= state.charAt(state.length()-1)=='L';
        boolean checkcitylenght=city.length()<=10;
        boolean checkGender=gender.charAt(0)=='M';
        boolean all= checkName1 && checkName2 && checkstate1 && checkstate2 && checkcitylenght && checkGender;
        System.out.println("Are you able to vote " + all);






    }


}
