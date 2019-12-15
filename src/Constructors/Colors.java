package Constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {

        ArrayList<String> colorsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 5 color name ");
        int count=5;
        for(int i=0;i<5;i++){
            colorsList.add(sc.nextLine());
            count--;
            System.out.println(count+ " times enter the color");
        }
        System.out.println(colorsList);

        for(int i=0;i<colorsList.size();i++){
            colorsList.set(i,colorsList.get(i).toUpperCase());

        }
        System.out.println(colorsList);
        for(String c :colorsList ){
            if(c.startsWith("B")){

            }
            System.out.println(c);
        }
    }
}
