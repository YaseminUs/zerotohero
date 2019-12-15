package FORLOOP;

public class ForLoopNumberTree {
    public static void main(String[] args) {


        // int j;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
        //int row = 5;


        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {

                System.out.print(column);
            }
            System.out.println();
        }

        for (int i = 0; i <= 6; i++) {
            System.out.println();
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
        }

        for (int row = 1; row <= 5; row++) {
            System.out.println();

            for (int column=1; column<=row; column++) {

                System.out.print(row);
            }


        }

    }
}