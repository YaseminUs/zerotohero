package Variables;

public class BooleanPractice {
    public static void main(String[] args){




                boolean isLightOn=true;
                isLightOn=false;
                isLightOn=!true;
                System.out.println(isLightOn);

                int currentSpeed=60;
                int speedLimit=50;
                boolean increaseSpeed=currentSpeed<speedLimit;//true
                boolean decreaseSpeed=currentSpeed>speedLimit;//false
                System.out.println("Increase speed is:" + increaseSpeed);
                System.out.println("Decrease speed limit is:" + decreaseSpeed);

                //think that your driving the car
                //your curret speed is 60 however the speed limit 50
                // increase=false
                //decrease=true

                int currentSpeed1=70;
                int speedLimit1=60;
                boolean increasespeedLimit1=currentSpeed1<speedLimit1;//false
                boolean decreasespeedLimit1=currentSpeed1>speedLimit1;//true
                System.out.println("Increase speed limit1 is" + increasespeedLimit1);
                System.out.println("Decrease speed limit1 is" + decreasespeedLimit1);

                //Fridge currentDegree 50f avarage degree 32f
                //if currentTemperature is bigger than
                // decrease the temperature---->true

                //event organization
                //if person age is less 18 year don't invite
                //person age is bigger than or equals 18 you can invite--->true
                //int personAge=21;
                //boolean invitePerson=personAge>=18;
                //boolean donotInvite=personAge<18;

                //avarage temp for the room is 72F
                //if currentTemp is less than 72F increase
                //or current temp is more than 72F decrese
                int currentTemp=60;
                int avarageTemp=72;
                boolean increaseTemp=currentTemp<avarageTemp;
                boolean decreaseTemp=currentTemp>avarageTemp;
                System.out.println("Increase temp is" + increaseTemp);//true 60<72
                System.out.println("Decrease temp is" + decreaseTemp);//false 60>72

                //Sell the alcohol if person age is more tah or equals to 21
                //don't sell alcohol if person age is less than 21
                int personAge=18;
                int legalAge=21;
                boolean sellAlcohol=personAge>=legalAge; //18>=21 false
                boolean dontSellAlcohol=personAge<legalAge;//18<21 true
                System.out.println("Selling alcohol age is " + sellAlcohol);
                System.out.println("Dont selling alcohol age is " + dontSellAlcohol);

                // if you have 500000 you can buy 5 room single house
                //if you don't have  500000 you can not buy the 5 room single house
                int mymoney=120_000;
                int houseprice=500_000;
                boolean canbuyhouse=houseprice<mymoney;
                boolean cantbuyhouse=houseprice>mymoney;

                System.out.println("Buying house " + canbuyhouse );
                System.out.println("Dont buying house " + cantbuyhouse );

                int housPrice=500_000;
                int currentSaving=620_000;
                boolean buyHouse=currentSaving>=housPrice;
                boolean dontBuyHouse=currentSaving<housPrice;
                System.out.println("If you have enough money buy house " + buyHouse);
                System.out.println("If you dont have enough money dont buy house" + dontBuyHouse);






            }
        }


