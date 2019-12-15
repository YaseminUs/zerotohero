package Methods;

public class MethodPalindromeNumber {
    /* write method it will one parameter as a number
   it will check  the number is palidrome or not
   if it is palidrome it will true else it will return false
   1221 --> it is palidrome it should return true
   456654 ---> it is plaidrome it should return the
   321 --> it is not palidrome it should return false
    */
   /*int original=321;
   int reversed=0; expected 123
   321%10=1
   321/10=32
   32%10=2

   reversed=reversed+1;=======> formula reversed=reversed*10+remainderOriginalValue;
   1*10= 10+2=12
   12*10=120+3=123;
    */
    public boolean isPalindrome(int original) {
        int temp = original;
        int reversed = 0;

        while (temp > 0) {
            int remainderOriginal = temp % 10;//1-2-3
            reversed = reversed * 10 + remainderOriginal;
            temp = temp / 10;
        }
        if (reversed == original) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        MethodPalindromeNumber palindrome = new MethodPalindromeNumber();
        boolean result = palindrome.isPalindrome(1221);
        System.out.println(result);

    }

}
