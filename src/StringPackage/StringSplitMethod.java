package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String schoolName = "Techtorial Academy 2019 September April";
        String[] words = schoolName.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (word.startsWith("A")) {
                System.out.println(word);
            }
        }


        //split the string and print only year
          String date = "09/16/2019";
          String [] dates=date.split("/");
          //System.out.println(Arrays.toString(calender));
          System.out.println(dates[0]);
          System.out.println(dates[1]);
          System.out.println(dates[2]);
          //Note:to be able split the string you need to use the split method.
          //If you wanna split with the (.) you need to use two back slashes.

          String startDate="09.16.2019";
          String [] startDates=startDate.split("\\.");
          System.out.println(Arrays.toString(startDates));
          System.out.println(startDates[0]);
          System.out.println(startDate.replace("1",""));

          //Example
          //String date=“09.16.2019”;
         //date.split( “ \\ .”); —> it will split with the dot



          }

    }
