package FORLOOP;

public class ForNestedOIlChange {
    public static void main(String[] args) {
        //imagine i ma change my oil after 2000 miles
        //1 change one time
        //every 500 miles i need full the my tank
       // 4 times full the thank change oil
        //my thank is emty I am getting tank is emty message
        //after 2000 miles I am getting cahnge the oil massege

        //i get the message for oil change then cahange the oil
        int count=1;
        int count1=1;
        for(int oil=0;oil<4;oil++){
            System.out.println(count++ + " - please change the oil ");

            for(int gas=0;gas<4;gas++){
                System.out.println(count1++ + " - please full the tank ");
            }
        }
        //Remove the second element (index->1, value->14) of the array




    }



}
