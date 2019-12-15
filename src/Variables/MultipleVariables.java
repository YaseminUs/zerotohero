package Variables;

public class MultipleVariables {

    public static void main(String[] args){

        double taxAmount;
        taxAmount=10.5;

        double trumpAge, hillaryAge, obamaAge;
        trumpAge=70;
        hillaryAge=68;
        obamaAge=59;
        // double trumpAge,hillaryAge, obamaAge =70,68,59;

        double totalAges=trumpAge+hillaryAge+obamaAge;
        System.out.println("total ages of presidents are " +totalAges);

        int appleNumber=12, orangeNumber=15, banabaNumber=10;
        int totalFruit=(12+15+10);
        System.out.println("total number is "+totalFruit);

        System.out.println("Apple Number is " +appleNumber);
        System.out.println(orangeNumber);
        System.out.println(banabaNumber);

        int totalFruits=appleNumber+orangeNumber+banabaNumber;
        System.out.println("Total Fruits Number " +totalFruits);

        int restFruits=totalFruits-10;
        System.out.println("Rest of the fruits " +restFruits);

        int divisions=27/6;
        System.out.println(divisions);

        double division=27/6.0;
        System.out.println(division);

        int remainder=27%4;
        //4+4+4+4+4+4+3
        int remainder1=27%6;
        //6+6+6+6+3
        int remainder2=27%5;
        //5+5+5+5+5+2
        System.out.println(remainder2);

        int number=10+5-3;
        //12
        int number1=10*5-3;
        //47
        int number2=3+10%5;
        //3
        int number3=3*10%7;
        //2
        //7+7+7+7+2
        int number4=3+4*5-4/2;
        //21
        //3+20-2=21
        int number5=(3+4)*(5-4)/2;
        //7*1/2=3
        double number6=(3+4)*(5-4)/2d;
        //7*1/2=3.5
        System.out.println(number6);

        int stnumber1=10+5-2;
        int stnumber2=10*5-3;
        int stnumber3=3+10/5;
        int stnumber4=3*10/7;
        int stnumber5=3+4*5-4/2;
        //int Totalstnumber=
        System.out.println("Total number is "+ stnumber1 );




    }
}
