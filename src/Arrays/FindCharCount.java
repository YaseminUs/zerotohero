package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindCharCount {

    //create one method will take the string as  a value
   // and this method will print letters of the String with count

    public static void getLetter(String str){

        Map<Character,Integer> letters = new HashMap<>();
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (letters.containsKey(ch)) {
                int count =  letters.get(ch);
                letters.replace(ch,++count);
            }else{
                letters.put(ch,1);
            }
        }
        System.out.println(letters);
    }

    public static void main(String[] args) {
        FindCharCount.getLetter("Muammer");
        FindCharCount.getLetter("Yasemin");

    }



}
