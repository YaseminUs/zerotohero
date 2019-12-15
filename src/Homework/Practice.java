package Homework;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        String name = "hgfwugiuregbfeb";
        System.out.print("Number of  Vowels in the string: " + countVowels(name));

        System.out.println();

        Practice futreInvest = new Practice();
        futreInvest.years=5;
        futreInvest.investmentAmount=1000;
        futreInvest.monthlyInterestRate=10;
        futreInvest.investmentInfo();

        int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }

    public static int countVowels(String name) {

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }

    double investmentAmount ;
    double monthlyInterestRate ;
    int years ;

    public void investmentInfo(){
        System.out.println(investmentAmount);
        System.out.println(monthlyInterestRate);
        System.out.println(years);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static boolean contains(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }






}









