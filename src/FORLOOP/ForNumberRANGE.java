package FORLOOP;

import java.util.Scanner;

public class ForNumberRANGE {
    public static void main(String[] args) {

        //using the scanner enter the number
        //if the number is between 10-40
        //print it is in the range
        //print it is not in the range

        Scanner input=new Scanner(System.in);
        System.out.println("print enter the number ");
        int num=input.nextInt();
        if(num<=40 && num>=10){
            System.out.println(num + " is in the range ");
        }else{
            System.out.println(num + " is not in the range ");
        }

    }
}
        //1-the number is in the range(give the number between 10 to 40)
       //2-the number is not in the range(give the number between 10 to 40)
       //3-upper limit 40, lover limit 10