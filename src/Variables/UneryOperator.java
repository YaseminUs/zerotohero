package Variables;

public class UneryOperator {

    public static void main(String[] args){


                int studentAge=25;
                studentAge++;//26
                studentAge--;//25
                ++studentAge;//26
                --studentAge;//25
                studentAge=studentAge++;//25
                studentAge=++studentAge;//26
                //studentAge=studentAge++;//it didnot change after
                studentAge=2*studentAge++;//2*26=52
                studentAge=2*++studentAge;//once arti sonra carpma
                //2*27=54

                int x=3;
                //int k=++x*5;
                int k=++x*5/x--+--x; //4*5/4=5 x=3
                //x=2
                //k=7
                //k=4*5/4+2=7


                System.out.println(x);//4
                System.out.println(k);//20

                int n=4;
                int r=++n+n++-2;
                //r=5+5-1-->9
                //n=6
                //n will increase after finishing the execution
                //execution will finish with semicolon

                System.out.println(n);
                System.out.println(r);















            }
        }


