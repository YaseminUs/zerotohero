package StringPackage;

public class MethodChaining {

    public static void main(String[] args){


       String city="Des Plaines ";
        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());
        System.out.println(city.indexOf("P"));
        System.out.println(city.contains("ines"));
        System.out.println(city.endsWith(" "));
        System.out.println(city.startsWith("De"));
        System.out.println(city.substring(4, 7));
        System.out.println(city.charAt(0));
        System.out.println(city.length());
        System.out.println(city.charAt(city.length()-1));
     System.out.println(city.charAt(city.length()-1)/2);
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.trim());
        System.out.println(city.replace("Des" ,"One"));
        System.out.println(city.equalsIgnoreCase("des plaines"));



        //after following method we can do method chaining
        //substring, touppercase, tolowercase, replace,trim
        //after following methods we can NOT do methods chaining
            //lenght, charAt, indexof contains, equalsIgnoreCase, startwith, endwith
              //number, char, number, true/false,  true/false,        t/f,      t/f











    }
}
