package DoWhileLoop;

import java.util.Scanner;

public class DoWhileDivided {
    public static void main(String[] args) {



                Scanner input=new Scanner(System.in);
                System.out.println("please enter the number");
                //18 divide with 2= how many times
                // 18/2=9 , 9/2=4 , 4/2=2 , 2/2=1 , 1/2=0
                int number=input.nextInt();
                int count=0;
                while (number>2){
                    number=number/2;
                    count=count+number;
                }
                System.out.println(count);
            }
        }
