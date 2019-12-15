package MyPractice;

public class ReverseString {
    public void reverseString(String str){
        // str.split(" "); // split is returning as a array
        String [] words=str.split(" ");
        String reversed=" ";
        for (int i=words.length-1;i>=0;i--){
            reversed+=words [i] + " ";  // you   //  love //  l=== it will give youlovel
        }
        reversed.trim();
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        ReverseString test=new ReverseString();
        String name="l love you";
        test.reverseString(name);
    }
}


