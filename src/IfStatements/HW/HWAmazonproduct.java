package IfStatements.HW;

import java.util.Scanner;

public class HWAmazonproduct {

    public static void main(String[] args ){

        Scanner input=new Scanner(System.in);
        System.out.println("enter product price : ");
        int ProductPrice=input.nextInt();
        System.out.println("enter product review number :");
        int review=input.nextInt();
        System.out.println("enter product stars rate : ");
        int starsrate=input.nextInt();
        if(ProductPrice<50 && review>200 && starsrate>4 ){
            System.out.println("Product on the first page  ");
        }else if(ProductPrice>50 && review >200 && starsrate>4){
            System.out.println("Product on the second page ");
        }else if(ProductPrice>50 && review < 200 && starsrate>4){
            System.out.println("Product on the third page ");
        }else if(ProductPrice>50 && review < 200 && starsrate<4 ||starsrate>2 ){
            System.out.println("Product on the fourth page ");
        }else{
            System.out.println("remove product from amazon ");
        }


    }
}
