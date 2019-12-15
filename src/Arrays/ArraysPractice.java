package Arrays;

import java.util.Arrays;

public class ArraysPractice {
//    String[] stringListe = new String[10];
//    int[] intListe = new int[8];
//    double[] doubleListe = new double[18];
//    boolean[] boolList = new boolean[9];
//    char charListe[] = new char[10];

    public static void main(String[] args) {
        int[ ]number=new int[5];
        number[0]=1;
        number[1]=5;
        number[2]=10;
        number[3]=15;
        number[4]=20;

        System.out.println(Arrays.toString(number));
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number.length);

        System.out.println("***********");

        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
        System.out.println("------");
        int[] numbers = {1,2,3,4};//------sum
        int sum = 0;
        for( int i : numbers) {
            sum += i;
        }

        System.out.println(sum);

        int[] arr={3, 4, 5, 6, 7, 8};
        for(int i=0; i<arr.length;i++){
            System.out.println("arr in "+ i + " ci elemani : " + arr[i]);
        }
        String [] str={"Ali", "Baba ", "ve ","kirk", "haramiler "};
        for(int i=0;i<str.length;i++)
        System.out.println(str[i]);

        System.out.println("str nin 2. elemani " + str[3]+" str nin 4. elemani " + str[4]);


        String [] cars={"Volvo", "BMW", "Ford", "Mazda"};
        for(int i=0; i<cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.println("------");
        String[] car={"Volvo", "BMW", "Ford", "Mazda"};
        for (String i :car){
            System.out.println(i);
        }
        System.out.println("-----");


        int arry[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sums = 0;

        for (int i : arry)
            sums += i;
        System.out.println("The sum is " + sums);
    }
}










