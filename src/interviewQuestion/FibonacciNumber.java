package interviewQuestion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a =1;
        int b = 1;
        int c;
        System.out.print(a+" "+b);
        for(int i=1;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" " + c);

        }
        System.out.println();
        int num1 = 1;
        int num2 = 1;
        int sum = 0;
        System.out.print(num1+ " "+ num2);
        for(int i=1;i<13;i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(" " +sum);
        }
        System.out.println();
        int x = 1;
        int y = 1;
        int z =0;
        System.out.print(x + " "+ y);
        for(int i=1;i<13;i++){
            z = x + y;
            x = y;
            y = z;
            System.out.print(" "+ z);
        }
        System.out.println();
        int sayi1 = 1;
        int sayi2 = 1;
        int toplam = 0;
        System.out.print(sayi1+" "+sayi2);
        for(int i=1;i<13;i++){
            toplam = sayi1+sayi2;
            sayi1=sayi2;
            sayi2 = toplam;
            System.out.print(" "+ toplam);
        }
        System.out.println();
        int number1 = 1;
        int number2 = 1;
        int summ = 0;
        System.out.print(number1+ " "+ number2);
        for(int i=1;i<24;i++){
            summ = number1+number2;
            number1 = number2;
            number2 = summ;
            System.out.print(" "+ summ);
        }
        System.out.println();


        int j = 1;
        int k = 1;
        int summm = 0;
        System.out.print(j+ " "+ k);
        for(int i=1;i<=10;i++){
            summm = j+k;
            j = k;
            k = summm;
            System.out.print(" "+ summm);
        }
        System.out.println();

        int n1 = 1;
        int n2 =1;
        int s = 0;
        System.out.print(n1+ " "+ n2);
        for(int i=1;i<=13;i++){
        s = n1+n2;
        n1=n2;
        n2=s;

            System.out.print(" "+ s);
        }
    }

}
