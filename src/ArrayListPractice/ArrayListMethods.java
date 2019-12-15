package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> nameList=new ArrayList<>();
        //once i create the namaList
        //i am saying only i can store the string
        //other than string i can not store any value
        nameList.add("Adam");
        System.out.println(nameList);
        nameList.add("John");
        nameList.add("Steve");
        System.out.println(nameList);
        nameList.add(1,"David");

        //nameList.add(10,"jhon");
        //if you try to add the value to your arraylist but your arraylist size is less than index number
        //it will throw indexOutBoundException

        System.out.println(nameList);

        //nameList.add(boolean,true); sadece string olabilir

        List items=new ArrayList();
        items.add("banana");
        items.add(1,"orange");

        System.out.println(items);
        System.out.println(items.get(0));
        System.out.println(items.get(1));
        System.out.println(items);

        System.out.println(nameList);
        nameList.remove("John");
        System.out.println(nameList);
        nameList.remove(1);
        System.out.println(nameList);

        ArrayList<Integer>prices=new ArrayList<>();

        prices.add(1);
        prices.add(2);
        prices.add(3);
        System.out.println(prices);
        prices.remove(1);
        System.out.println(prices);

        prices.set(1,5);
        System.out.println(prices);

        System.out.println(prices.isEmpty());
        System.out.println(prices);

        System.out.println(prices.size());












    }
}
