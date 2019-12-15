package ScannerPackage;

import java.util.Scanner;

public class ScannerPractice {


        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("how old are you?");
            int age = input.nextInt();
            System.out.println("l am " + age + " years old");
            System.out.println("l am " + age + " years old");
            int birtYear = 2019 - age;
            System.out.println("the birt year is " + birtYear);

            System.out.println(" How much do you have?");
            double currentMoney = input.nextDouble();
            System.out.println("How much is the car ?");
            double carPrice = input.nextDouble();
            double difference = carPrice - currentMoney;
            boolean canBuy = currentMoney >= carPrice;
            System.out.println("Difference between current money and car price is " + difference);
            System.out.println("Can l buy the car?" + canBuy);
            System.out.println("Where are you living ");
            //for string input.next() --> if you are entering only one values
            //if yoo need to enter more than one String you need to use input.nextLine();
            String city = input.next();
            System.out.println("My current city is " + city);
        }
}
