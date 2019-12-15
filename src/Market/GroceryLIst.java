package Market;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryLIst extends GroceryBuddy{

    ArrayList<String> cart = new ArrayList<>();

    void addItemToCart(String itemName){
        cart.add(itemName);
    }
    void printCartItems(){
        System.out.println("Item inside of the cart:");
        for(String item : cart){
            System.out.print(item+ " ");
        }
    }
//    double totalPrice(){
//        double sum = 0;
//        for(int i=0;i<cart.size();i++){
//            sum = sum + itemPrice(cart.get(i));
//        }
//        if(sum >= 100){
//            sum = sum*0.85;
//        }else if (sum >= 50 && sum < 100){
//            sum = sum*0.9;
//        }
//
//    return sum;
//    }

    void modifyCart (String newItem ,int position){
        //your code goes here please complete the method
    }
    void removeItem (String itemName){
        //your code goes here please complete the method
    }
    int findItem(String itemName){
        //your code goes here please complete the method
    return 0;
    }
    void printAllItem(){

    }

    public static void main(String[] args) {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print Grocery Menu. ");
        System.out.println("\t 1 - To print choice options. ");
        System.out.println("\t 2 - To print the list of grocery items. ");
        System.out.println("\t 3 - To add an item to the list. ");
        System.out.println("\t 4 - To modify an item in the list. ");
        System.out.println("\t 5 - To remove an item from the list. ");
        System.out.println("\t 6 - To search for an item in the list. ");
        System.out.println("\t 7 - To check out the cart");
        System.out.println("\t 8 - To Payment");
        System.out.println("\t 9 - To quit the application.");
    }

}
