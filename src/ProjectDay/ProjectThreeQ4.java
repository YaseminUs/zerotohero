package ProjectDay;

import java.util.Scanner;

public class ProjectThreeQ4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("input three Strings:");
        String first=input.nextLine();
        String second=input.nextLine();
        String third= input.nextLine();
        System.out.println("initials of three Strings are "+ first.charAt(0) + second.charAt(0) + third.charAt(0));
        System.out.println(" index of letter 'e' " + first.indexOf('e') +second.indexOf('e') +third.indexOf('e'));
        System.out.println("Last charecter of : " + first.charAt(first.length()-1) +second.charAt(second.length()-1) + third.charAt(third.length()-1));
        System.out.println("upper case" + first.toUpperCase() + second.toUpperCase() + third.toUpperCase());



        //charAt(banks.length()-1));

    }

}
