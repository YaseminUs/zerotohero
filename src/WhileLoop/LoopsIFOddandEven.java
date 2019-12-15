package WhileLoop;

public class LoopsIFOddandEven {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 15;
        while (num1 <= num2) {

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }
    }
}