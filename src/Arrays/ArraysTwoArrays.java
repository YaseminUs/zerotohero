package Arrays;

import java.util.Arrays;

public class ArraysTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 5, 10};
        int[] num2 = {5, 1, -9};

        int[] result = new int[num1.length + num2.length];//4+3=7

        for (int i = 0; i < num1.length; i++) {
            result[i] = num1[i];

        }
        for (int i = 0; i < num2.length; i++) {
            result[i+num1.length] = num2[i];
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        System.out.println(result[result.length-1]);

        System.out.println("-------------");

//        int[] num = {2, 3, 5, 10};
//        int sum=0;
//
//        for (int i = 0; i < num.length; i++) {
//
//            sum = sum + num[i];
//            System.out.print( num[i]);
//             System.out.println();
//        }
//        System.out.println(+sum);


    }

}