package FORLOOP;

import java.util.Scanner;

public class ForLoopeExtra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print(i + "-");
        }
        System.out.println();
        for (int k = 10; k >= 0; k--) {
            System.out.print(k + "-");
        }


        for (int i = 1; i <= 5; i++) {   //????
            System.out.println();
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
        }


        for (int i = 0; i <= 5; i++) {  //????
            System.out.println();
            for (int j = i; j <= 5; j++) {
                System.out.print("x ");
            }
        }

        System.out.println("please enter the number ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number);
        }


        for (int i = 0; i <= 6; i++) {
            System.out.println();
            for (int t = 1; t <= i; t++) {
                System.out.print("* ");

            }

            String name = "*";
            int num = input.nextInt();
            for (int b = 1; b <= num; b++) {
                System.out.println();
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

            }
            String isim = "yasemin";
            for (int v = isim.length() - 1; v >= 0; i--) {
                System.out.print(isim.charAt(i));
            }


        }
    }
}
