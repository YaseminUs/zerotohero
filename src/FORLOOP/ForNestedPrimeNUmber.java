package FORLOOP;

public class ForNestedPrimeNUmber {
    public static void main(String[] args) {


        System.out.println("2");
        //1-100
        int count=0;
        for(int i=3;i<100;i++){
            for(int k=2;k<i;k++){
                if(i%k==0){
                    count++;
                }
            }
            if(count>0){ // 1 > 0 true
                System.out.println(i+"is not prime number");
            }else{
                System.out.println(i+"is prime number");
            }
            count=0;
        }
        // 2/2
        // 13%2==1
    }
}
