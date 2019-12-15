package Methods;

public class methodsCar {

    String color;
    String model;
    String brand;
    double engine;
    int door;
    int year;
    int price;
    double amount;

    public void carinfo(){
        System.out.println("color is: " + color);
        System.out.println("mode is: " + model);
        System.out.println("brand is: " + brand);
        System.out.println("engine is: " + engine);
        System.out.println("door is: " + door);
        System.out.println("year is: " + year);
        System.out.println("price is: " + price);

    }

    public void model(){
        System.out.println("my car is: " + model);
    }

    public void  Color() {
        System.out.println("my car is: " + color);

    }
    public double amount(double yearlyamount){
        amount=yearlyamount;
        return amount;
    }


    public void  Brand() {
        System.out.println("my car is: " + brand);

    }
    public double Engine() {
        return engine;
    }
    public void Door() {
        System.out.println("my car is: " + door);

    }

    public int Year() {
        return year;

    }
    public int Price() {
        return price;

    }

    public  int changePrice(int newPrice) {
        price = newPrice;
        return Price();

    }

    public static void main(String[] args) {

        methodsCar mycar = new methodsCar();
        mycar.model = "Nissan";
        mycar.year = 2007;
        mycar.color="gray";
        mycar.price = 10000;
        mycar.door=4;
        mycar.brand="quest";
        mycar.engine=6;
        mycar.amount(2000);
        mycar.changePrice(5000);
        mycar.carinfo();


    }









    }



