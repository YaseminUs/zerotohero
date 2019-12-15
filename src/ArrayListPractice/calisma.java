package ArrayListPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class calisma {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        System.out.println(colorList);
        colorList.add(1,"pink");
        System.out.println(colorList);
        colorList.add(0,"purple");
        colorList.add(2,"green");
        System.out.println(colorList);

        ArrayList <String>items=new ArrayList<>();
        items.add("apple");
        items.add("banana");

        System.out.println(items.get(1));
        System.out.println(items.get(0));

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("yasemin");
        nameList.add(1,"yunus");
        nameList.add("bera");
        nameList.add(3,"erva");
        nameList.add("azra");
        System.out.println(nameList);
        nameList.remove(0);
        nameList.remove("azra");
        System.out.println(nameList);


        List animal = new ArrayList<>();
        animal.add("lion");
        animal.add("cat");
        System.out.println(animal);
        animal.set(1,"dog");
        System.out.println(animal);
        System.out.println(animal.get(0));

        System.out.println(animal.size());
        System.out.println(animal.isEmpty());
        System.out.println(animal);

        List drinks = new ArrayList<>();
        drinks.add("pepsi");
        drinks.add("tea");
        drinks.set(1,"coffee");
        System.out.println(drinks);
        System.out.println(drinks.contains("coffee"));
        System.out.println(drinks.contains("greentea"));

        List meal=new ArrayList<>(19);
        System.out.println(meal.size());
        meal.add("Beef Bowl");
        meal.add(1,"Chicken");
        System.out.println(meal);

        System.out.println(meal.get(0));
        Object [] restaurant=meal.toArray();








    }

}
