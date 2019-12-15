package FORLOOP;

import java.util.Scanner;

public class ForloopAgeRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("print enter the number ");

        int num = input.nextInt();
        if (num >= 18 && num <= 40) {
            System.out.println(num + " is in the range ");
            for (int i = num; i<= 40; i++) {
                System.out.println(i);
            }
            }else{
                System.out.println(num + " is not in the range ");
            }

        }
    }

