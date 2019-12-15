package StaticPractice;

public class CatTest {
    public static void main(String[] args) {
        Cat dodo = new Cat();
        Cat prenses = new Cat();
        System.out.println(dodo.kitKab);
        System.out.println(prenses.kitKab);
        System.out.println(Cat.meowMix);

        //dodo ate 2 kg meowMix
        Cat.eatMix(2);
        Cat.eatMix(8);

        dodo.eatKit(6);
        System.out.println(dodo.kitKab);
        prenses.eatKit(5);
    }
}
