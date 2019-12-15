package StaticPractice;



public class StaticReview {

    // method porpes it should be reusable
    static String name;

    {
        System.out.println("this is instance block");
    }

    static {
        System.out.println("this is static block");
    }

    static public void test() {
        // test1();
        System.out.println(name);
        System.out.println("This is static Method");
    }

    public void test1() {
        test();
        System.out.println(name);

        /*  Task
            (int a, int b)
            Create static method called add, substract, divide, multiply under static review
            import all the static methods and use the method without class name
         */
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subs(int x, int y) {
        //if x is bigger than y return x-y
        //if y is bigger than x then return y-x

        if (x > y) {
            return x - y;
        } else if (y > x) {
            return y - x;
        }
        return 0;
    }
        public static int divide ( int x, int y){
            return x / y;
        }



}