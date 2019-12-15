package MyPractice;

public class RestaurantTest {
    public static void main(String[] args) {
//        Restaurant restaurant=new Restaurant();
//        restaurant.name="Bahamas";
//        restaurant.location="Schaumburg";
//        restaurant.bestmeal="Salmon Tostado";
//        restaurant.price=20;
//        restaurant.rate=4;
//        restaurant.mealName("Salmon Tostado");
//        restaurant.mealName(restaurant.bestmeal);
//        restaurant.restaurantName(restaurant.name);
//        restaurant.star(4,100);
//        restaurant.priceOf(15);
//        System.out.println("****************");
//        restaurant.mealName("Salmon");
//        restaurant.place("Schaumburg");
//        System.out.println("-------------");
//
//
//        Restaurant restaurant1=new Restaurant("Chesee Cake","Schaumburg","Godiva Chesee cake",20,5);
//        restaurant1.priceOf(30);
//        restaurant1.star(3,70);


        Restaurant restaurant1 = new Restaurant("Cheesecake Factory", "Schaumburg", "Godiva Cheseecake", 20, 5);
        System.out.println(restaurant1.getName());
        System.out.println(restaurant1.getLocation());
        System.out.println(restaurant1.getBestmeal());
        System.out.println(restaurant1.getPrice());
        System.out.println(restaurant1.getRate());

        Restaurant restaurant2 = new Restaurant() ;
        restaurant2.setName("Bahamas");
        System.out.println(restaurant2.getName());

        restaurant2.setLocation("Golf rd.");
        System.out.println(restaurant2.getLocation());

        restaurant2.setBestmeal("Salmon Tostado");
        System.out.println(restaurant2.getBestmeal());

        restaurant2.setPrice(12.5);
        System.out.println(restaurant2.getPrice());

        restaurant2.setRate(4);
        System.out.println(restaurant2.getRate());

        }
    }

