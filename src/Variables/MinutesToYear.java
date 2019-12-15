package Variables;

public class MinutesToYear {
    public static void main(String[] args){

        //double secondInminutes=60
        //double secondInHours=

        double minutesInHour= 60;
        double minutesinday=24 * minutesInHour;
        System.out.println("Total minutes in a day" +minutesinday);
        double minutesinyear=365*minutesinday;
        System.out.println("Total minutes in a year" +minutesinyear);
        //one minute in a year 0.000001902587519025875E-6


        double secondinminute=60;
        double secondinyear=60*minutesinyear;
        System.out.println("total second in year"+secondinyear);

        double sec =0.1/secondinyear;
        double $100min = 0.1*minutesinyear;
        System.out.println("0.1 second is"+ (0.1)+sec);


        // System.out.println("one minute in a year" +minToyear);


        double min=1;
        double minToyear =1/minutesinyear;
        double $100mint =100/minutesinyear;
        System.out.println("100 minutes is"+ $100mint);
        double $1000min =1000/minutesinyear;
        System.out.println("1000 minutes is"+ $1000min);
        double $11111min =11111/minutesinyear;
        System.out.println("11111 minutes is"+ $11111min);
        double $999999000000 =999999000000f/minutesinyear;
        System.out.println("999999000000 minutes is"+ $999999000000);



    }
}
