package FORLOOP;

public class ForLoopHours {
    public static void main(String[] args) {

        //int hour;
        //int mint;
        for (int hour = 2; hour <= 4; hour++) {
            System.out.println(hour);
            for (int mint = 1; mint<=60; mint++) {
                System.out.print(mint+ "-");

            }
            System.out.println();


        }


    }
}