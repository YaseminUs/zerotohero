package Variables;

public class Test {
    public static void  main(String[] args){

        //int dailywage = 4;
        //int number_of_days = 5;
        //int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
        //salary =- dailywage;
        //System.out.println(dailywage + " " + number_of_days + " " + salary);

        //int num = 69;
        //int days = num % 30;//9
        //int month = num / 30;//2

        //System.out.println(month + " Month and " + days + " days");

        /*
        Write a Java program to convert minutes into a number of years and days.
         11111min
        */

        double min = 11111;
        //bir saat 60dk 11111 dak kac saattir
        double hour=min/60;
        double day=hour/24;
        double year=day/365;
        System.out.println("Year is " +year);

        System.out.println("Day is "+day);

        int mins= 25000;
        int hours=mins/60;
        int days=hours/24;
        int years=days/365;
        System.out.println("how many years " + years);


        //1980 yil kac saniyedir

        double yr=1980;
        double dy=yr*365;
        double hr=dy*24;
        double mn=hr*60;
        double sc=mn*60;
        System.out.println(" second " + sc);

        /* Write the total number of months in 5 years and 6 months */
        int yil=5;
        int month=6;
        int totalmonths=5*12;
        System.out.println(totalmonths+6);

        /* Write the total number of months in 18 years and 9 months. */

        int yl=18;
        int ay=9;
        int totalay=18*12;
        System.out.println(totalay + 9);

        /* Write the total number of months in 6 years and 2 months. */
        int yry=6;
        int mth=2;
        int totalmth=6*12;
        System.out.println(totalmth + 2);


    }
}
