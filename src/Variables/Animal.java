package Variables;

public class Animal {

    public static void main(String[] args){

     /*
      in Farm we have 23 cow and 42 chicken
      Calculate the total number of leg in this farm
      ** One cow price is $2000
      ** One chicken price is $20
      calculate total price for all animals in the farm
      */

            int COW=23;
            int CHICKEN=42;
            int TOTALLEG=COW*4 +CHICKEN*2;
            System.out.println("total leg " +TOTALLEG);

            int CowPrice=2000*23;
            int ChickenPrice=20*42;
            int TotalPrice=CowPrice +ChickenPrice;
            System.out.println("Total pirice to animal " + TotalPrice);



            int cow=23;
            int chic=42;

            int cowleg=(23*4);
            int chicleg=(42*2);
            int totalleg=cowleg+chicleg;

            System.out.println(totalleg);

            System.out.println("total Number of legs is: "+ totalleg);


            // parantez icine almazsan sadece cow ile chic in adedini yaziyor 2342
            //parantez icine alirsan islemi gerceklestiriyor
            //toplama yapiyorsan parantez icinde carpma yapiyorsan paranteze gerek yok


            System.out.println("Animal" +(cow +chic));

            System.out.println("Animal" + cow*chic);

            //Animal 65
            //Animal 2342

            int cowprice=cow*2000;
            int chicprice=chic*20;
            int totalprice=cowprice+chicprice;

            System.out.println("total cow and chic price is: $ "  +(totalprice));



        }
}

