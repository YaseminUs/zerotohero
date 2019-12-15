package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        //it will fallow insetion order
       Map<Integer, String> studentList = new LinkedHashMap<>();
//in java, if you sending multiple thread at the same ,

       // synronization
       // if your code is waiting previuos thread to copmleate
       // it means your code your code is thread-safe or it is called the code is synronization
       studentList.put(1,"Yasemin");
       studentList.put(2,"Rumeysa");
       studentList.put(3,"Merve");


       System.out.println(studentList);
    }
}
