package Homework;

public class HWFor1Tree {
    public static void main(String[] args) {
//
//        for (int i = 0; i <= 6; i++) {
//            System.out.println();
//            for (int n = 1; n <= i; n++) {
//                System.out.print('1');
//            }
//        }


        for (int i = 0; i <= 6; i++) {
            for (int n = 6; n >= i; n--) {
                System.out.print('1'+ " ");
            }
            System.out.println();
        }

        for (int row = 1; row <= 5; row++) {
            System.out.println();
            for (int column = 1; column <= row; column++) {

                System.out.print(column +" ");
            }
        }
        for(int i=5; i>=1;i--){
             System.out.println();
             for (int j=1; j<=i; j++){
                 System.out.print('A'+ " ");
             }

         }
         for(int i=1; i<=6; i++){
             System.out.println();
             for(int k=6; k>=i; k--){
                 System.out.print('k');
             }
         }
         for(int i=1; i<=6; i++){
             System.out.println();
             for(int m=6; m>=i; m--){
                 System.out.print('m');
             }
         }
        for(int i=1; i<=6; i++){
            System.out.println();
            for(int t=1; t<=i; t++){
                System.out.print('t');
            }
        }















    }
}
