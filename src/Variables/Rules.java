package Variables;

public class Rules {
    public static void main(String[] args){


        System.out.println(10 * 5 + 100 * (25 * 11) / (25 * 10) * 10 - 5 + 7 % 2);
        int zx = (10 * 5 + 100 * (25 * 11));
        /* 50+100*275
        41250
        */

        int yz = ((25 * 10) * 10 - 5 + 7 % 2);
        /*
        250*10-6
        2494
        */

        int x = 15;
        int y = x % 4;
        int z = y * 24;
        System.out.println(z / 2);

        int a = 0152;
        a *= --a / 2 * 2;
        System.out.println("a=" + a);

        System.out.println(zx / yz);



    }
}
