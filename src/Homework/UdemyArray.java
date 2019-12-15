package Homework;

public class UdemyArray {
    public static void main(String[] args) {

        int[] b = {2,7,45,89,0};
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
//        int [] a = {23,56,76,4,8,98,9};
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+",");
//        }
//        System.out.println();
//
//        int[] c = {23,56,7,45,89,0};
//        for(int i = c.length -1;i>=0;i--){
//            System.out.print(c[i]+",");
//        }

//        int num [] = {200,700,450,89,0,230,56,760,4,8,98,9};
//        int count=0;
//        for(int i=0;i< num.length;i++){
//            if(num[i]>100){
//                count++;
//            }
//        }
//        System.out.print("greater than 100: "+ count);


        int nums [] = {200,700,450,89,0,230,56,760,4,8,98,9};
        //int counts = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>100){
                //counts++;
            }
            sum+=nums[i];
        }
        System.out.println(sum);

        int [] number = new int[4];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        System.out.println(number[1]);
        System.out.println(number[3]);
        System.out.println(number.length);
        int toplam=0;
        for(int i : number){
            toplam+=i;
        }
        System.out.println(toplam);

     int bar [] = new int[3];
     bar[0]=12;
     bar[1]=23;
     bar[2]=350;
        System.out.println("bar : "+ bar[1]);
        System.out.println("bar : "+ bar[2]);
        System.out.println("bar size : "+ bar.length);
        for(int i=0;i<bar.length;i++){
            System.out.println(bar[i]);
        }
        int Sum = 0;
        for(int i : bar){
            Sum+=i;
        }
        System.out.println(Sum);

     String[] atasozu = new String[3];
     atasozu[0]="Damlaya";
     atasozu[1]="damlaya";
     atasozu[2]="gol olur";
        System.out.println(atasozu[2]);
        System.out.println(atasozu.length);

     for(String i : atasozu){
         System.out.println(i);
     }
     //Create an integer array of 5 elements and give each element an arbitrary value.
     // Print out the entire array using a loop.
     int [] foo = new int [5];
     foo[0]=12;
     foo[1]=2;
     foo[2]=41;
     foo[3]=7;
     foo[4]=9;
     for(int i=0;i<foo.length;i++){
         System.out.println(foo[i]);
     }
        System.out.println();
     //Use a loop to populate an array with integers from 1 to 20.
     // Use another loop to print the contents of the array (the elements) backwards.
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i] + ",");

     }
        System.out.println();

     //Create an array of five doubles and give each element some value.
     // Calculate the sum of all the elements and print the result.
     // Calculate the mean/average of the all the elements and print that too.

      double [] dop = new double[5];
      dop[0]=2.46;
      dop[1]=1.5;
      dop[2]=1.97;
      dop[3]=8.9;
      dop[4]=5.5;
      double dopsum=0;
      for(int i=0;i<dop.length;i++){
          dopsum+=dop[i];

      }
      double mean = dopsum / dop.length;//average number sum/num.length

      System.out.println(dopsum);

        System.out.println(mean);










    }
}
