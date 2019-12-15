package WhileLoop;

public class WhileLoopPractice {
    public static void main(String[] args) {

     int age = 20;
     while(age<26){
         System.out.println("Complete circle");
         age++;
     }
      //I wanna print my name 5 times

        int repeatNUmber=5;
        int currentNumber=1;
        while (currentNumber<=repeatNUmber){
            System.out.println(" Muammer");
            currentNumber++;
        }

         //40$ in my phone account
        //every call 5$ how many i can call
        //i can call

        int totalAmount=40;
        int onecall=5;
        int restAmaunt;

        while(totalAmount>0){
            totalAmount=totalAmount-5;//35 /30 /25 /20 /15 /10 /5-5=0
            System.out.println("I can call " + totalAmount);
             //totalAmount++;
        }



    }
}
