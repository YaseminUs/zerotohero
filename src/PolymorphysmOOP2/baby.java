package PolymorphysmOOP2;

public class baby extends boy {
    @Override
    public void eat(){
        System.out.println("baby is eating");
    }
    @Override
    public void cry(){
        System.out.println("baby is eating");
    }
    public void crowl(){
        System.out.println("baby is crawling");
    }
}
