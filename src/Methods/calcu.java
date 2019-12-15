package Methods;

public class calcu {
//Public void (it is not returning anything only println)myMethods
// public —>access modifier
// void —> return type
// myMethod—>method name
// String name—>Parameter(karakteristik)
// myMethod(String name) ——>signature
//Public  static void myMethod(String name){
// Body  sout (“My name is: “ +name);



    // Write a method that will accepts two int parameters
    // and will return sum of there two integers as a int
    // if it is not specifing it means it is public


    public int sum (int num1,int num2){
        int sum = num1+num2;
        return sum;
    }

    public int subtract(int num1,int num2){
        int subtract = num1-num2;
        return subtract;
    }

    public int multiplye(int num1,int num2){
        return num1*num2;
    }

    public int division(int num1,int num2){
        return num1/num2;
    }

    public int remind(int num1,int num2){
        return num1%num2;
    }

    public boolean reminder(int num1,int num2){
        if(num1%num2==0){
            return true;
        }else if(num1%num2!=0){
            return false;
        }
        return false;
    }
    public int remindernumber(int num1,int num2){
        return num1%num2;
    }

     // Write a method that will accept 3 parameters,
    // which two are integer numbers and one string operator
    // Will return the result for these two number based on their operator

    public int calculator(int num1,int num2,String operator){
        if(operator.equals("+")){
            return sum(num1,num2);
        }else if(operator.equals("-")){
            return subtract(num1,num2);
        }else if(operator.equals("*")){
            return multiplye(num1,num2);
        }else if(operator.equals("/")){
            return division(num1,num2);
        }else if(operator.equals("%")){
            return remindernumber(num1,num2);
        }else{
            System.out.println("your operator is invalid ");
            return -1;
        }


    }



}

