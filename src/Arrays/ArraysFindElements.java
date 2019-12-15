package Arrays;

import java.util.Scanner;

public class ArraysFindElements {
    public static void main(String[] args) {

        String[] colors = {"Red", "Gren", "Black", "white", "orange"};
        //write a program that will ask a user input a color,
        //if your color is inside of the array then it will return " inside of array"
        //if your color is not in array it should return -1

       Scanner input=new Scanner(System.in);

        System.out.println("Please enter the color ");
        String color = input.next();


        int count=0;
        for(String c:colors){     //  <--- for each loop
            if(color.equalsIgnoreCase(c)){
                System.out.println("Your color "+ c + " is inside of Array");
                break;
            }
            count++;
            if(count==colors.length){
                System.out.println("-1 your color is not inside of Array ");
            }
        }









    }
}

