package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysStudents {
    public static void main(String[] args) {
        String[]studentNames={"Erkin","Adilet","Gulnara","Nazire","Aimira","Kira","Sema","Rumeysa"};
        Arrays.sort(studentNames);
        System.out.println(Arrays.toString(studentNames));

        Scanner input =new Scanner(System.in);
        String name=input.next();

        for(int i=0;i<studentNames.length;i++){
            if(name.equalsIgnoreCase(studentNames[i])){
                System.out.println(i);
                break;
            }else if(i==studentNames.length-1){
                System.out.println(-1);
            }
        }
        for(int i=0;i<studentNames.length;i++){
            if(studentNames[i].length()==6){
                System.out.println(studentNames[i]);
            }
        }
        for(String names:studentNames){
            if(names.length()==7){
                System.out.println(names);
            }

        }
    }
}
