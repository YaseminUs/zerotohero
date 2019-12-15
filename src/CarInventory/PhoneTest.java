package CarInventory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhoneTest {

     private String Seller;

     public PhoneTest(String Seller){
         this.Seller=Seller;
     }
     public void getbrand(ArrayList<Phone> phoneListe) {
         for (Phone p : phoneListe) {
             System.out.println(p.getBrand());
         }
     }
     public void getmodel (ArrayList < Phone > phoneListe) {
             for (Phone p : phoneListe) {
                 System.out.println(p.getModel());
             }
            }
     public void getyear(ArrayList<Phone>phoneListe){
         for (Phone p : phoneListe){
             System.out.println(p.getYear());
         }
     }
     public void getprice(ArrayList<Phone>phoneListe){
         for(Phone p: phoneListe){
             System.out.println(p.getPrice());
         }
     }
     public void changemodel(ArrayList<Phone>phoneList,String model){
         for(int i =0 ;i<phoneList.size();i++){
             if(phoneList.get(i).getModel().equalsIgnoreCase(model)){
                phoneList.get(i).setModel(model);

             }
         }

     }
     public static void main(String[] args) {

    Phone phone1 = new Phone("Apple","iphone",2017,1000);
    Phone phone2 = new Phone("Samsung","S10",2018,2000);
    Phone phone3 = new Phone("Google","Nexux",2016,500);


    PhoneTest Seller = new PhoneTest("At&t");
    ArrayList<Phone> phoneList = new ArrayList<>();
    phoneList.add(phone2);
    phoneList.add(phone1);

    Seller.getbrand(phoneList);
    Seller.getmodel(phoneList);
    Seller.getyear(phoneList);
    Seller.getprice(phoneList);
    Seller.changemodel(phoneList,"max");
    Seller.getmodel(phoneList);




    }
}
