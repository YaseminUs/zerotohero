package Arrays;

import java.util.Arrays;

public class ArrayPracticeWeekend {
    public static void main(String[] args) {
        int num [] = new int [10];
        num [0]= 2;
        System.out.println(Arrays.toString(num));
        int num1 []={1,4,7};
        int num3 []= new int[] {5,6,8}; //Array it is fixed size you can change the value
        Arrays.sort(num3);
        System.out.println(Arrays.binarySearch(num3,5)); //index number
        System.out.println(Arrays.binarySearch(num3,7));

        int a[]={3,0,0,6,7,0,0,7,6,5};
        int num2[]=new int[num.length];
        int c=0;
        for (int i=0;i<num.length;i++){
            if (a[i]!=0 ){
                num2[c] =num[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(num1));
        int nums=0;
        int[]arrInt = {6,5,7,9,8,-1,-10,-6};
        Arrays.sort(arrInt);

        for(int i=0;i<arrInt.length-1;i++){
            for(int j=0;j<arrInt.length-1;j++){
                if(arrInt[j]>arrInt[j+1]){
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }
            }
        }
       System.out.println(Arrays.toString(arrInt));


        int[]arrOne = {7,6,-10,-9,9,10,1,2};
        for(int k=1;k<arrOne.length;k++){
            if(arrOne[k]<arrOne[k-1]){
                arrOne[k] = arrOne[k] + arrOne[k-1];
                arrOne[k-1] = arrOne[k] - arrOne[k-1];
                k=0;
            }
        }

        System.out.println(Arrays.toString(arrOne));

       int [] arrMaxMin = {-6,-4,9,10};

       int sumNeg = 0, count = 0, sumPos = 0, countPos = 0;
       for(int i = 0;i<arrMaxMin.length;i++){
           if(arrMaxMin[i] < 0){
               sumNeg = sumNeg + arrMaxMin[i];
               count++;
           }else{
               sumPos = sumPos + arrMaxMin[i];
               countPos++;
           }
       }
        System.out.println("sum of the pos elem : " + sumPos);
        System.out.println("summ of the neg elem : "+ sumNeg);



    }
}

