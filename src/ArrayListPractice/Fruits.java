package ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        //Task
        //create new class named Fruits
        //creat first main method
        //one arraylist called fruitList
        //Using Scanner add 5 fruit to your ArrayList
        //print all the items inside your ArrayList

        //Scanner,ArrayList, Add method, for loop

        Scanner input=new Scanner(System.in);

        ArrayList<String> FruitList=new ArrayList();

        System.out.println("please enter the 5 fruit name ");
        int count=5;

        for(int i=0;i<5;i++){
            FruitList.add(input.nextLine());
            count--;
            System.out.println(count+ "times you can enter the fruit");
        }

        System.out.println(FruitList);

        //make all your fruits upper case
        //for loop, get(),method,uppercase(),set()

        for(int i=0;i<FruitList.size();i++){
            FruitList.set(i,FruitList.get(i).toUpperCase());
        }
        System.out.println(FruitList);

        //TASK
        //lopp through your arrayList and print the element if it is start with "B"

        for(String s:FruitList){
            if(s.startsWith("B")){

            }
            System.out.println(s);
        }



    }
}
