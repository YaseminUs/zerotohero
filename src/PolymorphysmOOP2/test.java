package PolymorphysmOOP2;

import java.util.Collection;

public class test {
    public static void main(String[] args) {
        human h = new baby();
        h.eat();
        h.shave();
        h.walk();
        ((baby)h).crowl();
        ((dad)h).feed();

        System.out.println("=========");

        men m = new boy();
        m.playSport();
        ((boy)m).cry();
       // ((baby)m).cry(); exception can not cast
        ((human)m).humanMethod();

        System.out.println("=========");

        dad d = new baby();
        d.feed();
        ((boy)d).run();

        System.out.println("=========");



    }

}
