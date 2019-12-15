package Arrays;
import java.util.Arrays;

public class ArrayCalisma {
    public static void main(String[] args) {
        String[][] cars = {{"Volvo", "BMW", "Ford"}, {"Mercedes", "Honda", "Mazda"}};
        System.out.println(Arrays.deepToString(cars));
        System.out.println(cars[0].length + " " + cars[1].length);
        for (int i = 0; i < cars.length; i++) {
            int total = cars[i].length;
            System.out.print(total + " ");

//            for (int k = 0; k < cars.length; k++) {
//                if (cars[k].equals(5)) {
//                    System.out.println(cars[k]);
//                }

            for (String[] brands : cars) {
                for (String brands2 : brands) {
                    if (brands.equals(5)) {
                        System.out.print(brands + " -");
//
//                }
//
//            }
                    }
                }


            }

        }
    }}