package Homework;

public class HWWhileTenDigitNumber {
    public static void main(String[] args) {
             // Using loop ask user to enter 10 integer number and find sum of those numbers.


//        System.out.println("print number ");
//        int firstnumber = 1;
//        int secondnumber = 10;
//        int sum=0;
//        while (firstnumber <= secondnumber) {
//              sum=sum+firstnumber;
//            System.out.println( sum + "sum");
//            firstnumber++;

        int num = 10;
        int count = 1;
        int sum = 0;

        while(count <= num)
        {
            sum = sum + count;
            count++;
        }

        System.out.println("Sum of first 10 numbers is: " + sum);


        }
}
