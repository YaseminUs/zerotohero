package WhileLoop;

public class LoopPricticeMeal {
    public static void main(String[] args) {
        //you have one plate of meal
        //if you take 10 spoon, you finished your meal
        //Print every spoon of meal you take

        //1 spoon
        //2 spoon
        //3 spoon
        //...
        //...
        // 10 spoon
        int spoonNumber = 1;
        while (spoonNumber <= 10) {

            System.out.println(spoonNumber + " spoon ");
            spoonNumber++;
        }

        int mealNumber = 1;
        while (mealNumber <= 10) {

            System.out.println(mealNumber + " meal ");
            mealNumber++;
        }

        //Zero LOOp Iteration

        //if your boolean condition is returning false, there will any no any
        //you wanna buy the phone.phone price is 800$
        //you have 400$
        //how many times you can buy the phone

        int phoneprice=400;
        int currentmoney=800;
        while (currentmoney>=phoneprice){
               currentmoney= currentmoney/phoneprice;
               //currentmoney++;
            System.out.println("you can buy phone" +currentmoney + " times");

        }








    }
    }

