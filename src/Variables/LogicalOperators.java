package Variables;

public class LogicalOperators {
    public static void main(String[] args){


            //you shold go to the collage ESL course or
            //TOEFL score should be 79
            //my brother has TOEFL score 65
            //he is not going to the ESL course
            //MY BROTHER CAN GO TO THE UNIVERSITY OR NOT

            int ToeflScore=79;
            int MyBrotherScore=65;
            boolean CangotoSchool=MyBrotherScore>=ToeflScore;//-->false
            boolean CAntgotoScholl=ToeflScore<MyBrotherScore;//-->true
            System.out.println("MyBrotherCan go to SChool" + CAntgotoScholl);
            System.out.println("MyBrotherCan not go to SChool" + CAntgotoScholl);


            boolean hasVisa=true;
            boolean hasTicket=true;

            boolean canCome=hasVisa && hasTicket;
            System.out.println("Can I come to the USA? " +canCome);

            boolean finishESL=false;
            int toeflScore=80;

            boolean passToefl=ToeflScore>=79;
            boolean canGoToCollege=finishESL || passToefl;


            boolean CanGoToCollege=finishESL || toeflScore>=79;
            System.out.println("Can Go To The Collage ? "+canGoToCollege );

            //To be able to buy house I should have enough money or
            //I should have a mortgage
            //current money 200.000
            //house price 300.000

            int currentMoney=300_000;
            int homePrice=300_000;
            boolean hasMortgage=false;
            boolean hasEnoughMoney=currentMoney>=homePrice;
            boolean canBuyHome=hasMortgage || hasEnoughMoney;
            System.out.println("Can I BUY JOME ? "+ canBuyHome);

            //int x=5;
            //int y=5;
            //boolean x=y;
            //boolean result=x==y || x==++y; //==>false and


            int x=6;
            Boolean y =(x>=6)  ||  (++x<=7); // true
            System.out.println(x); //— 6
            System.out.println(y); //—  true

            //System.out.println(x);
            //System.out.println(y);

            int b=6;
            int c=3;
            boolean result=b+2==3*c || !true && c<b/3;
            //8==9 || false && 3/2
            //false || false && false
            // false && false ===>false
            System.out.println(result);






        }
}
