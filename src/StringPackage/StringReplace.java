package StringPackage;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[]args){

        String success="dotentimesmore";
        success=success.replace('d' ,'D');
        System.out.println(success);

        success=success.replace("ten" , "eleven");
        System.out.println(success);

        success=success.replace('m' ,'M');
        System.out.println(success);

        //success.replace('X' ,'M');
        //it will search the string to find oldchar or oldstring
        //if it is not able find will not cahenge the value
        success=success.replace('X' , 'M');
        System.out.println(success);

        ////////////////////////////////////

        String achivement="     do ten times more";//basta bosluk verince onu trim yapiyoruz

        achivement=achivement.trim();
        System.out.println(achivement);
        //using scanner give the following value
        //"   Zero To Hero   "
        //print only "Hero"
        //trim the spaces
        //replace Zero with "One"
        //print all of them upper case
        //return true if it is equaL Ignore case to "zero to hero"


       // Scanner input=new Scanner(System.in);

        System.out.println("please give me the value");
        Scanner input=new Scanner(System.in);

        String value=input.nextLine();
        value=value.trim();
        System.out.println(value.substring(7));
        System.out.println(value.trim());
        System.out.println(value.replace("Zero", "One"));
        System.out.println(value.toUpperCase());
        System.out.println(value.equalsIgnoreCase("zero to hero"));


//        System.out.println("Please provide the String value");
//        String name=input.nextLine();
//        name=name.trim();
//        String subs=name.substring(name.indexOf("H"));
//        System.out.println(subs); // Hero
//        name=name.replace("Zero", "One");
//        System.out.println(name);
//        System.out.println(name.toUpperCase());
//        boolean result=name.equalsIgnoreCase("zero to hero");
//        System.out.println(result);





    }
}
