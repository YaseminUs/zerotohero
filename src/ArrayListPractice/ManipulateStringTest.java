package ArrayListPractice;

import java.util.ArrayList;

public class ManipulateStringTest {
    public static void main(String[] args) {
        ManipulateString str = new ManipulateString("M4T98KL1");
        int sumNumber = str.sumNumber();
        System.out.println(sumNumber);

        ArrayList<Character> letterlist=str.getLetterList();
        System.out.println(letterlist);
    }
}
