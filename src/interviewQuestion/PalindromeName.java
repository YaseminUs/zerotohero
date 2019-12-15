package interviewQuestion;

public class PalindromeName {

public static boolean isPalindrome(String name){
    int k = name.length();
    for(int i=0;i<k;i++){
        if(name.charAt(i)!= name.charAt(k-i-1)){
            return false;
        }
    }
           return true;
}

    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }


}
