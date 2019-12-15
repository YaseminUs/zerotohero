package interviewQuestion;

public class PrimeNumber {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                   count++;
                }
            }
        if(count>0){
            System.out.println(i+ " is not prime number");
        }else{
            System.out.println(i+ " is prime number");
        }
        count=0;
        }
    }
}
