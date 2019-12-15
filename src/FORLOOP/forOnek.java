package FORLOOP;

public class forOnek {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("yasemin");
        }

        //1-100 sum
        int sum=0;
        for(int i=0;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        int num=6;
        int factorial=1;
        for(int i=1;i<=6;i++){
            factorial=factorial*i;
            System.out.println(factorial);

        }
        int num1=0,num2=1,sum1=0;
        System.out.println(num1+ " " + num2);
        for(int i=1;i<8;i++){
            sum1=num1+num2;
            num1=num2;
            num2=sum1;
            System.out.println(" " + sum1);
        }

        //100 den 1 e kadar olan tek sayilar

        for(int i=100;i>=1;i-=2){
            System.out.print(i+ "-");
        }






    }

}
