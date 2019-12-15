package FORLOOP;

import java.util.Scanner;

public class FORNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //using scanner please enter the number 28
        //1,2,4,7,14,28
        //using for loop print entered number dividers
        //28%2=0
        //28%4=0
        //28%7=0

        for (int i = 1; i<=28;i++){
            if(28%i==0){
                System.out.println(i);  
            }


        }
    }
}