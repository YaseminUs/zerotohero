package Arrays;

import java.util.Arrays;

public class OrnekArrays {
    public static void main(String[] args) {

        String[] name = {"Erick ", "John", "Patel","Yasemin ", "Harsh", "Sarah", "Lily", "Nina"};
        Arrays.sort(name);
        for (int i = 0; i < name.length; i++) {
            if (name[i].length() == 4) {
                System.out.println("show me the name " + name[i]);
            }
        }
        for(String n:name){
                System.out.println(n);

    }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.binarySearch(name,"Yasemin"));

        String [][] str={{"Ali", "Baba"}, {"ve","kirk","haramiler"}};
        System.out.println(str[0][1]);
        System.out.println(str[1][2]);
        for (String[] inner:str){
            for(String letter:inner)
            System.out.print(letter + " - ");
           // int [][][] nums={{{5,6},{8}},{{1},{1,4,0}},{{22,101}}};
            }
        System.out.println("----------");
        String [][][] cars={{{"Volvo"}, {"BMW"}},      {{"Ford"},{"Mazda","Hundai"}},   {{"Nissan","Honda"}, {"Mercedes"}}};
                                   //0                              //1                              //2
        System.out.println(cars[2][0][0]);
        System.out.println(cars[1][1][1]);
        System.out.println(cars[1][0][0]);
        System.out.println(cars[2][0][1]);
        for(String [][] c1:cars){
            for(String [] c2:c1){
                for(String inner:c2){

                    System.out.print(inner + "-");

                }
            }
        }
        System.out.println("------");
        int [][][] nums={  {{2,3},{5,7,4}},    {{8},{10,11}},   {{22,21,24,23},{6}}  };
        System.out.println(Arrays.toString(nums));
        //Arrays.sort(nums);
        System.out.println(nums[2][0][2]);
        System.out.println(nums[0][0][1]);
        for(int [][] n1:nums){
            for(int [] n2:n1){
                for(int inner:n2){
                    System.out.print(inner+ "-");


                }
            }

        }
        System.out.println("------");
        int [] num={7,9,90,76,98,43};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("maximum number "+ num[num.length-1]);
        System.out.println("middle number "+ num[num.length/2]);
        System.out.println("minumum number "+ num[0]);
        System.out.println("number "+ num[2]);
            }
        }







