package interviewQuestion;

public class PerfectNumber {
    public static void main(String[] args) {


        int num = 6;
        int sum = 0;
        for( int i = 1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
            }
        if(num==sum){
            System.out.println(num+ " is perfect number");
        }else{
            System.out.println(num+ " is not perfect number");
    }

    }
}