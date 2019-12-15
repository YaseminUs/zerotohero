package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        //since set is interface you can not instantiate the set
        //HashSet, LinkedHashSet, TreeSet
        //set requires the import
        //it is coming from util package in java

        Set<Integer> number = new HashSet<Integer>();
        number.add(1);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println(number);
        //*hashSet is not allowing to store duplicate element
        //*add method--> first checking the element is store to the Set or not
        //if the value is not stored before it will store the value
        //if the value is already present in the set it will not store

        Set<Integer> values=new HashSet<>();
        values.addAll(number);
        System.out.println(number);

        Iterator<Integer> iterate = values.iterator();
        while(iterate.hasNext()){
            if(iterate.next()==20){
                System.out.print(iterate.next()+ "-");
            }

        }
        System.out.println();
        for(Integer num:values){
            if(num==20){
                System.out.println("this is from the foreach loop " + num);
            }
        }

        System.out.println(values.contains(40)); // contains true or false
        System.out.println(values.contains(50));

        values.clear();
        System.out.println("this is after clear method");
        System.out.println(values);
        System.out.println(values.isEmpty());


        System.out.println(number);
        number.remove(40);
        System.out.println("this is after remove method"+ number);



        Set<String> names= new HashSet<String>();
        names.add("Adam");
        names.add("Steve");
        names.add("Bill");
        names.add("john");

        Set<String> personNames =new HashSet<>();
        personNames.addAll(names);
        personNames.add("Arnold");
        personNames.add("Mike");

        System.out.println("This is before the remove all method");
        System.out.println(personNames);
        personNames.removeAll(names);

        System.out.println("this is after removeAll method");
        System.out.println(personNames);

    }
}