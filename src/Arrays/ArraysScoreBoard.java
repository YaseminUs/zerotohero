package Arrays;

import java.util.Scanner;

public class ArraysScoreBoard {
    public static void main(String[] args) {
        char[] teams = {'A', 'B', 'C'};
        //use should input score number for each team
        //please enter score for team A 3
        //please enter score for team B 5
        //***
        //ex: A***
        //    B*****
        //    C*

        Scanner input = new Scanner(System.in);
        System.out.println("please enter score team A : ");
        int scoreA = input.nextInt();
        System.out.println("please enter score team B : ");
        int scoreB = input.nextInt();
        System.out.println("please enter score team C : ");
        int scoreC = input.nextInt();
        for (char t : teams) {
            if (t == 'A') {
                String stars = " ";
                for (int i = 0; i < scoreA; i++) {
                    stars = stars + "*";

                }
                System.out.println(t + stars);//A **********
            } else if (t == 'B') {
                String stars = " ";
                for (int i = 0; i < scoreB; i++) {
                    stars = stars + "*";
                }
                System.out.println(t+stars);
                } else if (t == 'C') {
                    String stars = " ";
                    for (int i = 0; i < scoreC; i++) {
                        stars = stars + "*";
                    }
                System.out.println(t+stars);
            }
            }
        }
    }
