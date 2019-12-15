package DoWhileLoop;

import java.util.Scanner;

public class printTree {
     Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int number=5;
        String star="*";

        do{
            System.out.println(star);
            star=star+"*";
            number--;
        }while (number>=0);
    }
}
