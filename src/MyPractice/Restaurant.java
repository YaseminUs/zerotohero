package MyPractice;

public class Restaurant {

    private String name;
    private String location;
    private String bestmeal;
    private double price;
    private int rate;

    public Restaurant(){

    }

    public Restaurant(String name, String location,double price){
        this.name=name;
        this.location=location;
        this.price=price;
    }
    public Restaurant(String name, String location, String bestmeal, double price, int rate) {
        this(name,location,price);

    this.bestmeal=bestmeal;
    this.rate=rate;
    }

    public void restaurantName(String name) {
        place(location);
        System.out.println("My restaurant name is: " + name);
    }

    public void place(String location) {
        System.out.println("Restaurant location at : " + location);
    }

    public void mealName(String bestmeal) {
        restaurantName(name);
        System.out.println("The bestmeal of the restaurant is: " + bestmeal);
    }

    public void priceOf(double price) {
        if (price <= 40) {
            System.out.println("Please give an order...");
        } else {
            System.out.println("Dont give an order...");
        }
    }

    public void star(int rate, int review) {
        if (rate >= 4 && review >= 100) {
            System.out.println("You can go to the restaurant");
        } else {
            System.out.println("You can not go to the restaurant ");
        }
    }
        public void setName(String name){
        this.name=name;
    }
        public String getName(){
        return name;
        }
        public void setLocation(String location){
        this.location=location;
        }
        public String getLocation(){
        return location;
        }
        public void setBestmeal(String bestmeal){
        this.bestmeal=bestmeal;
        }
        public String getBestmeal(){
        return bestmeal;
        }
        public void setPrice(double price) {
        this.price = price;
        }
        public double getPrice() {
        return price;
        }
        public void setRate(int rate) {
        this.rate = rate;
        }
        public int getRate() {
        return rate;
        }
    }


