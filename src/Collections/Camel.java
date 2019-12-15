package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Camel {

    //using HashMap create one Camel List
    //Every Camel has different animalId as a String"1P32M","2PMA4"
    //Store 5 diffrent camel with their name
    //create one method it will take one parameter as a map
    //it will print only Camel names,if the id is starting with 1.

    String camelName;
    String animalId;

    //create one method it will take one parameter as a map
    public static void getNames(Map<String,String>map){
        Set<String>camelName=map.keySet();
        for(String cl:camelName){
            if(cl.startsWith("1")){
                System.out.println(map.get(cl));
            }
        }

    }

    public static void main(String[] args) {

        HashMap<String,String> camelNameList=new HashMap<>();

        camelNameList.put("1P32M","Camel1");
        camelNameList.put("2P32M","Camel2");
        camelNameList.put("3P32M","Camel3");
        camelNameList.put("1P32P","Camel4");
        camelNameList.put("1P32K","Camel5");
        getNames(camelNameList);
        System.out.println(camelNameList);camelNameList.containsValue("Camel5");

        System.out.println(camelNameList.entrySet());//entryset method will return all the keys and
        //camelNameList.clear();//clear method will remove every element from the map
        System.out.println(camelNameList);camelNameList.containsValue("Camel4");
        System.out.println(camelNameList.containsKey("3P32M"));
        System.out.println(camelNameList.containsKey("1P32M"));

        HashMap<String,String> camelNameList1=new HashMap<>(camelNameList);

        System.out.println(camelNameList1);
        System.out.println(camelNameList.equals(camelNameList1));

        camelNameList.replace("3P32M","Camel8");
        System.out.println(camelNameList);
        camelNameList.put("1P32K","Camel10");
        System.out.println(camelNameList);



    }




}

