package ArrayListPractice;

import java.util.ArrayList;

public class ManipulateString {

    //TASK
    //Create One class called ManipulateString
    //Create instance variable called mainString
    //Create constructor with no argument
    //create constructor with one argument and initialize the main String

    //Method 1:
    //Create method called sumNumber()
    //take no parameter and it will get the sum of number found in String
    //if there no number present in String it will return 0
    //"M4T98KL1"
    //Character.isDigit()

    //Method 2:
    //Create method called getLetterList()
    //Take no paramter and it will return the list of character present in String
    //Store letters to the arraylist and return the arraylist(Note do not store the numbers which present in string)
    //Create class called ManipulateStringTest with main method
    //Create one object and call the methods.
    //Character.isAlphapet

    String mainString;//instance field or instance variable

    public ManipulateString() { // constructor no argument ( same with class name)

    }

    public ManipulateString(String mainString) { // constructor with  one argument
        this.mainString = mainString; // initializing the instance field
    }
     /*  note
    --how to convert char to string
    'a' === > "a"
    char an='a';
    String ch= ""+ 'a';string

    --how to convert char to string
    String ch1=String.valueof(an)*/

    public int sumNumber() {//this is method with int return type
        int sum = 0; // --> this is local variables, it will not take any default value. You should initialize the local variables

        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isDigit(mainString.charAt(i))) { // isDigit will check the char is digit or not
                String ch = String.valueOf(mainString.charAt(i)); // valueOf method in string will return the String. It will convert char to String
                int num = Integer.parseInt(ch); // parseInt method will convert String to int
                sum += num;
            }

        }
        return sum;
    }

    public ArrayList<Character> getLetterList() {
        ArrayList<Character> letterList = new ArrayList<>();
        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isAlphabetic(mainString.charAt(i))) {
                letterList.add(mainString.charAt(i));

            }
        }
        return letterList;
    }

}


