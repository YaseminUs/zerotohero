package CarInventory;

import java.sql.Array;
import java.util.ArrayList;

    public class CarInventory {

    private String dealerName;

    public CarInventory(String dealerName){
        this.dealerName=dealerName;
    }

    public void getCarName(ArrayList<Car> carList){
        for(Car c:carList){
            System.out.println(c.getName());
        }
    }

    //create the one method to print vinNumbers of the car

    public void getVinNumbers(ArrayList<Car> carList){
        for(Car c:carList){
            System.out.println(c.getVinNumber());
        }
    }
    public void getPrice(ArrayList<Car> carList){
        for(Car c:carList){
            System.out.println(c.getPrice());
        }
    }

     public void getmodelyear(ArrayList<Car> carList){
            for(Car c:carList){
                System.out.println(c.getYears());
            }
        }
     public void setModelYear(ArrayList<Car>carList,String vinNumber,int year){
        for(int i=0;i<carList.size();i++){
            if(carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)){
                carList.get(i).setYears(year);
            }

         }
     }
     public void setModelprice(ArrayList<Car>carList,String vinNumber,int price) {
            for (int i = 0; i < carList.size(); i++) {
                if (carList.get(i).getVinNumber().equalsIgnoreCase(vinNumber)) {
                    carList.get(i).setPrice(price);

                }
            }
        }

     public void addNewCar(ArrayList<Car> carList,Car newCar){
         boolean hasCar=false;
        for(Car c: carList){
            if(c.getVinNumber().equalsIgnoreCase(newCar.getVinNumber())){
                System.out.println("the car is already in the inventory");
                hasCar=true;
            }
        }
     if(!hasCar){
         carList.add(newCar);
         System.out.println(newCar.getName());
         System.out.println("the new car added to your inventory");
       }

     }
     public void removeCar(ArrayList <Car> carList,String vinNumber){

         for(Car c:carList){
             if(c.getVinNumber().equalsIgnoreCase(vinNumber)){
                 carList.remove(c);
             }
         }
     }
     public static void main (String[]args){

                        Car car1 = new Car("Toyota", "Corolla", 2016, 10000, "BR588HB");
                        Car car2 = new Car("Mercedes", "C300", 2018, 40000, "D8HF12H");
                        Car car3 = new Car("Ford", "Malibu", 2000, 1000, "LR5118J");
                        Car car4 = new Car("Toyota", "Camry", 2019, 30000, "IR554H9");
                        Car car5 = new Car("BMW", "X6", 2015, 50000, "KR5655G");
                        Car car6 = new Car("Porche", "Panamera", 2013, 20000, "HGF57854");

                        //create inventory dealer and give the name
                        CarInventory dealer = new CarInventory("Auto");


                        ArrayList<Car> carList = new ArrayList<Car>();
                        //carList.add(car1);
                        carList.add(car5);
                        carList.add(car2);


                        dealer.getCarName(carList);
                        dealer.getVinNumbers(carList);
                        dealer.getPrice(carList);
                        dealer.getmodelyear(carList);
                        dealer.setModelYear(carList, "D8HF12H", 2012);
                        dealer.getmodelyear(carList);
                        dealer.setModelprice(carList,"D8HF12H",50000);
                        dealer.getPrice(carList);
                        dealer.addNewCar(carList,car1);
                        dealer.addNewCar(carList,car1);
                        dealer.addNewCar(carList,car6);
                        dealer.addNewCar(carList,car4);
                        dealer.getCarName(carList);
                        //dealer.removeCar(carList,"BR588HB");

     }

    }
