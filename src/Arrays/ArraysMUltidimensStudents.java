package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMUltidimensStudents {
    public static void main(String[] args) {
        String [][] groupNames={{"Adilet","Aimira","Aiturgan," ,"Akylai"},{"Nazire","Yasemin","Vitali","Nargiza","Sasha"}};
       // Arrays.sort(groupNames);
       // System.out.println(Arrays.toString(groupNames));
        Scanner input=new Scanner(System.in);
        String name=input.next();

        for(int i=0; i<groupNames.length;i++){
            for(int a=0; a<groupNames[i].length;a++){
                if(groupNames [i][a].equalsIgnoreCase(name)){
                    System.out.println(Arrays.deepToString(groupNames));
                    System.out.println("in array " + i + " in order " + a);
                }
            }
        }



    }
}
