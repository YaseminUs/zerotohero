package StringPackage;

import java.util.Scanner;

public class StringContains {
    public static void main(String[] args){




                String name="236 - Muammer";
                boolean condition=name.startsWith("235");
                System.out.println(condition);
                boolean condition2=name.endsWith("mer");
                System.out.println(condition2);
                boolean condition3=name.contains(" -");
                System.out.println(condition3);
                // Using scanner input your name with gender
                // F - yourname - dateofbirth (1995)
                // M - yourname
                // 1- check start with F if you are female - print result
                // 2- check start with M if you are male - print result
                // 3- check input contains your name or not - print result
                // 4- check input endswith your date of birth
                    //Scanner input=new Scanner(System.in);
                    //System.out.println("Please provide the name in the following format" + " F/M(Gender - yourName - dateOfBirth(year)");
                   //String sName=input.nextLine();
                   //boolean gender=sName.startsWith("M");
                  // boolean checkName=sName.contains("Muammer");
                   //boolean date=sName.endsWith("1991");
                   //System.out.println("The value is starting with M "+gender);
                   //System.out.println("The value contains Muammer "+checkName);
                  // System.out.println("The value is ending with 1991 "+date);
        Scanner input=new Scanner(System.in);
       // System.out.println("Please provide: " + "F/M(gender - your name - dateof birth(year)");
       //  String info=input.nextLine();
       // boolean gender=info.startsWith("M");
       // boolean myname=info.contains("Muammer");
       // boolean dateof=info.endsWith("1991");
       // System.out.println(gender);
       // System.out.println(myname);
       // System.out.println(dateof);

        System.out.println("What is your adress - city -zipcode ");
        String home=input.nextLine();
        boolean adress=home.startsWith("305");
        boolean city=home.contains("schaumburg");
        boolean zipcode=home.endsWith("60193");
        System.out.println(adress);
        System.out.println(city);
        System.out.println(zipcode);

        // first correct values true, true , true
        // all the values are wrong
        // gender is correct name and date are wrong
        // gender is correct name is wrong and date is correct


          // Student
          // less than age<18 or equals 18 -- green
          // more than 18 but less 50 - red
          // more than 50 year -- black












    }
}
