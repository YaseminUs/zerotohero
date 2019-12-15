package Collections;

import java.util.LinkedHashMap;
import java.util.Set;

public class ChildTest {
    public static void main(String[] args) {

        Child child1 = new Child("Civic",10,'M',"Chicago");
        Child child2 = new Child("Mom",5,'F',"Chicago");
        Child child3 = new Child("Yasemin",3,'F',"Schaumburg");
        Child child4 = new Child("Hannah",6,'F',"Ohio");
        Child child5 = new Child("Yunus",1,'M',"Florida");

        LinkedHashMap<Integer,Child> childMap = new LinkedHashMap<>();

        childMap.put(1,child1);
        childMap.put(2,child2);
        childMap.put(3,child3);
        childMap.put(4,child4);
        childMap.put(5,child5);

        Set<Integer>keyList = childMap.keySet();
        for(Integer c:keyList ){
            System.out.println(childMap.get(c).getName());
            System.out.println(childMap.get(c).gotoschool());
            System.out.println(childMap.get(c).isPalindrome(childMap.get(c).getName()));

        }













    }
}
