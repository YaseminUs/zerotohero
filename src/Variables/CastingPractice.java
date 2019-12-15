package Variables;

public class CastingPractice {

    public static void main(String[] args){
        short samsung=1000;
        short apple=900;
        //casting primitive data types

        short totalPrice=(short)(samsung+apple);
        //byte, short, int and long is called integral values
        //float and double is called floting point numbers

        long studenNumber=1200l;
        //we need to cast the longer values to smaller values
        int studentNumber1=(int)1200l;
        long num=studentNumber1;
        double st=num;
        double K=800.7d;
        int L=(int)K;
        System.out.println("The L is " +L);

        int x=12;
        int y=5;

        x*=y; //compound assigments x=x*y;  50
        //x=x/y;2 ,, x=x%y;
        //x++, x
        System.out.println(x);

        byte bookNumber=10;
        int bookPrice=5;
        bookNumber=(byte)(bookNumber*bookPrice); //150
        //bookNumber*=bookPrice;

        System.out.println(bookNumber);

        char letter1='T';
        char letter2='U';
        char letter3='R';
        char letter4='A';
        char letter5='N';

        System.out.println(5+4);//9
        System.out.println("Muammer" +5+4);//muammer 54

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










    }
}
