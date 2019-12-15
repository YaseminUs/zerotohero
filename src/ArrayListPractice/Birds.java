package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Birds {

    public static void main(String[] args) {

        List<String> birdList= new ArrayList<String>();

        birdList.add("Owl");
        birdList.add("Parrot");
        birdList.add("Penguin");

        Object []  listOfBird = birdList.toArray();

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(11);
        number.add(55);

        Object [] numList = number.toArray();
        //if you ara converting from ArrayList to Array using toArray() method
        //you can onlhy store as a object the array
        //toArray() method will return the object

        /////////////////////////////////////////

        String [] city={"Chicago","New York","San Francisco"};
        System.out.println(city.length);

        List <String> cityNames= Arrays.asList(city);
        System.out.println(cityNames.size());

        //cityNames.add("Los Angeles");
        //System.out.println(cityNames.size());
        // ArrayList is not fixed size.
        // However if you convert from Array to ArrayList size will be fixed.

        List <String> cityNames1=new ArrayList<>(cityNames);
        System.out.println(cityNames1.get(0));
        cityNames1.add("Los Angeles");
        System.out.println(cityNames1);

        // Task Change all the elements of CityNames1 with uppercase string

        for(int i=0;i<cityNames1.size();i++){
            cityNames1.set(i,cityNames1.get(i).toUpperCase());
        }
        System.out.println(cityNames1);



    }
}
