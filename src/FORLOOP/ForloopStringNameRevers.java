package FORLOOP;

public class ForloopStringNameRevers {
    public static void main(String[] args) {
        String name = "Yasemin";
        System.out.println(name.length());
        for (int i = name.length()-1;i>=0; i--) {

                System.out.println(name.charAt(i));
        }

        String names = "rumeysa";

        StringBuilder sb = new StringBuilder(names);

        sb.reverse();  // reverse it

        System.out.println(sb);
    }
}


