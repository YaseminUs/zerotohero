package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPractice {



        public static void main(String[] args) {

            LinkedHashSet number = new LinkedHashSet();
            number.add(10);
            number.add(30);
            number.add(20);
            System.out.println(number);

            // linkendHashSet is follows the insertion oder
            // HashSet does not follow the insertion order
            // in LiknedHasset everything is same with Hashset except order
            // all the method which set has, we can use in the LinkedHashSet
            // Set names=new LinkedHashSet() ; another implamentation
            // LinkedHsSet <Integer> number=new LinkedHashSet<>();

            TreeSet<String> eventAttendanceList = new TreeSet<>();
            eventAttendanceList.add("Mike");
            eventAttendanceList.add("Jennifer");
            eventAttendanceList.add("John");
            eventAttendanceList.add("David");
            eventAttendanceList.add("Alice");
            // eventAttendanceList.add(null); treeSet doesn't accept the null values,it will give the null pointer expection

            System.out.println(eventAttendanceList);
            // treeSet follows the ascending order
            //treeset does not accept the null values
            //it will give the null pointer exception

            Iterator<String> i= eventAttendanceList.descendingIterator();
            while(i.hasNext()){
                System.out.print(i.next() + " ");
            }
            System.out.println();
            System.out.println(eventAttendanceList);
            System.out.println("************* PollFirst Method ******************");
            eventAttendanceList.pollFirst();
            System.out.println(eventAttendanceList);
            System.out.println("**************** PollLast Method ******************");
            eventAttendanceList.pollLast();
            System.out.println(eventAttendanceList);


        }
    }

