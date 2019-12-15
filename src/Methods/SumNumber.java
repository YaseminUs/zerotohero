package Methods;

public class SumNumber {
    //one class
    //create the method
    //it will take int array as a parameter
    //your method should find the int value more 3 and less 7

    //int [] number={3,4,1,10,6,5,4,9}
    //return type should be int.


    public int sum(int [] arr){
        int result=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>3 && arr[i]<7){
                result+=arr[i];
            }
        }
    return result;

    }

    public static void main(String[] args) {
        SumNumber nm=new SumNumber();
        int[]nums={1,2,4,6,7,8,4,3,6,4,10,11};
        nm.sum(nums);

        System.out.println(nm.sum(nums));
    }
}
