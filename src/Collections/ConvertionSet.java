package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertionSet {
    public static void main(String[] args) {

        ArrayList<String> singerList = new ArrayList<>();
        singerList.add("Drake");
        singerList.add("Jacson");
        singerList.add("Cardy");
        singerList.add("Beyonce");
        singerList.add("Drake");

        System.out.println("This is arraylist " + singerList);
        //HashSet<String> singerList=new HashSet<>(singerList)

        Set<String> singerList1 = new HashSet<String>(singerList);//converting--set

        System.out.println("This is set "+ singerList1);


        singerList=new ArrayList<>(singerList1);
        singerList.add("Drake");
        System.out.println("this is after converting "+ singerList);//singerlist is array you can duplicate again
        System.gc();//garbage collection

//        Converting from Set to Arraylist
//        HashSet<String>SetName=new HashSet(ListName);
//        ArrayList listName=new ArrayList(SetName);
    }
}
