package StaticPractice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static StaticPractice.StaticReview.test;
import static StaticPractice.StaticReview.*; //two way to import static
import static java.lang.Math.addExact;

public class StaticTest {
    public static void main(String[] args) {

                StaticReview rev=new StaticReview();
                StaticReview rev1=new StaticReview();
                StaticReview.test();
                rev.test1();
                test();

        System.out.println(addExact(10,5));

        System.out.println(add(6,4));
        System.out.println(subs(10,20));
        System.out.println(subs(15,15));
        System.out.println(divide(32,2));




        System.out.println("****Set Method******");

        List<Integer> num=new ArrayList<>();

        num.add(1);
        num.add(4);
        num.add(2);
        //how this ArrayList ordered? but in SET it is not unordered
        System.out.println(num);
        Collections.sort(num); //kucukten buyuge siralama ArrayList
        System.out.println(num);









    }
        }