package Methods;

public class MethodsGetGreatest {

    /*
    Create a method that will accept 3 int numbers and this method will return the greatest number as a int
     */

       public int greatest(int a,int b,int c){
           if(a>b && a>c){
               return a;
           }else if (b>c && b>c){
               return b;
           }else if(c>a && c>b){
               return c;
           }else{
               return -1;
           }
       }

}



