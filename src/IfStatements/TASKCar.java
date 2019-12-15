package IfStatements;

import java.util.Scanner;

public class TASKCar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //using scanner enter the soeed of car
        //if car speed is more than or equals 1 and less than 20
        //car gear is 1
        //else print gear is not defined or speed entered wrong

        System.out.println("please provide your car speed ");
        int carspeed = input.nextInt();
        if (carspeed >= 1 && carspeed < 20) {
            System.out.println("car gear is 1 ");
        } else if (carspeed >= 20 && carspeed < 40) {
            System.out.println("car gear is 2 ");
        } else if (carspeed >= 40 && carspeed < 60){
            System.out.println("car gear is 3 ");
        } else if (carspeed >= 60 && carspeed < 80) {
            System.out.println("car gear is 4 ");
        }  else if (carspeed >= 80 && carspeed < 200) {
            System.out.println("car gear is 5 ");
        }else if (carspeed < 0 && carspeed > -20) {
                System.out.println("car gear is Rear ");

        }else {
                System.out.println("gear is not defined or speed wrong ");
            }
    }
}
          // 1-20----> gear 1(vites)
         // 20-40----> gear 2
       //40 - 60 ----> gear 3
           //