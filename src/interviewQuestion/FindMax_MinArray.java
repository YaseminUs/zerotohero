package interviewQuestion;

public class FindMax_MinArray {


   public static int findMax(int arr[]){
       if(arr.length==0)return 0;
       int maxNum = arr[0];
       for(int i:arr){
           if(i>maxNum){
               maxNum=i;
           }
       }
   return maxNum;
   }

   public static int findMin(int arrr[]) {
       if (arrr.length == 0) return 0;
       int minNum = arrr[0];
       for (int i : arrr) {
           if (i < minNum) {
               minNum = i;
           }
       }
       return minNum;
   }





    public static void main(String[] args) {

       int arr []={2,3,4,5};
       int arrr[]={1,2,3,4,5};
        System.out.println(findMax(arr));
        System.out.println(findMin(arrr));
    }

}

