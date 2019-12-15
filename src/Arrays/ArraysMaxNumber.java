package Arrays;
import java.util.Arrays;
public class ArraysMaxNumber {
    public static void main(String[] args) {
        int [] numbers={3,6,101,2,56,0,-10};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);  // when we sort it it will go the last number will be the largest one
        System.out.println();
        System.out.println(Arrays.toString(numbers));
        System.out.println("MAximum Number " + numbers[numbers.length-1]);
        System.out.println("Minumum number " + numbers[0]);
        System.out.println("Middle number " + numbers[numbers.length/2]);

        int [] nums={3, 9, 55, 73, 99, 2, 10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("MAximum Number " + nums[nums.length-1]);

        int[] sayilar={5,6,3,90,67,54,-2};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("Maxnumber "+ sayilar[sayilar.length-1]);
        System.out.println("minnumber "+ sayilar[0]);
        System.out.println("middlenumber "+ sayilar[numbers.length/2]);




    }
}