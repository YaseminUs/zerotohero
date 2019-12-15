package Collections;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        //* Hashtable is synronized
        // can not store null key and values
        // it is slower than HashMap

        Hashtable<String,Boolean> truthList = new Hashtable<>();

        truthList.put("123",true);
        truthList.put("345",false);
        truthList.put("459",true);
        truthList.put("987",false);
        //truthList.put("null","null");
        truthList.put("865",true);

        System.out.println(truthList);



    }
}
