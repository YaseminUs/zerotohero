package IfStatements.HW;

import java.util.Scanner;

public class HWStudentClohts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("print out of school color   ");
        String color = input.nextLine();
        if (color.equalsIgnoreCase("red")) {
            System.out.println("kindergarden school color is red ");
        }else if(color.equalsIgnoreCase("blue")){
            System.out.println("elementry school color is blue ");
        }else if(color.equalsIgnoreCase("white shirt and gray pants")){
            System.out.println(" middle school color is white shirt and gray pants ");
        }else if(color.equalsIgnoreCase("blue shirt and blue pant")){
            System.out.println(" high school color is white shirt and gray pants ");
        } else {
                        System.out.println("is color not mach ");
                    }
                }
            }




