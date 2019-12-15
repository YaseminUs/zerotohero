package FORLOOP;

import java.util.Scanner;

public class ForPerfectNumber {
    public static void main(String[] args) {
        //perfect Number
        //int number=6
        //dividers=1,2,3,
        //sum=1+2+3=6
        //if(sum==number{
        //sout(number)
       // {
       //28 perfect
      //20 not perfect number
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int number=input.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(sum==number){
            System.out.println(number+" is perfect number");
        }else{
            System.out.println(number+" is not perfect number");
        }
        // Positive testing
        // Once you enter the perfect number result should is perfect number
        // Negative Testing
        // Once you enter the not perfect number you should see the is not perfect number
        // Scenario
        // give the String and it should not work.










    }
}
