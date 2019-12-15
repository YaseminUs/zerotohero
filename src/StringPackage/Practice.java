package StringPackage;

public class Practice {
   public static void main(String[] args) {

       //task

        //Create one method. it will take one parameter as a String array.
        // it will return concatination of String values from array.
        //String [] str={"Tech", "2019","Coding"};
        //exmple=output:
        //Tech2019Coding

       Practice pr=new Practice();
       String [] str={"Tech", "2019","Coding"};
       System.out.println(pr.function(str));
       pr.function((new String []{"j","a","v","a"}));

   }

    public String function(String[] arr){
        String name="";

        for(String s:arr){
            name+=s;
        }
        return name;


    }



}
