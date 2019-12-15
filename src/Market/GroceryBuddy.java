package Market;

public class GroceryBuddy extends CheckOut {
    String[] fruits = {"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape", "Mango", "Strawberry", "Peach", "Cherry"};
    String[] vegetables = {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber", "Corn", "Bean", "Spinach", "Pepper"};
    String[] prouducts = {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar", "Salt", "Coffee", "Rice", "Pasta"};

    double[] fruitprice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};
    double[] vegatableprice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};
    double[] prouductprice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};

    int[] fruitStock = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    int[] vegiStock = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    int[] prouductStock = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

    void printFruit() {
        System.out.println("Printing Fruits");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }

    void printvegitable() {
        System.out.println("Printing Fruits");
        for (String vegi : vegetables) {
            System.out.print(vegi + " ");
        }
    }

    void printprouduct() {
        System.out.println("Printing Fruits");
        for (String prouduct : prouducts) {
            System.out.print(prouduct + " ");
        }
    }
}
//
//    double itemPrice(String itemName){
//        for(int i=0;i<prouducts.length;i++){
//          if( prouducts[i].equalsIgnoreCase(itemName)){
//              return prouductprice[i];
//          }
//            for(int i=0;i<prouducts.length;i++){
//                if( prouducts[i].equalsIgnoreCase(itemName)){
//                    return prouductprice[i];
//                }
//                for(int i=0;i<prouducts.length;i++){
//                    if( prouducts[i].equalsIgnoreCase(itemName)){
//                        return prouductprice[i];
//                    }
//        }
//        return -1;//prouducts not find
//    }
//
//}
