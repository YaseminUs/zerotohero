package Homework;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        //to sort a numeric array and a string array.
        int[] myarray1 = {17, 20, 18, 14, 20, 145, 24, 125, 472, 365, 456, 2165, 1457, 2456};
        String[] myarray2 = {"yunus", "yasemin", "bera", "erva", "azra", "uslu"};

        System.out.println("Original numeric array : " + Arrays.toString(myarray1));
        Arrays.sort(myarray1);
        System.out.println("Sorted numeric array : " + Arrays.toString(myarray1));

        System.out.println("Original string array : " + Arrays.toString(myarray2));
        Arrays.sort(myarray2);
        System.out.println("Sorted string array : " + Arrays.toString(myarray2));

        //to sum values of an array.
        int[] myarray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : myarray3) {
            sum += i;
        }
        System.out.println("the sum is: " + sum);


        //to print the following grid.

        int[][] a = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("0 ", a[i][j]);
            }
            System.out.println();

        }

        //to calculate the average value of array elements.

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int summ = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            summ = summ + numbers[i];
            //calculate average value
        }
            average = summ / numbers.length;
            System.out.println("Average value of the array elements is : " + average);

    }
}

