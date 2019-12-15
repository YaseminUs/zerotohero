package Homework;

import java.util.Scanner;

public class HWDoWhileUpdate {
    public static void main(String[] args) {

     // in my computer, I am getting every fifteen days Updates available messages.
     // Using while loop, Using scanner enter the number of the days and print the Updates Available
     // Message with number in the beginning.
     // For Example: Scanner Input 45.
     // I will see three times Update avaliable message.
     // Example Output:
        // 1 Updates Available
        // 2 Updates Available
        // 3 Updates Available
        Scanner input=new Scanner(System.in);
        System.out.println("number of the days ");
        int numberdys=input.nextInt();
        int updates=numberdys/15;
        int count=1;
        do {
            System.out.println(count + " uptade available ");
            count++;
            //numberdys = numberdys - 15;
        }while (count<=updates);






    }
}
