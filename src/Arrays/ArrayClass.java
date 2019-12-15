package Arrays;
import java.util.Scanner;
public class ArrayClass {
    public static void main(String[] args) {
        String[] colors={"Red" , "Green" ,"Black","White", "Orange","brown","Pink"};  // index of it 6 length array 7
        System.out.println(colors.length); // in arrays you don't add () after lenght
        Scanner input=new Scanner(System.in);
        // colors[6]="pink"; // you can not add new value
        colors[6]="Blue";  // l can change the value of the array, but l can not increase /decrease the size of array
        colors[0]="Pink";
        System.out.println("Please enter the color");
        //  String color=input.next();
        int count=0;
        for(String col:colors){
            if(col.endsWith("e")){
                System.out.println(col);
//            }
//            for (int i=0; i<colors.length;i++){
//                System.out.println(i);
           }

        }
    }
}