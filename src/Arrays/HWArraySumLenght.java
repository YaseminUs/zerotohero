package Arrays;

public class HWArraySumLenght {
    public static void main(String[] args) {
        //Given an array of ints length 7, print the sum of all the elements.
        //int[] nums={1,2,3,5,11,9,0};
        //output: sum of number in array is 31


        int[] nums = {1, 2, 3, 5, 11, 9, 0};
        int sum = 0;



        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            System.out.println(" all the elements of an array:" + nums[i]);
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
