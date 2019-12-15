package MyPractice;

import java.nio.file.attribute.UserPrincipalLookupService;

public class Ornek {
    public static void main(String[] args) {
        System.out.print("i is : ");  //arttirma
  for(int i=0;i<=5;i++){
      System.out.print(i+ " ");
  }
        System.out.print("\nj is : ");//azaltma
  for(int j=5;j>=0;j--){
      System.out.print(j+ " ");
  }
 //1-10
        System.out.print("\nk is : ");//iki sayi arasi
  for(int k=1; k<=10; k++){
      System.out.print(k+ " ");
  }
        System.out.print("\nm is : ");//10 ar 10 ar arttirma
  for(int m=0;m<=100;m+=10){
      System.out.print(m+ " ");
  }
        System.out.print("\nm is : ");//50 ser 50 ser arttirma
  for(int a=0;a<=1000;a+=50){
      System.out.print(a+ " ");
  }
        System.out.print("\nb is : ");//5 er 5 er eksiltme
  for(int b=50;b>=0;b-=5){
      System.out.print(b+ " ");
  }
        System.out.print("\nc is : ");//10 ar ar eksiltme
  for(int c=100;c>=0;c-=10){
      System.out.print(c+ " ");
  }
        System.out.print("\ny is : ");//10 ar arttirma
  for(int y=0;y<=100;y+=10){
      System.out.print(y+ " ");
  }
        System.out.print("\nx is : ");//2 ser arttirma
  for (int x=0;x<=50;x+=2){
      System.out.print(x+ " ");
  }
        System.out.print("\ns is : ");//2ser eksiltme
  for(int s=50;s>=0;s-=2){
      System.out.print(s+ " ");
  }

      int sum=0;
  for(int i=0;i<=5;i++){        //toplama
      sum=sum+i;
      System.out.println( sum  + " ");
  }

        int count=0;
  for(int i=30;i<=50;i++){        //iki sayi arasi toplama
      System.out.print(count +i+ " ");

  }
        int times=2;
  for(int i=0;i<=10;i++){
      System.out.println(i +"*" + times + "=" + i * times );//2 se carpim tablosu

  }
  int n=5;
  for(int i=1; i<=10; i++) {
            System.out.println(n+" * "+i+ " = "+(i*n));//5 er carpim tablosu
  }

  times=8;
  for(int i=1; i<=10; i++){
      System.out.println(times+ "*" +i+ "=" + (times*i));//8 er carpim tablosu
  }
  n=3;
  for (int i=1; i <= 5; i++)
  {
      System.out.println(n+"*"+i+" = "+(n*i));

  }

        int i,fact=1;
        int number=5;         //It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);


  int factorial=1;
  int num=5;
  for(i=1;i<=num;i++){
      factorial=factorial*i;

  }
        System.out.println("Factorial of " + num + " is: " +factorial );


  int factal=1;
  int Number=3;
  for(int j=1;j<=Number;j++){
      factal=factal*j;
      System.out.println("Factorial Of  : " + Number + " is " +factal );
  }






    }
    }
