package IfStatements.HW;

import java.util.Scanner;

public class HWifStadiumTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter class name: A/B/C ");
        String class1 = input.nextLine();
        if (class1.equalsIgnoreCase("c")) {
            System.out.println("please enter $50 and $70 ");
            double priceC = input.nextDouble();
            if (priceC >= 50 && priceC <= 70)
                System.out.println("Column D row 19");
        }else if (class1.equalsIgnoreCase("b")) {
            System.out.println("please enter $70 and $90 ");
            double priceb = input.nextDouble();
            if (priceb >= 70 && priceb <= 90)
                System.out.println("Column C row 10");
            } else if (class1.equalsIgnoreCase("A")) {
            System.out.println("please enter $90 and $110 ");
            double priceA = input.nextDouble();
            if (priceA >= 90 && priceA <= 110)
                System.out.println("Column A row 5 ");
        } else {
            System.out.println("it is not matching ");

        }
    }
}
