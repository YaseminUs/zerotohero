package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {

        Map mapList = new HashMap();
        //Map <key, values> employeeList
        Map<Integer, String> employeeList = new HashMap<>();

        employeeList.put(1234, "Yasemin");
        employeeList.put(1235, "Rumeysa");
        employeeList.put(1236, "Merve");
        employeeList.put(1237, "Nazire");
        employeeList.put(1237, "Sameer");
        //i can store same values but key should be unique
        //if you provide the same key with diffrent value
        //it will uptade the value for key
        System.out.println(employeeList);

        HashMap<Integer, String> ticketMasterEmp = new HashMap<>();
        ticketMasterEmp.putAll(employeeList);

        //get method.it will take the key as a parameter and it will return the value

        String empName = ticketMasterEmp.get(1234);
        String empName1 = ticketMasterEmp.get(1235);
        System.out.println(empName);
        System.out.println(empName1);
        System.out.println(ticketMasterEmp);

        ticketMasterEmp.remove(1236);
        System.out.println(ticketMasterEmp);

        //method called keySet(), it will return Set of all the keys from map
        Set<Integer> empIds = ticketMasterEmp.keySet();

        for (Integer id : empIds) {
            System.out.println("Name of the employee is " + ticketMasterEmp.get(id));
        }
        for (Integer id : empIds) {
            System.out.println("id of the employee is " + id);

            /*to be able to print all the values
            1-using the keySet() method get all the keys
            2-keySet() method return type is Set. Thats why, i can store as a Set
            3-create foreachnloop
            4-using get() method from HashMap, i can give the keys
            5-it will get all the values
            */
        }







    }
}