package FORLOOP;

import java.util.Scanner;

public class forornek1 {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        String name = "Ya3456semin";
        for (int i = name.length() - 1; i > 0; i--) {
            for (char ch = '0'; ch <= '9'; ch++) {
                if (name.charAt(i) == ch) {
                    //reverse=reverse+name.charAt(i);
                    System.out.println(ch);
                }

            }
        }








        String myname = "Yasemin Uslu";
        for (int i = 0; i < 5; i++) {
            System.out.println("Yasemin Uslu");


//            System.out.println("please enter number ");
//            int num = input.nextInt();
//            for (int j = 0; j <= num; j++) {
//                if (num % j == 0) {
//                }
//            }
//        }


            for (int j = 0; i <= 6; i++) {
                System.out.println();
                for (int n = 1; n <= i; n++) {
                    System.out.print('1');
                }
            }
        }
        for (int i = 0; i <= 8; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }

        for (int row = 0; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {

                System.out.print(column);
            }
            System.out.println();
        }


        int rows = 5;
        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}







