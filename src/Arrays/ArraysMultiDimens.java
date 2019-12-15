package Arrays;

import java.util.Arrays;

public class ArraysMultiDimens {
    public static void main(String[] args) {

        int [][][] nums={{{5,6},{8}},{{1},{1,4,0}},{{22,101}}};
        //Arrays.sort(nums);
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums[2][0][0]);
        System.out.println(nums[2][0][1]);   // to found 22
        System.out.println(nums[1][1][1]);  // found 4
        System.out.println(nums[0][1][0]);     // for 8
        System.out.println("******************************");
        for (int [][] outer1:nums){
            for (int [] outer2:outer1){
                for (int inner:outer2){
                    System.out.print(inner + " - ");
                }
            }
        }
    }
}



