package FORLOOP;

public class ForFibonacciNumber {
    public static void main(String[] args) {
        //using java print fibonacci number
        //sum of the first two number is equal to next number
        //0,1
        //1-5

        // sum of the first two number is equals to next number
        // 0 ,1

        // 1 - 100;
        // 0 1 2 3 5 8 13



        // 0 1 1 2 3 5 8 13
        int num1=0,num2=1,sum=0;
        System.out.print(num1+" "+num2);
        for(int i=1;i<13;i++){      // 2 3

            sum=num1+num2;           // 1// 2 , 3 , 5, 8 13
            num1=num2;             // 1 , 2 3 5 8
            num2=sum;              // num2=1// num2=2; 3 , 5 , 8 13
            System.out.print(" "+sum);
        }

//        String resultString = "0,1";
//        int i;
//        int num1=0,num2=1,sum=0;
//        for(i=8;i>2;i++){
//            sum=num1+num2;
//            num1=num2;
//            num2=sum;
//            //resultString + =","+ sum;
//        }
//       System.out.println(sum);
    }
}

