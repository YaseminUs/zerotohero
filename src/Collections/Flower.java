package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Flower {

    //Create the program that implements flowerlist according to their species
    //Create the Flower class that having instance variables name, barcodeNumber and Set as a flowers
    //Create one constructor with two argument constructor
    //Create one method to add the flowers to Set collection with flowers name and barcodeNumber
    //Create one method to find the flowers from the Set. this method will take one parameter as a name of the flower and it will return the barcodeNumber of the flower
    //Create one method to find the flowers from the set. This method will take one parameter as a barcode number of the flower and it will return the name of the flower
    //Create one method to remove the flower from the set and with flower name.
    //Create one method to print all the flower name from the Set.
    //Create FlowerTest to test your application, create one object from the Flower class and store the ten flowers to your list.

    //Create the Flower class that having instance variables name, barcodeNumber and Set as a flowers
    String names;
    int barcodeNumber;
    HashSet<Flower> flowerList;

    //Create one constructor with two argument constructor
    public Flower(String names, int barcodeNumber) {
        this.names = names;
        this.barcodeNumber = barcodeNumber;
        flowerList = new HashSet<>();
    }
    //Create one method to add the flowers to Set collection with flowers name and barcodeNumber
    public void addFlower(String name, int barcodeNumber) {
        flowerList.add(new Flower(name, barcodeNumber));
    }
    //Create one method to find the flowers from the Set.
    // this method will take one parameter as a name of the
    // flower and it will return the barcodeNumber of the flower
    //and it will return the barcodeNumber of the flower
       //pink flower
    public int findFlower(String name) {
        for (Flower fl : flowerList) {
            if (fl.names.equalsIgnoreCase(name)) {
                return fl.barcodeNumber;
        }
    }
        System.out.println("this flower is not available ");
        return 0;
    }
    public String findFlower(int barcodeNumber){
         for(Flower fl: flowerList){
             if(fl.barcodeNumber==barcodeNumber){
                 return fl.names;
             }
         }
        System.out.println("this flower is not available ");
         return null;
     }

    //Create one method to remove the flower from the set and with flower name.
    public void removeFlower(String name){
        ArrayList<Flower>flowersList = new ArrayList<>(flowerList);

        for(int i=0;i<flowerList.size();i++){
           if(flowersList.get(i).names.equalsIgnoreCase(name)){
               flowersList.remove(flowersList.get(i));
           }
           }
        flowerList=new HashSet<>(flowersList);
    }

        //Create one method to print all the flower name from the Set.
    public void printAllFlower(){
        for(Flower fl: flowerList){
            System.out.println(fl.names);
        }
     }

}
