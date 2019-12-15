package Homework;

import java.util.Scanner;

public class PRACTICEQUESTION {

    public static void main(String[] args){

        //1- Using scanner provide two String (for example: Real Estate ,  Affiliate Marketing )
        //* write the code to check first string and second string is equals to each other.
        //check first letter of Strings are equals to each other.
        //check length of the Strings are equals to each other
        //check last letter of Strings are equals to each other.
        //add 2019 in the beginning of the string. Output should be like 2019 Real Estate and 2019 Affiliate Marketing.
        //Replace all the spaces with “-”
        //Print partial of the String starting from 4. char to 8. char and using method chaining trim all the spaces, make all of them upper case.
//
//        Scanner input=new Scanner(System.in);
//        String company1="Real Estate";
//        String company2="Affiliate Marketing";
//        System.out.println("check first letter of companies " + " " + company1.charAt(0) + " " + company2.charAt(0));
//        System.out.println("are they equal " + company1.equals("Real Estate") + company2.equals("Affiliate Marketing") );
//        //boolean result=company1==company2;
//        //System.out.println("are they equal " +result);
//        System.out.println("check length of the companies " + company1.length() + " " + company2.length());
//        boolean lenght=company1 == company2;
//        System.out.println("are they equal " +lenght);
//        System.out.println("check last letter of the companies " + company1.charAt(company1.length()-1)+ " " + company2.charAt(company2.length()-1));
//        boolean lastletter=company1 == company2;
//        System.out.println("are they equal " +lastletter);
//        System.out.println("2019 " + company1 );
//        System.out.println("2019 " + company2 );
//        //String companyname="2019 Real Estate ";
//        //String companyname=company1.concat("2019");
//        //System.out.println(companyname);
//        System.out.println(company1.replace(" ", "-"));
//        System.out.println(company2.replace(" ", "-"));
//        System.out.println(company1.substring(4,7).toUpperCase().trim());
//        System.out.println(company2.substring(4,7).toUpperCase().trim());
//        System.out.println(company1.toUpperCase());
//        System.out.println(company2.toUpperCase());
//        System.out.println(company1.trim());
//        System.out.println(company2.trim());


                // Real Estate
                // Affiliate Marketing
                Scanner sc=new Scanner(System.in);
                System.out.println("Please enter two business names");
                // if you have a space between the world we need to use the nextLine()
                String real=sc.nextLine();
                String marketing=sc.nextLine();
                boolean equals=real.equalsIgnoreCase(marketing);
                System.out.println(equals);
                //""+marketing.charAt(0);
                // "Tech"+1;
                boolean firstLetter=real.startsWith(""+marketing.charAt(0));
                System.out.println(firstLetter);
                boolean length=real.length()==marketing.length();
                System.out.println(length);
                // All primitive data types we need to use logical operators
                // ==,>=, <=, < , > , !=
                // String to compare the values we can not use the logical operator
                //2019
                real="2019 "+real;
                marketing="2019 "+marketing;
                System.out.println(real);
                System.out.println(marketing);
                //2019-Real-Estate
                real=real.replace(" ", "-");
                marketing=marketing.replace(" ", "-");
                System.out.println(real);
                System.out.println(marketing);
                System.out.println(real.substring(4,8).trim().toUpperCase());
                System.out.println(marketing.substring(4,8).trim().toUpperCase());














            }
}
