package FORLOOP;

public class ForProductNumber {
    public static void main(String[] args) {
        // interview question
        // Given a positive int number n, your task is to calculate the differences between the product of its digits and the sum of its digits.
        // the order matter; the answer should be of the form product-sum;
        // For n=123456, the output should be
        // 1*2*3*4*5*6 --> product
        // sum= 1+2+3+4+5+6;
        //result=product-sum;
//        int num=123456;
//        // num=123456/10=12345
//        // num%10=5
//        //num=num/10=1234  num%10=4
//        //number>0
//        for (int i=num; i>0 ; ){
//            System.out.println(num%10); // if we remaind it it will give the last num --> 6
//            i=num%10;  // if we divide it will give the rest num --> 12345
//        }
        int num2=123456;
        int product=1;
        int sum=0;
        while (num2>0){
            System.out.println(num2%10);
            product*=num2%10;  // 6*1 , 6*5=30 , 30*4=120
            sum+=num2%10;
            num2=num2/10;
        }
        System.out.println(product);
        System.out.println(sum);
        System.out.println(product-sum);



    }
}
//1- How do you print all the letter from the string?
//2- How do you get the digits of integer?
//All the time if you want to get last number(digits) you need to do —>  %10
//İnt num=34567;
//// 7 6 5 4 3
//num%10=7
//num=num/10;2456
//num%6=6
//num=num/10=345
//num%5=5
//num=num/10=34
//num%4=4
//num=num/10=3
//num%10=3
//num=num/10= 0 ——> my loop is end
//** While (num>0){
//    num%10;
//    num=num/10;
//   }