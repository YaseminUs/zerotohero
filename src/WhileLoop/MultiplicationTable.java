package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        int number=input.nextInt();
        int count = 1;
        while(count<=10){
            System.out.println(number +"*" + count + "=" + number * count );
            count++;

        }





    }
}
