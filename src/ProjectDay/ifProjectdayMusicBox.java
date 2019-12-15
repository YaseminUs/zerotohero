package ProjectDay;

import java.util.Scanner;

public class ifProjectdayMusicBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What kind of music types ? Available music Classical,pop,and Country ");
        String musictype = input.nextLine();
        if (musictype.equalsIgnoreCase("classical")) {

            System.out.println("Available songs are:Four seasons,Fur Elise ,Vocalise,The planet,Finlandia ");
            String classicalsongs = input.nextLine();

            if (classicalsongs.equalsIgnoreCase("Four season")) {

                System.out.println("please enter $2 ");
                double moneyone = input.nextDouble();
                if (moneyone == 2) {
                    System.out.println("Four season is playing now.Enjoy the music ");
                }

                if (moneyone < 2) {
                    System.out.println("Entered money is not enough, please try again ");
                }
                if (moneyone > 2) {
                    System.out.println("you enter $ " + (moneyone - 2) + " more: please wait for change. Enjoy song Four season ");
                }
                }else if(classicalsongs.equalsIgnoreCase("any songs")){

                System.out.println("Selected song is not available");
            }else{
                System.out.println("Type of music not available ");{

                }

                }



            }
            }
//            if (classicalsongs.equalsIgnoreCase("Fur Elise")) {
//
//                System.out.println("please enter $2 ");
//                double moneyone = input.nextDouble();
//                if (moneyone == 2) {
//                    System.out.println("Fur Elise is playing now.Enjoy the music ");
//                }
//
//                if (moneyone < 2) {
//                    System.out.println("Entered money is not enough, please try again ");
//                }
//                if (moneyone > 2) {
//                    System.out.println("you enter $ " + (moneyone - 2) + " more: please wait for change. Enjoy song Fur Elise ");
//                }
//            }
//            if (classicalsongs.equalsIgnoreCase("Vocalise")) {
//
//                System.out.println("please enter $2 ");
//                double moneyone = input.nextDouble();
//                if (moneyone == 2) {
//                    System.out.println("Vocalise is playing now.Enjoy the music ");
//                }
//
//                if (moneyone < 2) {
//                    System.out.println("Entered money is not enough, please try again ");
//                }
//                if (moneyone > 2) {
//                    System.out.println("you enter $ " + (moneyone - 2) + " more: please wait for change. Enjoy song Vocalise ");
//                }
//            }
//            if (classicalsongs.equalsIgnoreCase("Finlandia")) {
//
//                System.out.println("please enter $2 ");
//                double moneyone = input.nextDouble();
//                if (moneyone == 2) {
//                    System.out.println("Finlandia is playing now.Enjoy the music ");
//                }
//
//                if (moneyone < 2) {
//                    System.out.println("Entered money is not enough, please try again ");
//                }
//                if (moneyone > 2) {
//                    System.out.println("you enter $ " + (moneyone - 2) + " more: please wait for change. Enjoy song Finlandia ");
//                }
//            }
//        }
    }