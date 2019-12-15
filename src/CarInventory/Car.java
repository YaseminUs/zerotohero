package CarInventory;


//HOMEWORK
// Create a program that implements a simple Car Inventory functions for car with the following capabilities.
// Able to enter, modify, remove and get the car information.
// You need to create the separete class (Named Car) for the Car information (name, model, year, price, vinNumber).
// Note: vinNumber is unique for every Car.
// For Car class :
// 1- Create one no argument constructor.
// 2- Create one one argument constructor to set up the name.
// 3- Create one 4 argument constructor and call one argument constructor to set up the name
// and for other four fields ( model, year, price, vinNumber) initialize using constructor.


// Create CarInventory class (Master Class) that holds the ArrayList of Cars. Inside this class create 10 different car object.
// Store all the cars inside the arraylist.
// The CarInventory class has the functionality listed above.
// 1- Write the method that printlist of car. This method will take the arraylist as a parameter
// and will print the only car names which is available in our inventory.
// 2- Write the method that printprices of the cars. This method will take the arraylist as a parameter
// and will print the only car prices which is available in our inventory.

// 3- Create one method to change the model year of the car which is avaliable in our inventory.
// This method will take two parameter one is vinNumber of the car and model year.
// This method will find the car with vinNumber and if vinNumber is matching it will change the model year of the car.

// 4- Create one method to change the model price of the car which is avaliable in our inventory.
// This method will take two parameter one is vinNumber of the car and model year. This method will find the car with vinNumber
// and if vinNumber is matching it will change the price of the car.
// 5- Create one method to add the new car to the arrayList. It will take the object of Car as a parameter
// and it will check the vinNumber of the car. If the car is not avaliable in your inventory
// it will add it to your Arraylist. If it is avaliable, it will print the car is avaliable in the inventory.
// 6- Create one method to remove the car from your inventory. This method will take the vinNumber as a paramter
// and it will remove the car from inventory and will print the car is deleted from inventory.
// If the vinNumber is not in your inventory, this method will print the car is not in the inventory.


public class Car {

    private String name;
    private String model;
    private int years;
    private int price;
    private String vinNumber;

    public Car(){

    }
    public Car(String name){
        this.name=name;
    }
    public Car(String name, String model,int years,int price,String vinNumber){
        this(name);
        this.model=model;
        this.years=years;
        this.price=price;
        this.vinNumber=vinNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYears(){
        return years;
    }
    public void setYears(int years){
        this.years=years;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getVinNumber(){
        return vinNumber;
    }
    public void setVinNumber(String vinNumber){
        this.vinNumber=vinNumber;
    }







}
