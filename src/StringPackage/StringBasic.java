package StringPackage;

public class StringBasic {


        public static void main(String[] args ){

            String name="Techtorial";
            System.out.println(name);
            //student name==sname
            String sName=new String ("Yalcin");
            System.out.println(sName);

            String age="20";
            System.out.println(age);
            System.out.println(age+20);
            System.out.println("My age is " + age);

            String numberA="5";
            String numberB=" 9 ";
            System.out.println(numberA+numberB);

            String number1="5 is my best number";
            String number2=" I repeat 9 time string";
            System.out.println(number1+number2);




            System.out.println("5" + "9");//it is double code"" its mean string 59
            System.out.println("t" +(5+1) +"c");//t6c
            System.out.println("t" +"c");//tc
            System.out.println((5+1)+"t" +"c");//6tc
            System.out.println("t" +"c" +1+5);//tc15
            System.out.println("t"+"c"+ +1*5);//tc5


            String number ="2";
            number+="5"; //number="2"+"5";----25
            System.out.println(number);
            System.out.println("t"+"c"+(1-5));//tc-4
            //System.out.println("t"+"c"+1-5);//compile erorr(parantez koyman gerek)

            int numbe=1;
            String numbe3="3";
            System.out.println(1+5+numbe+numbe3);//73

            String Name="Yasemin";
            System.out.println(Name);

            String weathertemp="73";
            System.out.println("weathertemp is "+ "73");




        }
    }


