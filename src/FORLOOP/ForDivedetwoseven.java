package FORLOOP;

public class ForDivedetwoseven {
    public static void main(String[] args) {
        //Using scanner enter two number 1 - 100.
        // Print all the numbers between 1 to 100 which we can divide with 2 and 7 at the same time.
        // For example 14 is this kind number

//        int num1 = 1;
//        int num2 = 100;
//        int sum = 0;
//        for (int i = 1; i < 100; i++) {
//            if (num1 % 2 == 0) {
//                sum = sum / 2;
//            }
//            System.out.println("number divided by 2 and 7 " + i);
//        }
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println(i + " ,");
            }

        }

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                System.out.println(i + " ,");
            }
        }

    }
}