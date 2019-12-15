package Methods;

import java.util.Arrays;

public class testhomework {
    public static void main(String[] args) {
        HwMethod ah = new HwMethod();
        int[] nums= {5,1,9,0,3};
        System.out.println(Arrays.toString(ah.homework(nums)));

        int[] nums2= {5,1,9,0,3,100};
        System.out.println(Arrays.toString(ah.homework(nums2)));
    }
}