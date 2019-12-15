package StringPackage;

public class ReverseString {

    // String name= "Techtorial";length--10
    //index number of l is 9
    //lairothceT

    public String reverse(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);

        }
        return reversed;
    }


    public static void main(String[] args) {
        String name = "Techtorial school";
        ReverseString rev = new ReverseString();
        String reversed = rev.reverse(name);
        System.out.println(reversed);
        System.out.println(name);
    }

}