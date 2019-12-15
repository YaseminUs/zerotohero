package Arrays;

import java.util.Arrays;

public class ArraysSortString {
    public static void main(String[] args) {
        String[] letters={"b","aa","ab" ,"w","q","c","p"};
        //Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println(Arrays.binarySearch(letters,"d"));
        System.out.println(Arrays.binarySearch(letters,"A"));
        System.out.println(Arrays.binarySearch(letters,"b"));
    }
    }


