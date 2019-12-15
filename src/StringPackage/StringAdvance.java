package StringPackage;

public class StringAdvance {
    public static void main(String[] args){
        //initialize the name
        String name="Muammer";
        //re- assigning the name
        name="Aslan";
        System.out.println(name);

        String sname=name+ " Ali"; //name+"Ali"= Aslan Ali
        System.out.println(sname);//Aslan Ali


        String schoolName="Techtorial";
        String academyName=schoolName.concat("Academy");
        System.out.println(academyName);
        academyName.concat("2019");//no assigment
        academyName=academyName.concat("2019");//assigne
        System.out.println(academyName);

        String computerName="Mac Pro";
        System.out.println(computerName+ " 2019");// Mac Pro 2019
        computerName=computerName+ " 2019";
        System.out.println(computerName); //Mac Pro

        String scName="Techtorial";
        //lenght() will return number of the char in string
        //result will be int
        System.out.println("String lenght is " + scName.length());

        String fullname=schoolName+" Academy";
        System.out.println("Fullname lenght is "+ fullname.length());

        String username="techtorial2400";
        //int olaral lenght i sorucak olursak
        int userNameLenght=username.length();
        System.out.println(userNameLenght);
         //in java counting start from the 1
        //in java indexing start from 0


         //charAt()

         System.out.println(username.charAt(0));   //t
         System.out.println(username.charAt(3));  // h
         System.out.println(username.charAt(7));  // i
         //System.out.println(username.charAt(15)); //run time error
         //if in the index there is not char, java will throw an exception

          System.out.println(username.charAt(username.length()-1));
          //if you wanna find out last char from the string
          //we need first find out the length of string
          //son karakteri sorunca charAt(lenght-1)
        
          String usename="ggldgwlgdlgvdgvldbhvchvlhlhfvlvh";
          int length=usename.length();
          System.out.println("usename lenght is "+ length);
          System.out.println(usename.charAt(length-1));
          
          //ortadaki karakteri sorunca(middle char)
          // a  b  c  d  e  f--->7  d=3
          // charAt(lenght-1)/2
          // charAt(lenght-1)
        
          String success="hustlingst";
          System.out.println(success.indexOf("s"));  //2
          //indexOf will return first matching values index(ayni harften varsa)
          System.out.println(success.indexOf("s" , 3));
          System.out.println(success.indexOf("in")); //5
          System.out.println(success.indexOf("ling"));  //4
          System.out.println(success.indexOf("k")); //-1  not avaiable

          /*charAT will return the char from giving index.
          will throw an exception lenght 10--->15th */
          /*indexOf will return index from giving String.
          if there is not matching it will give the -1 */

           // print find the "last char from the String"
           // print the middle char from the string
           // print the first char from the string
           // find the second matching index of 'n' from the string
           // print the length of String
           // print index of 'k'
           // print the 20th char

           String animal="Dragon Animal";
           System.out.println("last char from the String " + animal.charAt(animal.length()-1));   //(lenght-1)
           System.out.println("middle char from the string " + animal.charAt((animal.length()-1)/2)); //(lenght-1)/2  //space
           System.out.println("first char from the string " + animal.charAt(0));
           System.out.println("second matching index of 'n' from the string " + animal.indexOf("n" ,animal.indexOf("n") +1));
                                                                              //(animal.indexof("n" , 6 ));

           System.out.println("length of String " + animal.length());
           System.out.println("index of 'k'" + animal.indexOf("k"));
           System.out.println("20th char" + animal.charAt(20));   //throw the exception






    }
}
















