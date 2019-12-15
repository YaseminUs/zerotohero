package Arrays;

import java.util.Arrays;

public class ArraysCalisma {
    public static void main(String[] args) {

    int[] number={3,5,7,8,1,9};

        System.out.println(number[1]);
        System.out.println(number[0]);
        System.out.println("dizi boyutu "+ number.length);
        System.out.println(Arrays.toString(number));
        Arrays.sort(number); //kucukten buyuge siralama yapar
        System.out.println(Arrays.toString(number));
        int index=Arrays.binarySearch(number,9);
        System.out.println("9 in indexi : "+ index);


//        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
//        dizimizi direk konsola yazdırabilmek için Arrays.toString() kullanılır
//        Arrays.sort(liste);
//        System.out.println(Arrays.toString(liste));
//
//        Dizide bir elemanın indeksini bulmak için Arrays.binarySearch() kullanırız
//                !!!!! Arrays.binarySearch() kullanabilmemiz için dizimiz SIRALI olmalıdır. !!!!
//                Eğer sıralı değilse Arrays.sort ile sıralayabilirsiniz
//                int indexx = Arrays.binarySearch(liste,5); //bulunduğu indeksi döner,aradığımız sayı dizide mevcut değilse negatif bir sayı döner
//                System.out.println("5'in indeksi :"+index);

        int[] list1 = {1, 5, 52};
        int[] list2 = {1, 5, 52};
        int[] list3 = {1, 5, 53};

        //İki dizi birbirinin aynısı olup olmadığını kontrol etmek için Arrays.equals() metotu kullanılır
        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false

        //1-100
        int [] sayi = new int[10];//uzunluğu 10 olan diziyi oluşturduk

        for (int i = 0; i < sayi.length ; i++) {
            sayi[i] = (int)(Math.random()*100); //tek tek değer atıyoruz
        }

        for (int i = 0; i < sayi.length ; i++) {
            System.out.println(sayi[i]); // Tüm değerleri tek tek yazdırıyoruz
        }


        int [] num = new int[100]; //Uzunluğu 100 olan diziyi oluşturduk
        for (int i = 0; i < num.length ; i++) {
            num [i] = (int)(Math.random()*1000); //Tüm elemanlarına 0-999 arasında değerler atıyoruz
        }

        int indexx = 0; //başlangıç değerleri
        int max = 0; //başlangıç değerleri

        for (int i = 0; i < num.length ; i++) {
            if(num[i] > max){ //max sayıdan büyük ise
                max = num[i]; //max sayı değiştiriliyor
                indexx = i; //ve index alınıyor
            }
        }
        System.out.println("En büyük sayı: "+max+" index: "+indexx);


        int [] numbers={10,20,30,40,50,60,70,80,90};
        for(int numbr:numbers){
             System.out.print(numbr+ " ");
         }
        System.out.println("--------");
        String[] meyveler={"Portakal", "Elma", "Armut", "Çilek"};

        for(String meyve:meyveler){
            System.out.print(meyve + " ");
        }

        int[] sayilar=new int[100];
        for(int i=0;i<=sayilar.length; i++){
            for(int sayim:sayilar){
                if(sayim>max){
                    max=sayim;
                }
            }

        }

        System.out.println("En büyük sayı: "+max);


    }

}




