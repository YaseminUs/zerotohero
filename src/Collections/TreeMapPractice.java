package Collections;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {

        //it does not allow to store the null key but you can store null value
        //it fallow assending order
        //it will look at the key and according values of key it will do ascending order

        TreeMap<String,String> phoneList = new TreeMap<>();
        phoneList.put("Yasemin", "4647163853");
        phoneList.put("Rumeysa","8287539678");
        phoneList.put("Merve","683629861");
        phoneList.put("james",null);
       // phoneList.put("null","David"); can not


        System.out.println(phoneList);






    }
}
