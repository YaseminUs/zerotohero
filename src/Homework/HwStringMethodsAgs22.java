package Homework;


    import java.util.Scanner;

        public class HwStringMethodsAgs22 {
          public static void main(String[] args){

//        Using scanner input three string like
//        Example String 1: Chase, Bank Of America, Google
//        Example String 2: Chase, Chase, Chase
//        1- Print first char of these three String
//        2- Print Last char of the these three String
//        3- Print middle char of this three String
//        4- Print Lenght of this Strings
//        5- Print 4th char of this Strings
//        6- Print index of “k” from this Strings

         Scanner input=new Scanner(System.in);
         String banks="Chase, Chase, Chase ";
         System.out.println("first char from the string " + banks.charAt(0));
         System.out.println("Last char of the these three String " +  banks.charAt(banks.length()-1));
         System.out.println("middle char of this three String " + banks.charAt((banks.length()-1)/2));
         System.out.println("length of String " + banks.length());
         System.out.println("4th char of this Strings " + banks.charAt(4));
         System.out.println("index of 'k'" + banks.indexOf("k"));


         String bank1="Chase";
         System.out.println("first char from the string " + bank1.charAt(0));
         System.out.println("Last char of the String " +  bank1.charAt(bank1.length()-1));
         System.out.println("middle char of this String " + bank1.charAt((bank1.length()-1)/2));
         System.out.println("Lenght of this Strings " + bank1.length());
         System.out.println("4th char of this String " + bank1.charAt(4));
         System.out.println("index of 'k " + bank1.indexOf("k"));

         String bank2="Bank Of America";
         System.out.println("first char from the string " + bank2.charAt(0));
         System.out.println("Last char of the String " + bank2.charAt(bank2.length()-1));
         System.out.println("middle char of this String " + bank2.charAt((bank2.length()-1)/2));
         System.out.println("Lenght of this Strings " + bank2.length());
         System.out.println("4th char of this String " + bank2.charAt(4));
         System.out.println("index of 'k " + bank2.indexOf("k"));

         String website= "google";
         System.out.println("first char from the string "+ website.charAt(0));
         System.out.println("Last char of the String "+ website.charAt(website.length()-1));
         System.out.println("middle char of this String "+ website.charAt((website.length()-1)/2));
         System.out.println("Lenght of this Strings "+ website.length());
         System.out.println("4th char of this String "+ website.charAt(4));
         System.out.println("index of 'k" + website.indexOf("k"));



    }
}
