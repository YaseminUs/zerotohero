package ProjectDay;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectDayQ2 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("What is your random world ");
        String random=input.nextLine();
        System.out.println("What is the lenght your random ");
        int wordLenght=input.nextInt();
        boolean checklenght = random.length()==wordLenght;
        System.out.println("Check enter "+ checklenght );
        System.out.println("Enter a letter that you want to find a index for" );
        String letter=input.next();
        System.out.println("The index of letter you asked is "+ random.indexOf(letter));





    }
}
