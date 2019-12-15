package interviewQuestion;

public class PyramidPattern {
    public static void main(String[] args) {


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("============");

        for (int i = 1; i <= 6; i++) {
            for (int k = i; k <= 6; k++) {
                System.out.print("* ");
            }
            System.out.println();
            // String star = "*";
            //        for(int i=1;i<=5;i++){
            //            for(int j=i;j<=5;j++){
            //                System.out.print("* ");
            //            }
            //            System.out.println();
        }
        System.out.println("============");

        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("==========");

        for (int n = 1; n <= 6; n++) {
            for (int m = n; m <= 6; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        String star = "*";
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===============");


        for(int i=0;i<=5;i++){
            for(int y=0;y<=5-i;y++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int y=0;y<=5-i;y++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
            System.out.println();

        }


    }
}




