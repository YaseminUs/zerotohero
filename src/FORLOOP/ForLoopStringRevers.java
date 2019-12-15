package FORLOOP;

public class ForLoopStringRevers {
    public static void main(String[] args) {


        String name = "Yasemin";
        String reverse = "";
        // interview Question
        // for loop
        // after for loop print the reverse="remmauM" ;

        for (int i = name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i); //reverse+=name.charat(i)
        }
        System.out.println(reverse);
        if (name.equals(reverse)){
            System.out.println("it is palindrome word");
        }else{
            System.out.println("it is not palindrome");
        }

        //palindrome
        //civic




    }
}