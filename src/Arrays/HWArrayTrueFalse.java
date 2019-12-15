package Arrays;



public class HWArrayTrueFalse {
    public static void main(String[] args) {
        //Given array of ints, print true if array contains 1 and 2,
        //otherwise print false.Arrays are:
        //outputs:true, false,true



//        int[] number = new int[3];
//        int[] nums1 = {1, 2, 3, 4};
//        int[] nums2 = {7, 1, 5, 3, 4, 9};
//        int[] nums3 = {1, 2};


        int[] nums1={1, 2, 3, 4};
        boolean result=false;
        label: for (int i=0;i< nums1.length;i++){            // length --> it is for Arrays vs length() --> for string
            if(nums1[i]==1){
                for (int i2=0;i2<nums1.length;i2++){
                    if(nums1[i2]==2){
                        result=true;
                        break label;
                    }
                }
            }
        }
        System.out.println(result);
    }
}



