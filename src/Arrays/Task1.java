package Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //create arr of int; assign 10 nums 0-100;
        //print in reverse order separated by space

        int num[] = {4, 7, 5, 15, 38, 56, 0, 3, 9, 9};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        // create arr of int assign 10 nums 0- 100
        //print sum array
        System.out.println();
        System.out.println("*********");

        int sum = 0;
        for (int s : num) {
            sum += s;
        }
        System.out.print(sum);

        System.out.println();
        //{3,0,0,6,7,0,0,7,6,5}
        // expected {3,6,7,7,6,5,0,0,0,0,

        int a[] = {3, 0, 0, 6, 7, 0, 0, 7, 6, 5};
        int size = a.length;
        int b[] = new int[size];
        int index = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
