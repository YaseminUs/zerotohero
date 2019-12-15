package Arrays;

public class HWArrayReverseNumber {
    public static void main(String[] args) {
        //create below mentioned array of ints,print elements in reverse order.
        //int[] nums={1,2,3,5,11,9,7,0,0,
        //output:0,0,7,3,2,1,9,11,5


        int[] nums = {1, 2, 3, 5, 11, 9, 7, 0, 0};
        System.out.println("Original array: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for(int i=nums.length-1; i>=0; i--){
            System.out.print(nums[i]+ " ");
        }

    }

}


//System.out.println("Array in reverse order: ");
//        for (int i = nums.length-1; i >= 0; i--) {
//        System.out.print(nums[i] + " ");